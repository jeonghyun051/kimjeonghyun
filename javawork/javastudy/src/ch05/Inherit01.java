package ch05;

//1. ����� ���� �޴� �ǹ�(���������� �ؾ���)
//

class Father{
	int money = 10000;
}

class Son extends Father{
	int money = 20000;
	
}



public class Inherit01 {
	
	
	public static void main(String[] args) {
		Son s = new Son();  //�������� �ΰ� ������� , son father �Ѵ� �� son�� �����
								// s�� �տ� �ִ¾ָ� ����Ŵ
		
		//1�� ������ ã�� �� ������ ������ �� ������ ���
		//������ ������ �θ� ã�� �ö� ����.
		System.out.println(s.money); //son�� �Ӵϰ� ��� Ÿ�� �ö�
		
		//2�� new�� �ϸ� father �� son�� heap�� ���.
		//������ �����ڴ� son�� ȣ���� �ȴ�.
		//����Ű�� �޸� �ּҴ� Ÿ���� ���󰣴�.
		Father f = new Son();
		System.out.println(f.money);
		
		
	}
}
