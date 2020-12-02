package ch12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gra03 extends JFrame{
		public Gra03() {
			setTitle("4444");
			setSize(350,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container c = getContentPane();
			DrawPanel jp1 = new DrawPanel();
		
			
			JButton btn1 = new JButton("¹öÆ°1");
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					jp1.setVisible(true);
					Thread thread = new Thread(Runnable);
					
					
				}
			});
		
			c.add(jp1,BorderLayout.CENTER);
			jp1.setVisible(false);
			c.add(btn1,BorderLayout.SOUTH);
		
			setVisible(true);
		}
		
		class DrawPanel extends JPanel{
			public void paintComponent(Graphics g) {
				ArrayList<Integer> array = new ArrayList();
				array.add(50);
				array.add(100);
				array.add(150);
				array.add(200);
				array.add(150);
				
				int x = 50;
				super.paintComponent(g);
				for (int i = 0; i < array.size(); i++) {
					int array1 = array.get(i);
					
					g.setColor(Color.blue);
					
					g.fillRect(x, array1, 5, 300);
					repaint(30);
					x+=50;	
					
				}			
				
//				super.paintComponent(g);
//				g.setColor(Color.blue);
//				g.drawRect(50,array1, 0,300);
//				g.drawRect(100,100, 0,300);
//				g.drawRect(150,150, 0,300);
//				g.drawRect(200,150, 0,300);
//				g.drawRect(250,150, 0,300);
				
			}
			
		}
		
		public static void main(String[] args) {
			new Gra03();
			
		}
	}