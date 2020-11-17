package ch04;


//숫자 10, 5를 더해서!
//그 결과값과 숫자 20을 곱해서 
//그 결과값을 숫자 5로 나누고 
//그 결과값에 100을 뺀 값을 화면에 출력하시오.
public class Calculator {

	//지역변수 스택에 있기에 오류가 안난다. 필요할때 호출하니까
	static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	static int divid(int n1, int n2) {
		
		int result = n1 / n2;
		return result;
	}
	
	static int multi(int n1, int n2) {
		int result = n1*n2;
		return result;
		
	}
}
