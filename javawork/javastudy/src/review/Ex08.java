package review;

public class Ex08 {

	//void는 리턴이 없다. add는 변수이름이다. ()는 함수라는 뜻
	//int n1 ,n2 매개변수(arguments)
	
	void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	

	int minus(int n1, int n2) {
		return n1-n2; //함수를 호출한 문장의 값이 n1-n2로 변경됨
	}
	
	public static void main(String[] args) {

		//함수의 호출 위로 점프 후 다시 라인으로 돌아옴 
		Ex08 e = new Ex08();
		e.add(3, 6);	//3, 6을 인수라고 함
		
		int result = e.minus(10, 5); //함수를 호출한 문장으로 바뀜
		System.out.println("result : " + result);
		
	
	}
}
