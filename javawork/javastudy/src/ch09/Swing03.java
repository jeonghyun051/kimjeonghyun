package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

//swing�� ���������� while�� ���� ����. ���� ���μ���
public class Swing03 extends JFrame{

	public Swing03() {
		setTitle("�÷ο� ���̾ƿ�");
		setSize(300,400);
		
		Container c = getContentPane();
		JPanel jp1 = new JPanel();
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		
		jp1.add(btn3);
		jp1.add(btn4);
		jp1.add(btn5);
		
		c.add(btn1,BorderLayout.NORTH);
		c.add(btn2,BorderLayout.CENTER);
		c.add(jp1,BorderLayout.SOUTH);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Swing03();
		
	}

}
