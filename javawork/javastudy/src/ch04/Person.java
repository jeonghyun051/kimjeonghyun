package ch04;

//1. ��ü �����ÿ� �ʱ�ȭ�� ���� �����ڸ� �̿��ؼ� ���� �Է��Ѵ�.
//- ������ : �ʱ�ȭ

//2. �����ε� 

public class Person {

	String name;
	String job;
	int age;
	char gender;
	String blood;
	
	
	// �ʱ�ȭ�� ���� ������(�ʱ�ȭ�� ���� �Լ�
	//�������� �Լ��� ���ؼ� �����ؾ� �� (PersonApp�� ���� ����)

	
	//����Ʈ �����ڴ� �����ڰ� �ϳ��� ������ �����Ϸ��� �ڵ����� �������.
	//���࿡ �����ڰ� ������ ����Ʈ �����ڸ� ��������� ����.
	//�� ��쿡�� ����Ʈ �����ڸ� ���� �������� ��(�����ε�)
	
	public Person() {
	
	}
	
	public Person(String n, String j, int a, char g, String b) {
		System.out.println("����� �¾");
		name = n;
		job = j;
		age = a;
		gender = g;
		blood = b;
		
		
	}
	
	void preview() {
		System.out.println("====" +name+ "====");
		System.out.println("����:" +job);
		System.out.println("����:" +age);
		System.out.println("����:" +gender);
		System.out.println("������" +"blood");
		System.out.println(); //�������� <br/>
		
	}
}
