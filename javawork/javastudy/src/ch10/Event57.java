package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction;

import lombok.Data;

@Data
public class Event57 extends JFrame{
	
	private JLabel la1, la2, la3, la4;
	private Container c;
	
	
	private void initObject() {
		c=getContentPane();
		
		la1 = new JLabel("0");
		la2 = new JLabel("0");
		la3 = new JLabel("0");
		la4 = new JLabel("시작합니다.");
		
		
	}
	
	private void initSetting() {
		setTitle("Open Challenge");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		la1.setBounds(46, 59, 73, 64);
		la2.setBounds(160, 59, 73, 64);
		la3.setBounds(269, 59, 73, 64);
		la4.setBounds(160, 162, 110, 26);
		la1.setOpaque(true); 						//이게있어야 색설정가능
		la1.setBackground(Color.pink);				//라벨배경색
		la1.setForeground(Color.yellow); 			//폰트색깔
		Font font = new Font("궁서", Font.BOLD,50); //폰트객체 생성
		la1.setFont(font);							//폰트설정
		la1.setHorizontalAlignment(JLabel.CENTER);	//라벨 글자 중앙에 위치
		
		la2.setOpaque(true); 
		la2.setBackground(Color.pink);
		la2.setForeground(Color.yellow); 
		la2.setFont(font);
		la2.setHorizontalAlignment(JLabel.CENTER);
		
		la3.setOpaque(true); 
		la3.setBackground(Color.pink);
		la3.setForeground(Color.yellow); 
		la3.setFont(font); 
		la3.setHorizontalAlignment(JLabel.CENTER); 

		c.addKeyListener(new MyKeyListener());
		
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	private void initBatch() {
		getContentPane().add(la1);		
		getContentPane().add(la2);	
		getContentPane().add(la3);	
		getContentPane().add(la4);
	
		
	}
	
	public Event57() {
		
		initObject();
		initSetting();
		initBatch();
		
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar()=='\n') {
				
				int x = 0;
				int y = 0;
				int z = 0;
				
				x = (int)(Math.random()*5);
				y = (int)(Math.random()*5);
				z = (int)(Math.random()*5);
				
				la1.setText((x)+"");
				la2.setText((y)+"");
				la3.setText((z)+"");
				la4.setText("아쉽군요");
				
				if (x==y && x==z && z==y) {
					la4.setText("축하합니다.");	
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Event57();
	}
}
	

