package ch02;


//heap 
class Zealot{
	String name = "질럿";
	int attack = 10;
	int armor = 5;
	
	static int hp =100;
}

public class Var08 {

	public static void main(String[] args) {
		
		Zealot z = new Zealot(); //static은 처음부터 static 이외에 띄울려면 new 
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
	
		Zealot z2 = new Zealot(); //22번 라인에서 똑같은 질럿이 하나 더 생성됨
	    System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
	
		
		z.attack = 50;
		
		System.out.println("변화 관찰");
		System.out.println(z.attack);
		System.out.println(z2.attack);
	
		Zealot.hp = 50;
		System.out.println(z.hp);
		System.out.println(z.hp);
		
		z.attack = 11;
		System.out.println(z2.attack);
		System.out.println(z2.attack);
	}
}

//.java 파일은 컴파일 해야함 jvm 이해할수있는 코드로 바꾸어야함 두개가 있음
//1. 자바c 2. 저장  실행은 1.java 2.실행 

