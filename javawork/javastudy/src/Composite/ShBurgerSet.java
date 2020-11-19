package Composite;

public class ShBurgerSet {

	private ShBurger shburger;
	private Potato potato;
	private Coke coke;
	
	public ShBurgerSet() {
		this(
			new ShBurger(),
			new Potato(),
			new Coke()
				
		);
		
		
	}
	
	public ShBurgerSet(ShBurger shburger, Potato potato, Coke coke) {
		super();
		this.shburger = shburger;
		this.potato = potato;
		this.coke = coke;
	}

	

	public ShBurger getShburger() {
		return shburger;
	}

	public void setShburger(ShBurger shburger) {
		this.shburger = shburger;
	}

	public Potato getPotato() {
		return potato;
	}

	public void setPotato(Potato potato) {
		this.potato = potato;
	}

	public Coke getCoke() {
		return coke;
	}

	public void setCoke(Coke coke) {
		this.coke = coke;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
