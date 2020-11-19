package ch03;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
//		System.out.println(fist +" "+ second+" "+  third);
		
		if (first > second && first > third) {
			if(second>third)
				System.out.println(second);
			else {
				System.out.println(third);
			}
		}
		
		if (second > first && second > third ) {
			if(first>third)
				System.out.println(second);
			else {
				System.out.println(third);
			}
			
		}
		
		if (third > second && third > first) {
			if(second>first)
				System.out.println(second);
			else {
				System.out.println(third);
			}
		}
	}

}
