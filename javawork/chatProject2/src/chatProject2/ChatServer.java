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
	private Vector<ClientInfo> vc; // 연결된 클라이언트 클래스(소켓)을 담는 컬렉션

	private Socket socket;

	public ChatServer() {

		try {
			vc = new Vector<ClientInfo>();
			serverSocket = new ServerSocket(10000);
			System.out.println(TAG + "클라이언트 연결 대기중");

			// 메인스레드의 역할
			while (true) {

				socket = serverSocket.accept();
				System.out.println("연결됨");
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
		PrintWriter writer; // BufferedWriter와 다른 점은 내려쓰기 함수를 지원

		public ClientInfo(Socket socket) {
			this.socket = socket;
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream());

			} catch (Exception e) {
				System.out.println("서버 연결 실패" + e.getMessage());
			}
		}

		// 역할 : 클라이언트로 부터 받은 메시지를 모든 클라이언트에게 재전송한다.
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
				System.err.println(socket + " 끊어짐");

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

//	인터페이스 all
//	파일만들어서
//	벡터에있는거 다 가져와서 파일에 집어넣기(x버튼눌러서 창을 끌때 파일로 저장하기)
//	클라채팅사진두개 파일에담긴 채팅내역까지 스샷해서

	public static void main(String[] args) {

		new ChatServer();
	}

}
