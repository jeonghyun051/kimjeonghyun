package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event02 extends JFrame implements ActionListener{

	private JLabel laTitle;
	private JButton btn1, btn2, btn3;
	private Container c;
	
	
	public Event02() {
	
	
		
		laTitle = new JLabel("사과");
		btn1 = new JButton("딸기 클릭");
		btn2 = new JButton("바나나 클릭");
		btn3 = new JButton("참외 클릭");
		
		c = getContentPane();
		
		c.add(laTitle,BorderLayout.NORTH);
		c.add(btn1,BorderLayout.WEST);
		c.add(btn2,BorderLayout.CENTER);
		c.add(btn3,BorderLayout.EAST);
		
		//익명클래스를 이용해서 구현하세요.
		btn1.addActionListener(this);
		
		btn2.addActionListener(this);
		
		btn3.addActionListener(this);
		
		
		setTitle("이벤트02");
		setSize(400,500);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event02();

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		//getSource()의 리턴타입은 Object
		System.out.println("클릭됨 :"+e.getSource());
		JButton btn = (JButton) e.getSource(); //j버튼 다운캐스팅해야 j버튼안에 btn을 쓸수있음
		System.out.println(btn.getText());
		if (btn1 == e.getSource()) {
			laTitle.setText("딸기클릭");
		}
		if (btn2 == e.getSource()) {
			laTitle.setText("바나나클릭");
		}
		if (btn3 == e.getSource()) {
			laTitle.setText("참외클릭");
		}
		
		(btn3)
	}

}
