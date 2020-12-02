package chatProject2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.io.BufferedReader;
import java.io.FileOutputStream;
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

		btnConnect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connect();

			}
		});

		btnSend.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				send();

			}
		});

	}

	private void send() {
		String chat = tfChat.getText();

		// 1번 taChatList 뿌리기
		taChatList.append("[내 메시지] " + chat + "\n");
		try {
			OutputStream output = new FileOutputStream("D:/workspace/Output.txt");
			String str = taChatList.getText();
			byte[] by = str.getBytes();
			output.write(by);

		} catch (Exception e) {

		}
		// 2번 서버로 전송
		writer.println(chat);
		writer.flush();

		// 3번 tfChat비우기
		tfChat.setText("");

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

	class ReaderThread extends Thread {

		// while을 돌면서 서버로부터 메시지를 받아서 taChatList에 뿌리기
		@Override
		public void run() {
			try {
				while (true) {
					taChatList.append(reader.readLine() + "\n");
					taChatList.transferFocus();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		new ChatClient();
	}
}
