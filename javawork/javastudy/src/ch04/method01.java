package ch04;

//스테틱은 처음부터 존재, 스테틱은 하나 밖에 없다.

//자바 특징: 모든 코드는 class 내부에 둬야 한다.
public class method01 {
	
	//int num = 10;	//힙
	//
	static int num3 = 30; //스테틱은 메인이 뜨기전에 실행
	
	static void add() {
		System.out.println("add함수 호출됨");
	}
	
	void sound() {
		System.out.println("sound함수 호출됨");
	}
	
	
	public static void main(String[] args) {
	
	//int num2 = 20; //스텍	
		
		method01.add();
		
		method01 m = new method01();  //static 아닌 모든게 뜸
		m.sound();
	}

}
