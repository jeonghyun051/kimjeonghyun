package ch06;

public class Object02 {
	
//해쉬는 고정 길이로 바꾼다 복호화x 충돌o
//해쉬는 전자서명으로 쓰임
	
	public static void main(String[] args) {
		String str = "홍길동";
		System.out.println(str.hashCode());
		
		String str2 = "홍길동";
		System.out.println(str2.hashCode());
		
		str = "임꺽정";
		System.out.println(str.hashCode());
	
		
	}
}
