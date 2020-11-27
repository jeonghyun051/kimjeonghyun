package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
import java.util.Scanner;

public class MyClientSocket2 {

	private Socket socket;
	private Scanner sc;
	private BufferedWriter writer;
	private BufferedReader reader;
	
	public MyClientSocket2() {
		try {
			socket = new Socket("113.198.238.67",10000);
			
			//Ű����� �Է¹޾Ƽ�
			sc = new Scanner(System.in);
			
			//���Ͽ� ���� �ޱ� ���¹�
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//���߿� �������� �ȵ������� ����Ŭ�������� ���Ἥ ���� private ����
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//�̰Ŵ� �͸�Ŭ���� newThread(new Run).statr(); �� ctrl + space
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					String input = null;
					try {
						while((input = reader.readLine()) != null) {
							System.out.println("�����κ��Ϳ� �޽��� : " + input);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}).start();
			
			//���� ������� Ű����κ��� �Է��� ���� �� Ŭ���̾�Ʈ���Ͽ� ����
			while (true) {
				String input = sc.nextLine(); //���ڿ� �ޱ�
				//������ ����
				writer.write(input + "\n");
				writer.flush(); // ������ �ȴ�.
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {

		new MyClientSocket2();
	}

}
