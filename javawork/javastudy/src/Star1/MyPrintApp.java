package Star1;

//함수의 이름은 통일할 수 있다.
//매개변수의 개수, 혹은 타입의 성질이 다르면 다른 함수로 인식한다.
//경우의 수가 많으면 사용 불가능하다.
//잘 사용된 사례 : println() 함수가 있다.


public class MyPrintApp {

	public static void main(String[] args) {
		//경우의 수가 제한적 : 오버로딩이 효과적이다.
		System.out.println(100); // int 타입 
		System.out.println(10.5); //double 타입
		System.out.println("문자열");
		System.out.println('가');
		
	}

}
