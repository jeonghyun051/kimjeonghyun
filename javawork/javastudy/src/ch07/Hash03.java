package ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash03 {

	public static void main(String[] args) {
		
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>();
		
		//실습 : 이전번지에 같은 값이 있으면 중복된 데이터 넣지 않기
		
		while(true) {
		boolean isis=false;
		int num = r.nextInt(45)+1;
		
		for (int i = 0; i < lotto.size(); i++) {
			if (lotto.get(i)==num) {
				isis=true;
			}	
			System.out.println(num);
		}
		
		
		if (isis=false) {
			lotto.add(num);
		}
			
		
		
		//같은 값이 없을때만 add하기
		
			if(lotto.size() == 6) {
				break;
			}
		}
		
		Iterator<Integer> it = lotto.iterator();
		
		
		while(it.hasNext()) { //값이 있으면 true, 없으면 false
			System.out.print(it.next() + " "); // 현재 인덱스의 값을 리턴+인덱스증가
		}	
	}
}
