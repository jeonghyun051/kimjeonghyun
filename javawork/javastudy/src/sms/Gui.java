package sms;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui extends JFrame {

	public Gui() {
	
		setTitle("¤·");
		setSize(300,300);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		GridLayout grid = new GridLayout(2,2);
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		
		
		c.setLayout(grid);
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		
		Container b = getContentPane();
		b.add(btn5,BorderLayout.SOUTH);
		
		setVisible(true);
		
	
	}
	
	
	
	public static void main(String[] args) {
		
		new Gui();
	}

}
