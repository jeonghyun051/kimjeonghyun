package ch02;

public class Var02 {

	public static void main(String[] args) {
		//Code�κ�
		int num = 10; //4Byte - 32bit - 42�� 9õ
		
		long num2 = 100; //8Byte
		 
		char s = '��'; // 2Byte �߱��� ����x ���ڿ� ����x

		double d = 7.5; // 8Byte 42��9õ(-20��~ +20��)�߰� �Ҽ��� ����
		
		boolean b = true; // 1bit
		
		num = (int)d; //����� ����ȯ (�ٿ� ĳ����) �ڷᰡ ���� //7
		
		num = (int)num2; //����� ����ȯ�� �ؾ� ������ ���� (�ٿ� ĳ����) 
						 //long���� int�� �۱� ������
		
		num2 = num; //������ ����ȯ (�� ĳ����) num2 long�� �� Ŀ��
	}	//end of main

}
