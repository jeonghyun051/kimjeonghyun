package ch07;

import java.util.ArrayList;
import java.util.List;

public class Generic02 {

	public static void main(String[] args) {
		//순차적이지 않음 메모리주소는 
		//ArrayList는 List의 자식이기때문에 부모타입인 List를 잡는다.
		List<String> list1 = new ArrayList<>();
		list1.add("사과");
		list1.add("딸기");
		
		int size = list1.size();
		
		//배열의길이는 length, 여기는 size
		for (int i = 0; i < size; i++) {
			System.out.println(list1.get(i));
		}

		list1.add("바나나"); //추가
		System.out.println(list1.get(2));
		
		//한칸 밀려서 딸기는 2번지로감
		list1.add(1,"참외");
		System.out.println(list1.get(1));
		
		list1.remove(1);
		System.out.println(list1.get(1));

		list1.clear(); //arraylist에 있는 모든 요소를 삭제
		System.out.println(list1.size());
		
	}

}
