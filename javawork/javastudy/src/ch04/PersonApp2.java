package ch04;

public class PersonApp2 {

	public static void main(String[] args) {
		
		//기본 생성자 -> 클래스명()  이 친구는 생략가능하다 
		//변수말고 함수를 통해서 접근해야 함 

		Person p1 = new Person("최승희","의사",45,'여',"A");
		p1.preview();
		
		Person p2 = new Person("이미녀","골프선수",28,'여',"O");
		p2.preview();
		
		Person p3 = new Person("김미남","교수",47,'남',"AB");
		p3.preview();
		
	}

}
