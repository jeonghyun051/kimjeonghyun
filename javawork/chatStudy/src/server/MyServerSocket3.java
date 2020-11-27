package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MyServerSocket3{
	
	private Socket socket;
	private ServerSocket serverSocket;
	private Vector<SocketThread> vc;
	
	public MyServerSocket3() {
		
		try {
			serverSocket = new ServerSocket(10000);
			vc = new Vector<>();
			
			while(true) {
				System.out.println("���� ������Դϴ�...");
				socket = serverSocket.accept();
				System.out.println("��û����");	
				SocketThread st = new SocketThread(socket);
				st.start();
				vc.add(st);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	class SocketThread extends Thread{
		Socket socket;
		String id;
		BufferedReader reader;
		PrintWriter writer;
		
		public SocketThread(Socket socket) {
			this.socket=socket;
		}
	
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream(),true);
				String line = null;
				while ((line = reader.readLine()) != null)  {
					System.out.println("from client : " + line);
					for (SocketThread sockThread : vc) {
						sockThread.writer.println(line);
					}
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}	
	}

	public static void main(String[] args) {
		new MyServerSocket3();
	}
}