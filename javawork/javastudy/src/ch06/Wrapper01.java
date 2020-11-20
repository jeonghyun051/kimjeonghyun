package ch06;

public class Wrapper01 {

	public static void main(String[] args) {
		int num = 10;
		Integer num2 = 20; //레퍼런스임 주소임
	
		String num3 = num2.toString(); //숫자를 문자로 바꾸는 법
		System.out.println(num3);
		
		String num4 = num + "";
		
		
		String num5 = "10";
		int num6 = Integer.parseInt(num5); //문자를 숫자로 바꾸는 법 
		System.out.println(num6);
		
	
	}
}
