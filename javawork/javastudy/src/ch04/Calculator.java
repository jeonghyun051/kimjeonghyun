package ch04;


//���� 10, 5�� ���ؼ�!
//�� ������� ���� 20�� ���ؼ� 
//�� ������� ���� 5�� ������ 
//�� ������� 100�� �� ���� ȭ�鿡 ����Ͻÿ�.
public class Calculator {

	//�������� ���ÿ� �ֱ⿡ ������ �ȳ���. �ʿ��Ҷ� ȣ���ϴϱ�
	static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	static int divid(int n1, int n2) {
		
		int result = n1 / n2;
		return result;
	}
	
	static int multi(int n1, int n2) {
		int result = n1*n2;
		return result;
		
	}
}
