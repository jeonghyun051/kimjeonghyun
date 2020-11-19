package Composite;

public class Potato {
	private int price;
	private String desc;
	
	public Potato() {
		this(1000,"감자튀김");
	}
	
	public Potato(int price, String desc) {
		super();
		this.price = price;
		this.desc = desc;
		System.out.println(desc+"가 만들어졌습니다.");
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
