package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//swing은 내부적으로 while이 돌고 있음. 데몬 프로세서
public class Swing01 extends JFrame{

	public Swing01() {
		setTitle("제목");
		setSize(300,500);
		
		Container c = getContentPane(); //JPanel = (Jframe이 기본적으로 가지고 있는 패널
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		JPanel jp1 = new JPanel();
		jp1.add(btn6);
		
		
		
		//실수 방지 BorderLayout!
		//변수 : public static final이 생략되어 있음
		c.add(btn1,MyLayout.WEST.getValue());
		c.add(btn2,Batch.EAST);
		c.add(btn3,BorderLayout.NORTH);
		c.add(btn4,BorderLayout.SOUTH);
		c.add(jp1,BorderLayout.CENTER);
	
		
		setVisible(true); //화면에표시
	}
	
	public static void main(String[] args) {
		new Swing01();
		System.out.println(MyLayout.WEST);
		System.out.println(MyLayout.WEST.name());
		System.out.println(MyLayout.WEST.ordinal());
		System.out.println(MyLayout.WEST.getValue());
	}

}
