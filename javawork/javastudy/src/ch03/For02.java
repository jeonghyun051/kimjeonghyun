package ch03;

import javax.swing.plaf.basic.BasicFormattedTextFieldUI;

public class For02 {

	public static void main(String[] args) {
		//¦�� 1 ~ 100
		for (int i = 1; i < 101; i++) {
			if (i%2 ==0) {
				System.out.println("2�ǹ�� : " + i);
			}
			
		}
		
		//Ȧ�� 1~100
		for (int i = 1; i < 101; i++) {
			if(i%2 == 1) {
				System.out.println("Ȧ��" + i);
			}
		}
		
		//50 ~ 1������ �� �� Ȧ�� ���(��������)
		for (int i = 50; i > 0; i--) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		
	}

}
