package Composite;

public class Burger {
	private int price;
	private String desc;
	
	public Burger() {
		this(1000,"�⺻����");
	}
	
	public Burger(int price, String desc) {
		super();
		this.price = price;
		this.desc = desc;
		System.out.println(desc+"�� ����������ϴ�.");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
