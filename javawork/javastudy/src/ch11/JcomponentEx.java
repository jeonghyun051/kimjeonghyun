package ch11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JcomponentEx extends JFrame{

	public JcomponentEx() {
		setTitle("jCom��������");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JButton btn1 = new JButton("magenta/yellow Button");
		JButton btn2 = new JButton("disabled button");
		JButton btn3 = new JButton("getx, gety");
		
		btn1.setBackground(Color.yellow);
		btn1.setForeground(Color.magenta);
		Font f1 = new Font("Arial",Font.ITALIC,20);
		btn1.setFont(f1);
		
		btn2.setEnabled(false);
		
		//�̰� �͸�Ŭ������ ����� �͸� ��õ! �������̸� implements ActionLissner
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setText("aa");
				setTitle("2");
			}
		});

		c.setLayout(new FlowLayout());
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		setVisible(true);	
	}
	public static void main(String[] args) {
		new JcomponentEx();
		
	}
}