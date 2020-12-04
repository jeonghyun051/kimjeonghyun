package test;

import javax.swing.*;

import lombok.Data;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GraphicsDrawImageEx2 extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsDrawImageEx2() {
		setTitle("팔라독");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					for (int i = 0; i < 10; i++) {
						panel.ha += 10;
						repaint();
					}
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					for (int i = 0; i < 10; i++) {
						panel.ha -= 10;
						repaint();
					}
				}
			}
		});

		setSize(1000, 500);
		setVisible(true);
	}

	@Data
	class MyPanel extends JPanel {
		private int ha = 30;
		private ImageIcon icon = new ImageIcon("images/back1.png");
		private ImageIcon icon2 = new ImageIcon("images/field1.png");
		private ImageIcon icon3 = new ImageIcon("images/mouse.jpg");
		private Image img = icon.getImage();
		private Image img2 = icon2.getImage();
		private Image img3 = icon3.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			// 이미지를 패널 크기로 조절하여 그린다
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.drawImage(img2, 0, getHeight() - 50, getWidth(), 50, this);
			g.drawImage(img3, getHa(), getHeight() - 300, 200, 300, this);

		}

	}

	/*
	 * class Thread1 extends JPanel implements Runnable{ private int ha=0; private
	 * ImageIcon icon = new ImageIcon("images/bear.jpg"); private Image img =
	 * icon.getImage(); public void paintComponents(Graphics g) { // TODO
	 * Auto-generated method stub super.paintComponents(g); g.drawImage(img, ha,
	 * getHeight()-300, 200,300, this); } public void run() { while(true) { ha++;
	 * repaint(); try { Thread.sleep(1000); } catch (InterruptedException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); } }
	 * 
	 * 
	 * } }
	 */
	public static void main(String[] args) {
		new GraphicsDrawImageEx2();
	}
}