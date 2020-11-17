package ch04;


//숫자 10, 5를 더해서!
//그 결과값과 숫자 20을 곱해서 
//그 결과값을 숫자 5로 나누고 
//그 결과값에 100을 뺀 값을 화면에 출력하시오.



public class CalculatorApp {

	public static void main(String[] args) {
		Calculator a = new Calculator();
		int r = a.add(10, 5);
		
		int r1 = a.multi(r, 20);
		
		int r2 = a.divid(r1, 5);
		
		int r3 = a.minus(r2, 100);
		
		System.out.println(r3);
		
		
		

		
				
	}
}
