package ch04;

class Cal{ //계산기
	
	static void add (int n1,int n2) {   //n1 n2는 스택변수 지역변수 add는 static에 이름만 뜸
										//메서드가 호출되면 스택이 열림 
		System.out.println(n1+n2);
	}
	
	static int minus(int n3, int n4) {  //지역변수는 메서드가 끝나면 사라짐
		return n3-n4;
	}
}

public class Method03 {

	public static void main(String[] args) {
		
	Cal.add(5,6);	//new hip에는 전역변수  static 전역변수
		
	int result = Cal.minus(10,4);
	//minus함수는 return타입이 int이기 때문에
	//Cal.minus(10,4)가 호출된 후 메서드가 종료되면
	//Cal.minus(10,4)--> 6으로 변경된다.
	System.out.println(result);
	
	Cal.minus(10, 4); //호출한순간 return 값 돌려 받아서 6
	
		
	}

}
