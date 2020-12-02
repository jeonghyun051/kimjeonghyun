package chatProject2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import com.google.gson.Gson;

import protocol.Chat;
import protocol.RequestDto;

public class ChatServer {

	private static final String TAG = "ChatServer:";
	private ServerSocket serverSocket;
	private Vector<ClientInfo> vc; // ����� Ŭ���̾�Ʈ Ŭ����(����)�� ��� �÷���

	private Socket socket;

	public ChatServer() {

		try {
			vc = new Vector<ClientInfo>();
			serverSocket = new ServerSocket(10000);
			System.out.println(TAG + "Ŭ���̾�Ʈ ���� �����");

			// ���ν������� ����
			while (true) {

				socket = serverSocket.accept();
				System.out.println("�����");
				ClientInfo clientInfo = new ClientInfo(socket);
				clientInfo.start();
				vc.add(clientInfo);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	class ClientInfo extends Thread {

		Socket socket;
		BufferedReader reader;
		PrintWriter writer; // BufferedWriter�� �ٸ� ���� �������� �Լ��� ����

		public ClientInfo(Socket socket) {
			this.socket = socket;
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream());

			} catch (Exception e) {
				System.out.println("���� ���� ����" + e.getMessage());
			}
		}

		// ���� : Ŭ���̾�Ʈ�� ���� ���� �޽����� ��� Ŭ���̾�Ʈ���� �������Ѵ�.
		@Override
		public void run() {
			try {
				String data = null;
				while ((data = reader.readLine()) != null) {
					sendAllClient("" + data);
				}
				reader.close();

			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(socket + " ������");

			}

		}

		public void sendMessage(String msg) {
			writer.println(msg);
			writer.flush();
		}

		public void sendAllClient(String msg) {
			for (int i = 0; i < vc.size(); i++) {
				if (vc.get(i) != this) {
					ClientInfo clientInfo = vc.get(i);
					clientInfo.sendMessage(msg);
				}
			}
		}

	}

//	�������̽� all
//	���ϸ���
//	���Ϳ��ִ°� �� �����ͼ� ���Ͽ� ����ֱ�(x��ư������ â�� ���� ���Ϸ� �����ϱ�)
//	Ŭ��ä�û����ΰ� ���Ͽ���� ä�ó������� �����ؼ�

	public static void main(String[] args) {

		new ChatServer();
	}

}
