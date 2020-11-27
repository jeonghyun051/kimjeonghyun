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
	
	
		
		laTitle = new JLabel("���");
		btn1 = new JButton("���� Ŭ��");
		btn2 = new JButton("�ٳ��� Ŭ��");
		btn3 = new JButton("���� Ŭ��");
		
		c = getContentPane();
		
		c.add(laTitle,BorderLayout.NORTH);
		c.add(btn1,BorderLayout.WEST);
		c.add(btn2,BorderLayout.CENTER);
		c.add(btn3,BorderLayout.EAST);
		
		//�͸�Ŭ������ �̿��ؼ� �����ϼ���.
		btn1.addActionListener(this);
		
		btn2.addActionListener(this);
		
		btn3.addActionListener(this);
		
		
		setTitle("�̺�Ʈ02");
		setSize(400,500);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event02();

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		//getSource()�� ����Ÿ���� Object
		System.out.println("Ŭ���� :"+e.getSource());
		JButton btn = (JButton) e.getSource(); //j��ư �ٿ�ĳ�����ؾ� j��ư�ȿ� btn�� ��������
		System.out.println(btn.getText());
		if (btn1 == e.getSource()) {
			laTitle.setText("����Ŭ��");
		}
		if (btn2 == e.getSource()) {
			laTitle.setText("�ٳ���Ŭ��");
		}
		if (btn3 == e.getSource()) {
			laTitle.setText("����Ŭ��");
		}
		
		(btn3)
	}

}
