package ch04;

//����ƽ�� ó������ ����, ����ƽ�� �ϳ� �ۿ� ����.

//�ڹ� Ư¡: ��� �ڵ�� class ���ο� �־� �Ѵ�.
public class method01 {
	
	//int num = 10;	//��
	//
	static int num3 = 30; //����ƽ�� ������ �߱����� ����
	
	static void add() {
		System.out.println("add�Լ� ȣ���");
	}
	
	void sound() {
		System.out.println("sound�Լ� ȣ���");
	}
	
	
	public static void main(String[] args) {
	
	//int num2 = 20; //����	
		
		method01.add();
		
		method01 m = new method01();  //static �ƴ� ���� ��
		m.sound();
	}

}
