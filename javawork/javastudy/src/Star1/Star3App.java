package Star1;


//1. Zealot, Dragon, Tank, Scv, DarkTempler => StarUnit 타입 부모타입으로 묶어라
//attack를 하나로



public class Star3App {

	static void attack(StarUnit u1, StarUnit u2) {
		//타입을 하나로 통일할 수 있음
		
		System.out.println(u1.getName()+"->"+u2.getName()+"공격");
		u2.setHp(u2.getHp() - u1.getAttack()); // 90
		System.out.println(u2.getName()+" 체력 :" +u2.getHp());
		
		//u2 = u2 - u1; // 90
	}
	
	public static void main(String[] args) {
		// 
		Zealot z = new Zealot("질럿1",100,10);
		Dragon d = new Dragon("드라군1",100,20);
		
		attack(z,d);
		
	}

}
