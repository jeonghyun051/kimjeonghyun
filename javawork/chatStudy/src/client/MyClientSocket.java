package client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.*;
import java.util.Scanner;

public class MyClientSocket {

	private Socket socket;

	public MyClientSocket() {
		try {
			socket = new Socket("127.0.0.1",10000);
			
			//키보드로 입력받아서
			Scanner sc = new Scanner(System.in);
			
			//소켓에 버퍼 달기 쓰는법
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
			while (true) {
				String input = sc.nextLine(); //문자열 받기
				//서버에 전송
				bw.write(input + "\n");
				bw.flush(); // 전송이 된다.
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		new MyClientSocket();
	}

}
