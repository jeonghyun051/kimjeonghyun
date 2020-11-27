package ch13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.concurrent.ThreadFactory;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{
	
	private long delay; // 배경색이 바뀌는 지연시간, 밀리초 단위
	
	public FlickeringLabel(String text, long delay) {
		super(text);	//JLabel 생성자 호출
		this.delay = delay;
		setOpaque(true);	//배경색 변경이 가능하도록 설정
		
		Thread th = new Thread(this);
		th.start();
		
	}
	@Override
	public void run() {
		int n =0;
		while(true) {
			if(n==0)
				setBackground(Color.yellow);
		
			else 
				setBackground(Color.green);
			
			if(n==0) n =1;
			else n = 0;
			
			try {
				Thread.sleep(delay);	//delay 밀리초 동안 잠을 잔다.
			}
			catch(InterruptedException e ) {
				return;
			}
		}	
	}
}

public class Thread702 extends JFrame{

	public Thread702() {
		setTitle("FlickeringLabelEX 예제");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("깜빡",500);
		JLabel label = new JLabel("안깜빡");
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜빡",300);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {		
		new Thread702();
	}
}