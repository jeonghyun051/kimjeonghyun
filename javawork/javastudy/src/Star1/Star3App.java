package Star1;


//1. Zealot, Dragon, Tank, Scv, DarkTempler => StarUnit Ÿ�� �θ�Ÿ������ �����
//attack�� �ϳ���



public class Star3App {

	static void attack(StarUnit u1, StarUnit u2) {
		//Ÿ���� �ϳ��� ������ �� ����
		
		System.out.println(u1.getName()+"->"+u2.getName()+"����");
		u2.setHp(u2.getHp() - u1.getAttack()); // 90
		System.out.println(u2.getName()+" ü�� :" +u2.getHp());
		
		//u2 = u2 - u1; // 90
	}
	
	public static void main(String[] args) {
		// 
		Zealot z = new Zealot("����1",100,10);
		Dragon d = new Dragon("���1",100,20);
		
		attack(z,d);
		
	}

}
