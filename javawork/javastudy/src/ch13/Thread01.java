package ch13;

//class Another extends Thread �� ���ų� �ؿ��Ÿ� ���ų�
class Another implements Runnable { //Runnable Ÿ���� �Ǿ�� ��. run�� ������ run�� ������
	
	//������� �ڵ��� = ����(������)
	@Override
	public void run() {
		System.out.println("���ο� ������ �����");
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("run : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���ο� ������ ����");
	}
}

public class Thread01 {

	public static void main(String[] args) {
		
		System.out.println("main ������ �����");
		
		//���ο� ������ ����
		//��Ģ 1. ������ ��ü�����
//		Thread t1 = new Thread();
		
		//��Ģ 2. Ÿ�� ����
		Thread t1 = new Thread(new Another());
		//��Ģ 3. ����
		t1.start();
		
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("main : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("main ������ ����");
	} //end of main()
}
