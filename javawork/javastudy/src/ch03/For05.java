package ch03;

public class For05 {

	static void starPrint(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
		}
	
	static void starPrint2(int num) {
		for (int i = 2; i > num; i--) {
			System.out.print("*");
		}
		System.out.println();
		}
	
		public static void main(String[] args) {
			
			for (int i = 0; i < 4; i++) {

				starPrint(i);	
			}
			
			for (int i = 0; i < 4; i++) {

				starPrint2(i);	
			}
		}
}
