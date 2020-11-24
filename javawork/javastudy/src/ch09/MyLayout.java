package ch09;

public enum MyLayout {
	WEST("West"),
	EAST("East"),
	SOUTH("South"),
	NORTH("North"),
	CENTER("Center"); //static finalº¯¼ö
	
	private String value;
	
	public String getValue() {
		return value;
	}
	private MyLayout(String value) {
		this.value = value;
	}
}
