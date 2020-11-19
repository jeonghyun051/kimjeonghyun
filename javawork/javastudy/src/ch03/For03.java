package ch03;

public class For03 {

	static void starPrint(int num) {
	for (int i = 0; i < num; i++) {
		System.out.print("*");
	}
	System.out.println();
	}
	public static void main(String[] args) {
		
		for (int i = 0; i < 6; i++) {

			starPrint(i);	
		}
			
//		System.out.println("*");
//		System.out.println("**");
//		System.out.println("***");
//		System.out.println("****");
//		System.out.println("*****");
//		
		
	}

}
