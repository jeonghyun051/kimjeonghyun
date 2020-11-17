package Star1;

class Scv extends StarUnit{
	private String name;
	private int hp;
	private int attack;
	
	//ctrl + shift + s
	public Scv(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack; 
	}
	
	//ctrl + 스페이스바 디폴터생성자
	public Scv() { 
	}
	
	//ctrl + shift + s 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
}
