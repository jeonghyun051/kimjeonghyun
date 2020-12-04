package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx2 {

	private Socket socket;
	private BufferedReader reader;
	private PrintWriter writer;

	public ClientEx2() {

		try {
			socket = new Socket("localhost", 10000);

			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());

			Scanner sc = new Scanner(System.in);

			while (true) {

				System.out.println("보낼문자");
				String text = sc.nextLine();
				writer.println(text);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		new ClientEx2();

	}

}
