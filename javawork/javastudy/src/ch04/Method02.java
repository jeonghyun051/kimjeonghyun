package ch04;

class Dog {
	int 배고픔 = 100; //상태
	
	void eat() { //행위		//void 리턴이 없는거 자판이 음료수를 안주는거 배고픔만 바꾸는거
	
		배고픔=10;
	}
}

public class Method02 {

	public static void main(String[] args) {
		
	Dog d1 = new Dog();
	//d1.배고픔 = 10; //자바에서 변수를 바꾸는건 금지 마법은 안됨
	d1.eat();
	System.out.println("강아지의 배고픔:" + d1.배고픔);
	}
}
