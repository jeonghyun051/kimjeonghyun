package ch15;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientEx {

	public static void main(String[] args) {
		BufferedReader in =null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);	//Ű���忡�� ���� scanner ��ü ����
		try {
			socket = new Socket("localhost",9999); //113.198.238.66 //Ŭ���̾�Ʈ ���� ����, ������ ���� ipv4
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //���� �Է� ��Ʈ��
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); //���� ��� ��Ʈ��
			while (true) {
				System.out.print("������>>");	//������Ʈ
				String outputMessage = scanner.nextLine();	//Ű���忡�� �� �� �б�
			
				if(outputMessage.equalsIgnoreCase("bye")){	//bye���ڿ� ����
					out.write(outputMessage+"\n");
					out.flush();
					break;
			}
			out.write(outputMessage+"\n");	//Ű���忡�� ���� ���ڿ� ����
			out.flush();	//out�� ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
			String inputMessage = in.readLine();	//�����κ��� �� �� ����
			System.out.println("���� : " + inputMessage);
		}
	} catch (IOException e) {
			System.out.println(e.getMessage());
	}finally {
			try {
				scanner.close();
				if(socket != null) socket.close();
			} catch (IOException e) {
				System.out.println("������ ä�� �� ������ �߻��߽��ϴ�.");
			}
		}

	}

}
