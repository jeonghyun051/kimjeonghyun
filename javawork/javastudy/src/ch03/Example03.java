package ch03;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하시오>");
		int money = sc.nextInt();
		
		int rMoney = money;
		int rCount = 0;
		
		int[] arr = {50000,10000,1000,100,10,1};
		
		for (int i =0; i<6; i++) {
			rCount = rMoney/arr[i];
			rMoney = rMoney%arr[i];
			if(rCount != 0) {
				System.out.println(arr[i]+"원권:" + rCount);
			}
		}
		
//		if(money>=50000) {
//			int count1 = money/50000;
//			System.out.println("오만원권 " + count1+"매");
//			int remain1 = money%50000;
//			int remain2 = remain1/10000;
//			System.out.println("만원권 " + remain2+"매");
//			int remain3 = remain1%10000;
//			int remain4 = remain3/1000;
//			System.out.println("천원권 " + remain4+"매");
//			int remain5 = remain3%1000;
//			int remain6 = remain5/100;
//			System.out.println("백원 " + remain6+"개");
//			int remain7 = remain5%100;
//			int remain8 = remain7/50;
//			System.out.println("오십원 " + remain8+"개");
//			int remain9 = remain7%50;
//			int remain10 = remain9/10;
//			System.out.println("십원 " + remain10+"개");
//			int remain11 = remain9%10;
//			int remain12 = remain11/1;
//			System.out.println("일원 " + remain12+"개");
//			
//			
//		} else if(money>=10000 && money<50000) {
//			int remain1 = money;
//			int remain2 = remain1/10000;
//			System.out.println("만원권 " + remain2+"매");
//			int remain3 = remain1%10000;
//			int remain4 = remain3/1000;
//			System.out.println("천원권 " + remain4+"매");
//			int remain5 = remain3%1000;
//			int remain6 = remain5/100;
//			System.out.println("백원 " + remain6+"개");
//			int remain7 = remain5%100;
//			int remain8 = remain7/50;
//			System.out.println("오십원 " + remain8+"개");
//			int remain9 = remain7%50;
//			int remain10 = remain9/10;
//			System.out.println("십원 " + remain10+"개");
//			int remain11 = remain9%10;
//			int remain12 = remain11/1;
//			System.out.println("일원 " + remain12+"개");
//			
//		}
	}

}
