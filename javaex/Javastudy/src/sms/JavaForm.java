package sms;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import lombok.Data;

@Data
public class JavaForm extends JFrame implements ActionListener{
	private JTextField textField, textField_1;
	private JLabel la1,la2;
	private JButton btOpen, bt2;
	private Container c;
	private String to, text;


	public JavaForm() {
		initObject();
		
		initSetting();
		
		initBatch();
	}
	
	private void initObject() {
		
		c=getContentPane();
		la1 = new JLabel("메시지");
		textField = new JTextField();
		
		la2 = new JLabel("번호");
		textField_1 = new JTextField();
		
		btOpen = new JButton("보내기");
		bt2 = new JButton("초기화");
		}
	
	private void initSetting() {
		
		setTitle("메시지보내기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		getContentPane().setLayout(null);
		la1.setBounds(54, 40, 57, 15);
		textField.setBounds(123, 37, 116, 18);
		textField.setColumns(10);
		la2.setBounds(54, 97, 57, 15);
		textField_1.setBounds(123, 94, 116, 21);
		textField_1.setColumns(10);
		btOpen.setBounds(45, 173, 97, 23);
		btOpen.addActionListener(this);
		bt2.setBounds(145, 173, 97, 23);
		bt2.addActionListener(this);
		setVisible(true);
		
	}
	
	private void initBatch() {
		
		getContentPane().add(la1);		
		getContentPane().add(textField);	
		getContentPane().add(la2);
		getContentPane().add(textField_1);
		getContentPane().add(btOpen);
		getContentPane().add(bt2);
	}

	
	public static void main(String[] args) {
		new JavaForm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btOpen==e.getSource()) { 
			to = textField_1.getText(); 
			text = textField.getText();  
										
			ExampleSend ex = new ExampleSend();
			ex.문자전송(to, text);
		
		}
		if(bt2==e.getSource()){
			textField_1.setText("");
			textField.setText("");
		}
	
}
}

