package ch04;

public class Tv {
	
	private String brand;
	private int since;
	private int width;
	

	public Tv(String brand, int since, int width) {
		this.brand = brand;
		this.since = since;
		this.width = width;
		
	}

	public Tv() {

	}
	
	void show(){
		
		System.out.println(brand+"���� ����"+since+"����"+ width+"��ġ"+"TV");
	}
	
	public static void main(String[] args) {
		Tv myTv = new Tv("LG", 2017, 32);
		myTv.show();
		
		
	}

}
