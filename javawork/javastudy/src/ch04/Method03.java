package ch04;

class Cal{ //����
	
	static void add (int n1,int n2) {   //n1 n2�� ���ú��� �������� add�� static�� �̸��� ��
										//�޼��尡 ȣ��Ǹ� ������ ���� 
		System.out.println(n1+n2);
	}
	
	static int minus(int n3, int n4) {  //���������� �޼��尡 ������ �����
		return n3-n4;
	}
}

public class Method03 {

	public static void main(String[] args) {
		
	Cal.add(5,6);	//new hip���� ��������  static ��������
		
	int result = Cal.minus(10,4);
	//minus�Լ��� returnŸ���� int�̱� ������
	//Cal.minus(10,4)�� ȣ��� �� �޼��尡 ����Ǹ�
	//Cal.minus(10,4)--> 6���� ����ȴ�.
	System.out.println(result);
	
	Cal.minus(10, 4); //ȣ���Ѽ��� return �� ���� �޾Ƽ� 6
	
		
	}

}
