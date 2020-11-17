package Star1;

//오버로딩 : 함수의 이름이 같아도 매개변수의 개수,타입이 다르면
//다른 함수로 인식한다.(과적재)
//오버로딩 단점 : 경우의수가 많아지면 함수가 너무 많아짐. 그래서 경우의수가 적을 때 사용

public class Star1App {
	
	static void attack(Zealot u1, Dragon u2) {
		System.out.println(u1.name+"->"+u2.name+"공격");
		u2.hp = u2.hp - u1.attack; // 90
		System.out.println(u2.name+" 체력 :" +u2.hp);
		
		
	}
	
	static void attack(Dragon u1, Zealot u2) {
		System.out.println(u1.name+"->"+u2.name+"공격");
		u2.hp = u2.hp - u1.attack; 
		System.out.println(u2.name+" 체력 :" +u2.hp);
	
	}
	
	static void attack(Dragon u1, Dragon u2) {
		System.out.println(u1.name+"->"+u2.name+"공격");
		u2.hp = u2.hp - u1.attack; 
		System.out.println(u2.name+" 체력 :" +u2.hp);
		
	}
	
	static void attack(Dark u1, Zealot u2) {
		System.out.println(u1.name+"->"+u2.name+"공격");
		u2.hp = u2.hp - u1.attack; 
		System.out.println(u2.name+" 체력 :" +u2.hp);
		
	}
	
	static void attack(Dark u1, Dragon u2) {
		System.out.println(u1.name+"->"+u2.name+"공격");
		u2.hp = u2.hp - u1.attack; 
		System.out.println(u2.name+" 체력 :" +u2.hp);
		
	}

	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1",100,10);
		Dragon d1 = new Dragon("드라군1",100,20);
		Dragon d2 = new Dragon("드라군2",100,20);
		Dark dk1 = new Dark("다크템플러1",100,50);
		Dark dk2 = new Dark("다크템플러2",100,50);
		
		//1. 질럿1 - > 드라군1 공격
		attack(z1,d1);
		
		//2. 드라군1 -> 질럿1 공격
		attack(d1,z1);
		
		//3. 드라군1 -> 드라군2 공격
		attack(d1,d2);
		
		//4. 다크템플러1 -> 질럿1  공격 (다크템플러1, 100, 50)
		attack(dk1,z1);
	
		//5. 다크템플러2 -> 드라군1 공격
		attack(dk2,d1);
	}

}


