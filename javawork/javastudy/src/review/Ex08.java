package review;

public class Ex08 {

	//void�� ������ ����. add�� �����̸��̴�. ()�� �Լ���� ��
	//int n1 ,n2 �Ű�����(arguments)
	
	void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	

	int minus(int n1, int n2) {
		return n1-n2; //�Լ��� ȣ���� ������ ���� n1-n2�� �����
	}
	
	public static void main(String[] args) {

		//�Լ��� ȣ�� ���� ���� �� �ٽ� �������� ���ƿ� 
		Ex08 e = new Ex08();
		e.add(3, 6);	//3, 6�� �μ���� ��
		
		int result = e.minus(10, 5); //�Լ��� ȣ���� �������� �ٲ�
		System.out.println("result : " + result);
		
	
	}
}
