package review;


//�ڹٴ� �Լ��� ������� ����.
//���ϱ� �Լ��� ����� ���� -> ���ϱ� �Լ� ������� Ŭ������ �ʿ���.

interface A{
	void add();
}

public class Ex121 {

	public static void main(String[] args) {
		new A() {
			
			@Override
			public void add() {
				System.out.println("���ϱ�");
				
			}
		}.add();

	}

}