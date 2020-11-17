package ch05;

//1. 재산을 물려 받는 의미(콤포지션을 해야함)
//

class Father{
	int money = 10000;
}

class Son extends Father{
	int money = 20000;
	
}



public class Inherit01 {
	
	
	public static void main(String[] args) {
		Son s = new Son();  //힙영역은 두개 만들어짐 , son father 둘다 뜸 son은 빈공간
								// s는 앞에 있는애를 가르킴
		
		//1번 변수를 찾을 때 변수가 있으면 그 변수를 사용
		//변수가 없으면 부모를 찾아 올라 간다.
		System.out.println(s.money); //son은 머니가 없어서 타고 올라감
		
		//2번 new를 하면 father 과 son이 heap이 뜬다.
		//하지만 생성자는 son만 호출이 된다.
		//가르키는 메모리 주소는 타입을 따라간다.
		Father f = new Son();
		System.out.println(f.money);
		
		
	}
}
