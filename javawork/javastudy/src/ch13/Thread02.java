package ch13;

class NewThread extends Thread{
	@Override
	public void run() {
		// 
		super.run();
	}
}
public class Thread02 {

	public static void main(String[] args) {
		//1.������ ��ü����
		
		//2.Ÿ�� ����
		
		//3.����
		
		Thread t1 = new Thread(new NewThread());
		t1.start();
	
		NewThread t2 = new NewThread();
		t2.start();
	}
}