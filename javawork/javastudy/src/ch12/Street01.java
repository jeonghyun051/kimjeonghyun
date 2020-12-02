package ch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Street01 extends JFrame{

	int x = 340;
	int y = 20;
	
	Container c;
	
	public Street01() {
		setTitle("장품");
		setSize(900,300);
		setLocationRelativeTo(null); //모니터 정중앙에 JFrame 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=getContentPane();
		c.add(new GamePanel());
		setVisible(true);
	}
	
	class GamePanel extends JPanel{

		ImageIcon imgIconPlayer, imgIconJang;
		Image imgPlayer, imgJang;
		
		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/Jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			setFocusable(true);
			
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println(" x 좌표 : " + x);
					if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
						x = x + 10;
					} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
						x = x - 10;
						
					}
					
					if (x <= 340) {
						x = 340;
					}
					
					if (x >= 640) {
						x = 640;
					}
					
					repaint();
					
				}
			});
			
		}
		
		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);
			g.drawImage(imgPlayer,0 ,0 ,null);
			g.drawImage(imgJang,x,y,null);
			
		}
	}
	
	public static void main(String[] args) {
		new Street01();
	
	}
}