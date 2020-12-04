package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import DarkDog.Zombie;
import PalaDog.Mouse;
import lombok.Data;

public class GamePanel extends JFrame {
	private MyPanel m1, m2;
	private Mouse mouse;
	private Zombie zombie;
	public ArrayList<Zombie> zombielist;
	public int hp = 0;

	ImageIcon img, img2;
	JPanel panel;
	Image backimg;
	JLabel lblNewLabel_2, lblNewLabel;

	public GamePanel() {

		init();
		setting();
		batch();
		listener();

		setVisible(true);

	}

	public void init() {

		panel = new MyPanel();
		img = new ImageIcon("images/background_img3.png");
		backimg = img.getImage();
		img2 = new ImageIcon("images/mainbottom.jpg");
		lblNewLabel_2 = new JLabel();
		lblNewLabel = new JLabel("0/40");
		zombielist = new ArrayList<Zombie>();
		ZombieSoHwan zombiesohwan = new ZombieSoHwan();
		zombiesohwan.start();
		GoldLabel goldLabel = new GoldLabel();
		goldLabel.start();
	}

	public void setting() {

		setSize(760, 574);
		setLocationRelativeTo(null); // 프레임을 중앙배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(panel);
		panel.setBounds(0, 0, 743, 375);
		panel.setLayout(null);
		lblNewLabel_2.setIcon(img2);
		lblNewLabel_2.setBounds(0, 372, 743, 165);

		lblNewLabel.setBounds(538, 480, 57, 30);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("", Font.PLAIN, 18));
	}

	public void batch() {

		getContentPane().add(panel);
		getContentPane().add(lblNewLabel_2);

	}

	public void listener() {

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					if (hp > 10) {
						System.out.println("스페이스바");
						mouse = new Mouse();
						panel.add(mouse);
						hp -= 10;
					}
				}
			}
		});

	}

	public class GoldLabel extends Thread {

		@Override
		public void run() {
			while (true) {
				while (hp < 40) {
					try {
						hp++;
						System.out.println(hp);
						lblNewLabel.setText(hp + "/" + "40");
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
	}

	class ZombieSoHwan extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 20; i++) {
				zombie = new Zombie();
				zombielist.add(zombie);
				panel.add(zombie);

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	class MyPanel extends JPanel {
//		public MyPanel() {
//			setFocusable(true);
//		}

		@Override
		public void paintComponent(Graphics g) {

			super.paintComponent(g);

			g.drawImage(backimg, 0, 0, this);
		}
	}

}
