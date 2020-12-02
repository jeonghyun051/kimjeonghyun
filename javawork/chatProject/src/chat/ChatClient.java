package chat;

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

import com.google.gson.Gson;

import protocol.Chat;
import protocol.RequestDto;

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
		File file = new File("D:\\down\\output.text");

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
		setTitle("ä�� �ٴ�� Ŭ���̾�Ʈ");
		setSize(350, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // ���

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

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				text();
				System.exit(0);
			}
		});

	}

	private void send() {
		String chat = tfChat.getText();

		// 1�� taChatList �Ѹ���
		taChatList.append("[�� �޽���] " + chat + "\n");

		// ALL:�ȳ�, MSG:ssar1:�ȳ�
//			String keyboard = sc.nextLine();
		// json���� �Ľ�

		// 2�� ������ ����
		writer.println(chat);
		writer.flush();

		// 3�� tfChat����
		tfChat.setText("");
	}

	private void connect() {
		String host = tfHost.getText();
		try {
			socket = new Socket(host, 10000);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// �д°͸� ���ο� ������ ,������ ���°� ������
			writer = new PrintWriter(socket.getOutputStream(), true); // flush
			ReaderThread rt = new ReaderThread();
			rt.start();

		} catch (Exception e1) {

			System.out.println(TAG + "���� ���� ����" + e1.getMessage());
		}
	}

	class ReaderThread extends Thread {

		// while�� ���鼭 �����κ��� �޽����� �޾Ƽ� taChatList�� �Ѹ���
		@Override
		public void run() {
			try {
				while (true) {
					String input = null;
					if ((input = reader.readLine()) != null) {
						taChatList.append("[���� �޽���] " + input + "\n");
					}
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