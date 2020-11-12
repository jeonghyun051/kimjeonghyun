package ch02;

//클래스 자료형
class Car {
	static int power = 2000;
	static String color = "하양";
	static String name = "소나타";
	static String type = "승용차";
	
	int power2 = 3000;
	String color2 = "검정색";
	String name2 = "BMW";
	String type2 = "스포츠카";
}

public class Var07 {
	public static void main(String[] args) {
		System.out.println(Car.power);
		System.out.println(Car.color);
		System.out.println(Car.name);
		System.out.println(Car.type);
	}

}
