package ch04;

class Exercise6{
private int age;

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}

public class Exercise7 {
	public static void main(String[] args) {
	Exercise6 aPerson = new Exercise6();
	aPerson.setAge(17);
	System.out.println(aPerson);
	

	}

}
