package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {

	private ServerSocket serverSocket;
	private Socket socket;
	
	public MyServerSocket() {
		try {
		
			//1.서버소켓만들기
			serverSocket = new ServerSocket(10000);
			System.out.println("클라이언트 요청 대기 중");
			socket = serverSocket.accept();	//데몬(리스닝) 
			System.out.println("요청이 성공함");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String input = null;
			while ((input = reader.readLine()) != null) {
				System.out.println("클라이언트 메시지" + input);
				
			}
			reader.close();
			socket.close();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		new MyServerSocket();
	}
}