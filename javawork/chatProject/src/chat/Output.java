package chat;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Output {
	public Output() {
		try {
			OutputStream output = new FileOutputStream("D:/workspace/Output.txt");
			String str = "dfsdf´Ù";
			byte[] by = str.getBytes();
			output.write(by);
			
		} catch (Exception e) {
			
		}

	}
	

	public static void main(String[] args) {
		 new Output();
	}
}
	