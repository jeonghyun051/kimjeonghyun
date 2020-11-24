package review;

interface Helloable{
	void 안녕();
}
public class Ex123 {

	static void start(Helloable h) {
		h.안녕();
	}
	
	public static void main(String[] args) {
		start(new Helloable() {
			//인터페이스는 뉴가 안됨 그래서 인터페이스 메소드를 사용하기위해서 익명클래스를 사용한다
			@Override
			public void 안녕() {
				System.out.println("반갑습니다.");
				
			}
		});
		
		

	}

}
