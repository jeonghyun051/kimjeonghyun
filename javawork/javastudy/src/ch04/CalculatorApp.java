package ch04;


//���� 10, 5�� ���ؼ�!
//�� ������� ���� 20�� ���ؼ� 
//�� ������� ���� 5�� ������ 
//�� ������� 100�� �� ���� ȭ�鿡 ����Ͻÿ�.



public class CalculatorApp {

	public static void main(String[] args) {
		Calculator a = new Calculator();
		int r = a.add(10, 5);
		
		int r1 = a.multi(r, 20);
		
		int r2 = a.divid(r1, 5);
		
		int r3 = a.minus(r2, 100);
		
		System.out.println(r3);
		
		
		

		
				
	}
}
