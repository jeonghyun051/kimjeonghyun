package ch03;
//1�� for3 ���� 5 4 3 2 1 �Ųٷ� �����
//2�� 1 2 3 2 1 �� �����
//3�� 

public class For04 {

	static void starPrint(int num) {
	for (int i = 6; i > num; i--) {
		System.out.print("*");
	}
	System.out.println();
	}
	public static void main(String[] args) {
		
		for (int i = 0; i < 6; i++) {

			starPrint(i);	
		}
			
	}
}
