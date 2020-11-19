package ch03;

public class For06 {

	static void starPrint(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
		}
	
	static void starPrint2(int num) {
		for (int i = 1; i > num; i--) {
			System.out.print("*");
		}
		System.out.println();
		}
	
		public static void main(String[] args) {
			
			for (int i = 1; i < 4; i=i+2) {
				for(int j=0;j<2-i;j++){
					System.out.print(" "); 
				}
				starPrint(i);	
			}
			
			for (int i = 0; i < 1; i++) {
				for(int j=0;j<1-i;j++){
					System.out.print(" "); 
				}
				starPrint2(i);	
			}
		}
}
