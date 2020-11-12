package ch02;

public class Var04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 여러개 1,2,3
		int n1 =1;
		int n2 =2;
		int n3 =3;
		
		// 숫자 여러개 1,2,3
		int[] n = {1,2,3}; //장점:찾을때 쉬움 단점:넣기가 어려움 
						   //추가 제거 {1,2,3,4} 못 넣음
		
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n);
		
		//문자 여러개 가,나,다
		char[] c = {'가','나','다'};
		System.out.println(c);
	}

}
