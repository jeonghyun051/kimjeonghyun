package ch07;

import java.util.ArrayList;
import java.util.List;

public class Generic02 {

	public static void main(String[] args) {
		//���������� ���� �޸��ּҴ� 
		//ArrayList�� List�� �ڽ��̱⶧���� �θ�Ÿ���� List�� ��´�.
		List<String> list1 = new ArrayList<>();
		list1.add("���");
		list1.add("����");
		
		int size = list1.size();
		
		//�迭�Ǳ��̴� length, ����� size
		for (int i = 0; i < size; i++) {
			System.out.println(list1.get(i));
		}

		list1.add("�ٳ���"); //�߰�
		System.out.println(list1.get(2));
		
		//��ĭ �з��� ����� 2�����ΰ�
		list1.add(1,"����");
		System.out.println(list1.get(1));
		
		list1.remove(1);
		System.out.println(list1.get(1));

		list1.clear(); //arraylist�� �ִ� ��� ��Ҹ� ����
		System.out.println(list1.size());
		
	}

}
