package Composite;


//��������

public class BurgerSet  {
	private Burger burger;
	private Potato potato;
	private Coke coke;
	
	public BurgerSet() {
		this(
				new Burger(),
				new Potato(),
				new Coke()
		);
		
	}
	
	public BurgerSet(Burger burger, Potato potato, Coke coke) {
		super();
		this.burger = burger;
		this.potato = potato;
		this.coke = coke;
	}
	
	public Burger getBurger() {
		return burger;
	}

	public void setBurger(Burger burger) {
		this.burger = burger;
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
}
