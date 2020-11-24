package ch09;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame{
	
	private JLabel laName, laNum, laClass, laSubject;
	private JTextField tfName, tfNum, tfClass, tfSubject;
	
	
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		
		//x��ưŬ���ϸ� main�� �����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		//1. �ʿ��� ������Ʈ�� �޸𸮿� �ε�
		initObject();
		//2. ����
		//3. ��ġ
		
		GridLayout grid = new GridLayout(4,2);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		
		jp1.add(btn4);
		jp2.add(btn3);
		
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
//		c.add(btn1);
	
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
//		c.add(btn2);
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
//		c.add(jp2);
		
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
//		c.add(jp1);
		
		c.add(btn5,MyLayout.NORTH.getValue());
		
		
		
		
		setVisible(true);
	}
	
	//���۳�Ʈ Ȥ�� �����̳� �ʱ�ȭ
	private void initObject() {
		laName = new JLabel("�̸�");
		laNum = new JLabel("�й�");
		laClass = new JLabel("�а�");
		laSubject = new JLabel("����");
		tfName = new JTextField("");
		tfNum = new JTextField("");
		tfClass = new JTextField("");
		tfSubject = new JTextField("");
		
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();	
		}
}
