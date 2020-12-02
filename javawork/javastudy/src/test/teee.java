package test;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//swing은 내부적으로 while이 돌고 있음. 데몬 프로세서
public class teee extends JFrame{
	private ImageIcon ch01 = new ImageIcon("images/image11.jpg");
	private ImageIcon ch02 = new ImageIcon("images/image0.jpg");
	
	public teee() {
		setTitle("제목");
		setSize(300,500);
		
		
		
		Container c = getContentPane(); //JPanel = (Jframe이 기본적으로 가지고 있는 패널
		JButton ch1 = new JButton(ch01);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		JPanel jp1 = new JPanel();
		jp1.add(ch1);
		c.setForeground(ch02);
		
		
		//실수 방지 BorderLayout!
		//변수 : public static final이 생략되어 있음
		
		c.add(btn3,BorderLayout.NORTH);
		c.add(btn4,BorderLayout.SOUTH);
		c.add(jp1,BorderLayout.CENTER);
		
		
		setVisible(true); //화면에표시
	}
	
	public static void main(String[] args) {
		new teee();

	}

}
