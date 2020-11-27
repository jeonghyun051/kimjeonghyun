package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread{
	private JLabel la1;
	
	public TimerThread(JLabel la1) {
		this.la1 = la1;
	}
	
	@Override
	public void run() {
		int n = 0;
		while (true) {		
			la1.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}	
	}
}

public class Thread13 extends JFrame{
	
	private Container c;
	private JLabel la1;
	
	public Thread13() {
		initObject();
		initSetting();
		initBatch();	
		
		
//		Thread t1 = new Thread(new TimerThread());
//		t1.start();
	}
	
	private void initObject() {
		c=getContentPane();
		JLabel la1 = new JLabel();
//		la1 = new JLabel("0");		
	}
	
	private void initSetting() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setSize(300,170);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		la1.setFont(new Font("Gothic", Font.ITALIC,80));
		TimerThread th = new TimerThread(la1);
		
		setVisible(true);
		th.start();
	}
	
	private void initBatch() {
		
		c.add(la1);	
	}
	
	public static void main(String[] args) {
		
		new Thread13();
	}
}
