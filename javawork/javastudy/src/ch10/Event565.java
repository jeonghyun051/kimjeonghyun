package ch10;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Event565 extends JFrame {
	
	private Container c;
	
	private void initObject() {
	
	}
	
	private void initSetting() {
		
		c=getContentPane();
		setTitle("adf");
		setSize(400,400);
		

		setLayout(null);
	}
	
	private void initBatch() {
		
	}
	public Event565() {
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(50, 50, 57, 15);
		add(lblNewLabel);

		setVisible(true);
	}

}
