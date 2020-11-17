package Star1;

class Marine {
	
	//멤버변수 : 필드 : heap변수 : 전역변수 : 속성 : 프로퍼티
	//모든 변수는 private로 만든다 마법을 사용못하게 하도록
	//private : 사적인
	//다른 클래스에서 사용이 불가능하다.
	//함수안에 사용하도록 강제한다.
	
	private String name;
	private int hp;
	private int attack;
	
	//this는 heap 변수 //this는 heap를 가르킨다.
	//this는 new가 된 heap 공간을 binding한다
	//static에 this를 사용할 수 없다.
	
	//alt + shift + s
	public Marine(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	
	public Marine() {
	
		
	}
	
	
	
	
	
}
