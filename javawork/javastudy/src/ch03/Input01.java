package ch03;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //()������ ȣ��
		//Scanner�� �̿��ϸ� I/O��ġ�� ���� ����!!
		int num = sc.nextInt(); //���ŷ �Է¹������� num�� ����
		
		System.out.println("�Է¹��� �� :" + num);		
	}
}
//�ú��� - ������
//i/o - ȿ����

//cpu�� ���������� �ϳ��� ó���Ѵ�

//������(�н�)�� ����� - �񵿱������� ó�� ����
//�ú����ؼ� �۵��Ѵ�(���� ���ÿ� ����Ǵ°�ó�� ���ϼ� ����) ����:���Ʊ�ȯ ������ �ð��� �� �ɸ�(����Ī)

//�ֽ����α׷��� �����带 �Ⱦ���
//���������� �����ϴµ� cpu�� i/o�� ���������� ��ٷ����ϴµ�
//�����带 �ϳ��� �񵿱��� ��� -> 