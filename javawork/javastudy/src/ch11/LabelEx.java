package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//1번 JFrame 상속
public class LabelEx extends JFrame{ 

	//2번 생성자 만들기 ctrl + space
	public LabelEx() {
	
		//설정하기
		setTitle("레이블 예제");
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la1 = new JLabel("사랑합니다.");
		
		//images 폴더는 프로젝트 바로 아래칸에 넣어야함
		ImageIcon imageLabel = new ImageIcon("images/beauty.jpg"); 
		JLabel la2 = new JLabel(imageLabel);
		
		ImageIcon imageLabel2 = new ImageIcon("images/normalIcon.gif");
		JLabel la3 = new JLabel("보고싶으면 전화하세요" ,imageLabel2,SwingConstants.CENTER);
		
		c.add(la1);
		c.add(la2);
		c.add(la3);
		
		setVisible(true);
}
	
	public static void main(String[] args) {
		new LabelEx();
	}
}
