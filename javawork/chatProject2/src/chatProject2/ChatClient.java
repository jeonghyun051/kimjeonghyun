package chatProject2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.EventHandler;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame {

	private final static String TAG = "";
	private ChatClient chatClient = this;

	private JButton btnConnect, btnSend;
	private JTextField tfHost, tfChat;
	private JTextArea taChatList;
	private ScrollPane scrollPane;

	private static final int PORT = 10000;

	private JPanel topPanel, bottomPanel;

	private Socket socket;
	private PrintWriter writer;
	private BufferedReader reader;

	public ChatClient() {

		init();
		setting();
		batch();
		listener();
		setVisible(true);
	}

	private void text() {
		File file = new File("D:\\workspace\\output.txt");

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(taChatList.getText());
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void init() {
		btnConnect = new JButton("connect");
		btnSend = new JButton("send");
		tfHost = new JTextField("127.0.0.1", 20);
		tfChat = new JTextField(20);
		taChatList = new JTextArea(10, 30);
		scrollPane = new ScrollPane();
		topPanel = new JPanel();
		bottomPanel = new JPanel();

	}

	private void setting() {
		setTitle("채팅 다대다 클라이언트");
		setSize(350, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // 가운데

		taChatList.setBackground(Color.orange);
		taChatList.setForeground(Color.blue);

	}

	private void batch() {
		topPanel.add(tfHost);
		topPanel.add(btnConnect);
		bottomPanel.add(tfChat);
		bottomPanel.add(btnSend);
		scrollPane.add(taChatList);

		add(topPanel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);

	}

	private void listener() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				JFrame frame = (JFrame) e.getWindow();
				frame.dispose();
				File f = new File("D:\\workspace\\output.txt");
				try {
					String AreaText = taChatList.getText();
					FileWriter fw = new FileWriter(f);
					fw.write(AreaText);
					fw.close();
				} catch (Exception e2) {
					System.out.println(TAG + "파일 저장 실패");
				}
				System.out.println("파일 저장 종료");
			}
		});
		btnConnect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect();
				btnConnect.setEnabled(false);
			}
		});

		btnSend.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				send();

			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				text();
				System.exit(0);
			}
		});

	}

	private void connect() {
		String host = tfHost.getText();
		try {
			socket = new Socket(host, PORT);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 읽는것만 새로운 스레드 ,메인은 쓰는거 스레드
			writer = new PrintWriter(socket.getOutputStream(), true); // flush
			ReaderThread rt = new ReaderThread();
			rt.start();

		} catch (Exception e1) {

			System.out.println(TAG + "서버 연결 에러" + e1.getMessage());
		}
	}

	private void send() {
		String chat = tfChat.getText();

		// 1번 taChatList 뿌리기
		taChatList.append("[내 메시지] " + chat + "\n");
		// 2번 서버로 전송
		String input = tfChat.getText();
		writer.println(input);
		writer.flush();

		// 3번 tfChat비우기
		tfChat.setText("");

	}

	class ReaderThread extends Thread {

		// while을 돌면서 서버로부터 메시지를 받아서 taChatList에 뿌리기
		@Override
		public void run() {
			try {
				while (true) {
					String input = null;
					if ((input = reader.readLine()) != null) {
						taChatList.append("[상대방 메시지] " + input + "\n");
					}
					System.out.println("출력");
				}
			} catch (IOException e) {
				System.out.println(TAG + "안됨");
			}

		}
	}

	public static void main(String[] args) {

		new ChatClient();
	}
}