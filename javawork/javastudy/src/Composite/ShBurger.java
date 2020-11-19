package Composite;

public class ShBurger extends Burger {
	public ShBurger() {
		this(2000,"새우버거");
	}
	
	public ShBurger(int price, String desc) {
		super(price,desc);
	}
}
