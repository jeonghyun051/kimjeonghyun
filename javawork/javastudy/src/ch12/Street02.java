package ch12;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter;

import ch03.While01;

public class Street02 extends JFrame{

	int x = 340;
	int y = 20;
	boolean isRunning = true;
	
	Container c;
	JButton btn;
	
	public Street02() {
		setTitle("¿Â«≥");
		setSize(900,300);
		setLocationRelativeTo(null); //∏¥œ≈Õ ¡§¡ﬂæ”ø° JFrame πËƒ°
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=getContentPane();
		
		
		c.add(new GamePanel());
		setVisible(true);
	}
	
	
	class GamePanel extends JPanel{

		ImageIcon imgIconPlayer, imgIconJang;
		Image imgPlayer, imgJang;
		thread th = new thread();
		
		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/Jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			setFocusable(true);
			btn = new JButton("∏ÿ√„");
			add(btn);
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					isRunning=false;
					
				}
			});
			
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println(" x ¡¬«• : " + x);
					if(e.getKeyCode() == KeyEvent.VK_SPACE) {
						th.start();
						
					}
					if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
						x = x + 10;
					} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
						x = x - 10;
						
					}
					
					if (x <= 340) {
						x = 340;
						return;
					}
					
					if (x >= 640) {
						x = 640;
						return;
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
	
	class thread extends Thread{
		
	
		@Override
		public void run() {
			while(isRunning) {
				if (x>640) {
					break;
				}
				x = x + 10;
				try {
					sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
				repaint();
			}
		}
	}
	
	public static void main(String[] args) {
		new Street02();
	
	}
}