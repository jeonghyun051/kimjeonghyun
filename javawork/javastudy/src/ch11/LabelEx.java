package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//1�� JFrame ���
public class LabelEx extends JFrame{ 

	//2�� ������ ����� ctrl + space
	public LabelEx() {
	
		//�����ϱ�
		setTitle("���̺� ����");
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la1 = new JLabel("����մϴ�.");
		
		//images ������ ������Ʈ �ٷ� �Ʒ�ĭ�� �־����
		ImageIcon imageLabel = new ImageIcon("images/beauty.jpg"); 
		JLabel la2 = new JLabel(imageLabel);
		
		ImageIcon imageLabel2 = new ImageIcon("images/normalIcon.gif");
		JLabel la3 = new JLabel("��������� ��ȭ�ϼ���" ,imageLabel2,SwingConstants.CENTER);
		
		c.add(la1);
		c.add(la2);
		c.add(la3);
		
		setVisible(true);
}
	
	public static void main(String[] args) {
		new LabelEx();
	}
}
