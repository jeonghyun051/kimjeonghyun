package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {

	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader reader;
	private PrintWriter writer;

	public ServerEx2() {

		try {
			serverSocket = new ServerSocket(10000);
			System.out.println("클라이언트 응답 대기중");
			socket = serverSocket.accept();
			System.out.println("클라이언트 접속");

			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream(), true);

			String input = null;
			while ((input = reader.readLine()) != null) {

				System.out.println("클라에서 보낸 문자 : " + input);

				writer.println(input);

			}

			reader.close();
			socket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		new ServerEx2();

	}

}
