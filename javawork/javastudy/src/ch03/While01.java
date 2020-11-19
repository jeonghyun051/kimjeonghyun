package ch03;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//이런 프로그램을 데몬 daemon process - 대표적인게 웹서버
		int check = 0;
		while(check>=0) {
			int num = sc.nextInt();
			System.out.println("받은 값 : " + num);
			check = num;
			
//				if(num<0) {
//				break;
			}
		}

	}

}
