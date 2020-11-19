package ch03;

import javax.swing.plaf.basic.BasicFormattedTextFieldUI;

public class For02 {

	public static void main(String[] args) {
		//짝수 1 ~ 100
		for (int i = 1; i < 101; i++) {
			if (i%2 ==0) {
				System.out.println("2의배수 : " + i);
			}
			
		}
		
		//홀수 1~100
		for (int i = 1; i < 101; i++) {
			if(i%2 == 1) {
				System.out.println("홀수" + i);
			}
		}
		
		//50 ~ 1까지의 수 중 홀수 출력(내림차순)
		for (int i = 50; i > 0; i--) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		
	}

}
