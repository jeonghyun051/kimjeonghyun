package ch03;
//1번 for3 별을 5 4 3 2 1 거꾸로 만들기
//2번 1 2 3 2 1 별 만들기
//3번 

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
