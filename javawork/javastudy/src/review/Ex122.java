package review;

class ����� {
	
	String data;
	
	String �ٿ�ε�() {
		data="GTA 5 ����";
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("������");
		} //1000=1��
		return data;
	}
}

//�ڹٿ����� �޼��带 �Լ��� �Ű������� ������ �� ����
//�ڹٴ� �޼��带 �Լ��� �Ű������� �����ϰ� ������ ������ �������̽���
//�Լ��� ��ƿ�
//�͸� Ŭ������ �ѱ��.
public class Ex122 {

	public static void main(String[] args) {

		����� s = new �����();
		String game = s.�ٿ�ε�();
		System.out.println(game + "����");
		
		new A() {
			
			@Override
			public void add() {
				System.out.println("���ϱ�");
				
			}
		}.add();
	}

}
