package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridLayoutEx04 extends JFrame {

		public GridLayoutEx04() {
			
			setTitle("GridLayout Sample");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			GridLayout grid = new GridLayout(1,7);
			JButton btn1 = new JButton("0");
			JButton btn2 = new JButton("1");
			JButton btn3 = new JButton("2");
			JButton btn4 = new JButton("3");
			JButton btn5 = new JButton("4");
			JButton btn6 = new JButton("5");
			JButton btn7 = new JButton("6");
			JButton btn8 = new JButton("7");
			JButton btn9 = new JButton("8");
			
			Container c = getContentPane();
			c.setLayout(grid);
			c.add(btn1);
			c.add(btn2);
			c.add(btn3);
			c.add(btn4);
			c.add(btn5);
			c.add(btn6);
			c.add(btn7);
			c.add(btn8);
			c.add(btn9);
			
			btn1.setBackground(Color.RED);
			btn2.setBackground(Color.orange);
			btn3.setBackground(Color.yellow);
			btn4.setBackground(Color.green);
			btn5.setBackground(Color.blue);
			btn6.setBackground(Color.LIGHT_GRAY);
			btn7.setBackground(Color.PINK);
			btn8.setBackground(Color.gray);
			btn9.setBackground(Color.pink);
			
			
			
			setSize(500,300);
			setVisible(true);
		}
	
		public static void main(String[] args) {
			new GridLayoutEx04();
}
}