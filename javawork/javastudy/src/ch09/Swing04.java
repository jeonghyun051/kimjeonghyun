package ch09;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;

public class Swing04 extends JFrame {
	
	private JLabel la1, la2, la3;
	private JButton btOpen, btRead, btClose;
	private JPanel jp1, jp2;

	
	public Swing04() {
		
		//1.오브젝트
		initObject();
		
		//2.세팅
		initSetting();
		
		//3.배치
		initBatch();
	}

	
	private void initObject() {
		la1 = new JLabel("Love");
		la2 = new JLabel("HELLO");
		la3 = new JLabel("Java");
	
		btOpen = new JButton("Open");
		btRead = new JButton("Read");
		btClose = new JButton("Close");
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
	}
	
	private void initSetting() {
		setTitle("GridLayout Sample");
		
		//x버튼클릭하면 main이 종료됨
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		
		jp1.setBackground(Color.GRAY);
		jp1.setForeground(Color.GRAY);
		
		jp2.setLayout(null);
		
		la1.setBounds(276, 104, 57, 15);
		la2.setBounds(109, 50, 57, 15);
		la3.setBounds(64, 151, 57, 15);
		
		setVisible(true);
	}
	
	private void initBatch() {
		
		getContentPane().add(jp1, BorderLayout.NORTH);
	
		jp1.add(btOpen);
		jp1.add(btRead);
		jp1.add(btClose);
		
		getContentPane().add(jp2, BorderLayout.CENTER);
		
		jp2.add(la1);
		jp2.add(la2);
		jp2.add(la3);
		
		
		
	}
	
	public static void main(String[] args) {
		new Swing04();
	} 
}
