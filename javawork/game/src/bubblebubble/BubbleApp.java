package bubblebubble;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleApp extends JFrame implements Initable{

	//컨텍스트 저장
	private BubbleApp bubbleApp = this;
	
	//태그
	private static final String TAG = "BubbleApp:";
	
	private JLabel labackground;
	private Player player;
	
	public BubbleApp() {
		init();
		setting();
		batch();
		listener();
		
		setVisible(true);
		
	}
	
	public void init() {
		
		labackground = new JLabel(new ImageIcon("image/bg.png"));
		player = new Player();
	}

	public void setting() {
		setTitle("버블버블");
		setSize(1000,639);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setContentPane(labackground);
		
	}

	
	public void batch() {
		add(player);
		
	}


	public void listener() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
					player.moveRight();
				}
				if (e.getKeyCode()==KeyEvent.VK_LEFT) {
					player.moveLeft();
				}
				if (e.getKeyCode()==KeyEvent.VK_UP) {
					player.moveUp();
//					player.isUp = false;
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
					player.isRight = false;
				}
				if (e.getKeyCode()==KeyEvent.VK_LEFT) {
					player.isLeft = false;
			}
		}
		});
	}


	public static void main(String[] args) {
		new BubbleApp();

	}
}


	
