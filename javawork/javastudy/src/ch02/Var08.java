package ch02;


//heap 
class Zealot{
	String name = "����";
	int attack = 10;
	int armor = 5;
	
	static int hp =100;
}

public class Var08 {

	public static void main(String[] args) {
		
		Zealot z = new Zealot(); //static�� ó������ static �̿ܿ� ������ new 
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
	
		Zealot z2 = new Zealot(); //22�� ���ο��� �Ȱ��� ������ �ϳ� �� ������
	    System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
	
		
		z.attack = 50;
		
		System.out.println("��ȭ ����");
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

//.java ������ ������ �ؾ��� jvm �����Ҽ��ִ� �ڵ�� �ٲپ���� �ΰ��� ����
//1. �ڹ�c 2. ����  ������ 1.java 2.���� 

