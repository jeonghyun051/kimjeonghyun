package test;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//swing�� ���������� while�� ���� ����. ���� ���μ���
public class teee extends JFrame{
	private ImageIcon ch01 = new ImageIcon("images/image11.jpg");
	private ImageIcon ch02 = new ImageIcon("images/image0.jpg");
	
	public teee() {
		setTitle("����");
		setSize(300,500);
		
		
		
		Container c = getContentPane(); //JPanel = (Jframe�� �⺻������ ������ �ִ� �г�
		JButton ch1 = new JButton(ch01);
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		JButton btn6 = new JButton("��ư6");
		JPanel jp1 = new JPanel();
		jp1.add(ch1);
		c.setForeground(ch02);
		
		
		//�Ǽ� ���� BorderLayout!
		//���� : public static final�� �����Ǿ� ����
		
		c.add(btn3,BorderLayout.NORTH);
		c.add(btn4,BorderLayout.SOUTH);
		c.add(jp1,BorderLayout.CENTER);
		
		
		setVisible(true); //ȭ�鿡ǥ��
	}
	
	public static void main(String[] args) {
		new teee();

	}

}
