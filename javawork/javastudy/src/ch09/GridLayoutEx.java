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
		
		//x버튼클릭하면 main이 종료됨
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		//1. 필요한 오브젝트를 메모리에 로딩
		initObject();
		//2. 세팅
		//3. 배치
		
		GridLayout grid = new GridLayout(4,2);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		jp1.add(btn4);
		jp2.add(btn3);
		
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
//		c.add(btn1);
	
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
//		c.add(btn2);
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
//		c.add(jp2);
		
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
//		c.add(jp1);
		
		c.add(btn5,MyLayout.NORTH.getValue());
		
		
		
		
		setVisible(true);
	}
	
	//컴퍼넌트 혹은 컨테이너 초기화
	private void initObject() {
		laName = new JLabel("이름");
		laNum = new JLabel("학번");
		laClass = new JLabel("학과");
		laSubject = new JLabel("과목");
		tfName = new JTextField("");
		tfNum = new JTextField("");
		tfClass = new JTextField("");
		tfSubject = new JTextField("");
		
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();	
		}
}
