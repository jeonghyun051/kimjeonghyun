package ch03;

import java.util.Scanner;

public class Gugudan01 {

	public static void main(String[] args) {
		//구구단 2단을 출력하는 프로그램 만들어주세요!!
		// 2*1=1
		// 2*2=4
		
//		int n1 = 1;
//		
//		n1++;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("dd");
//		int n1 = sc.nextInt();
//		for (int i = 1; i < 9; i++) {
//			System.out.println(n1+"*"+i+"="+(n1*i));	
//		}
		
		
		for (int n1 = 2; n1 < 10; n1++) {
			for (int i = 1; i < 9; i++) {
				System.out.println(n1+"*"+i+"="+(n1*i));	
			}
		}
		
	}

}
