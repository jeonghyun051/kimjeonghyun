package ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash03 {

	public static void main(String[] args) {
		
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>();
		
		//�ǽ� : ���������� ���� ���� ������ �ߺ��� ������ ���� �ʱ�
		
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
			
		
		
		//���� ���� �������� add�ϱ�
		
			if(lotto.size() == 6) {
				break;
			}
		}
		
		Iterator<Integer> it = lotto.iterator();
		
		
		while(it.hasNext()) { //���� ������ true, ������ false
			System.out.print(it.next() + " "); // ���� �ε����� ���� ����+�ε�������
		}	
	}
}
