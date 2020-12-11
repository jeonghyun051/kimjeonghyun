package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import DarkDog.Zombie;
import PalaDog.Mouse;
import PalaDog.PalaDog;
import PalaDog.PalaDogPunch;

public class GamePanel extends JFrame {
	private MyPanel m1, m2;
	private Mouse mouse;
	private Zombie zombie;
	private PalaDog paladog;
	private PalaDogPunch punch;

	public GamePanel gamepanel;
	public ArrayList<Zombie> zombielist;
	public ArrayList<Mouse> mouselist;
	public int hp = 0;
	public int mp = 0;

	ImageIcon img, img2;
	JPanel panel;
	Image backimg;
	JLabel lblNewLabel_2, lblNewLabel, skillellabel;

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
		skillellabel = new JLabel("0/40");

		mouselist = new ArrayList<Mouse>();
		zombielist = new ArrayList<Zombie>();
		ZombieSoHwan zombiesohwan = new ZombieSoHwan();
		zombiesohwan.start();

		GoldLabel goldLabel = new GoldLabel();
		goldLabel.start();

		SkillLabel skilllabel = new SkillLabel();
		skilllabel.start();

		paladog = new PalaDog();

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

		lblNewLabel.setForeground(Color.cyan);
		lblNewLabel.setFont(new Font("", Font.PLAIN, 18));

		skillellabel.setBounds(660, 480, 57, 30);
		skillellabel.setForeground(Color.cyan);
		skillellabel.setFont(new Font("", Font.PLAIN, 18));

	}

	public void batch() {
		getContentPane().add(lblNewLabel);
		getContentPane().add(skillellabel);
		getContentPane().add(panel);
		panel.add(paladog);
		getContentPane().add(lblNewLabel_2);

	}

	public void listener() {

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == '1') {
					new Thread(new Runnable() {

						@Override
						public void run() {
							if (hp > 10) {
								System.out.println("스페이스바");
								mouse = new Mouse();
								mouselist.add(mouse);
								panel.add(mouse);
								hp -= 10;
								거리계산();
							}

						}
					}).start();

				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					paladog.moveLeft();
					System.out.println("팔라독 x좌표 : " + paladog.x);
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					paladog.moveRight();
					System.out.println("팔라독 x좌표 : " + paladog.x);
				}
				if (e.getKeyChar() == 'j') {
					if (mp > 10) {
						punch = new PalaDogPunch();
						panel.add(punch);
						punch.moveRight();
						punch.Punchx = paladog.x;
						punch.Punchy = paladog.y + 50;
						mp = mp - 10;
					}

				} else if (e.getKeyChar() == 'J') {
					punch = new PalaDogPunch();
					panel.add(punch);
					punch.moveRight();
					punch.Punchx = paladog.x;
					punch.Punchy = paladog.y + 50;
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					paladog.isLeft = false;
					paladog.Letf();

				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					paladog.isRight = false;
					paladog.Right();
				}
			}
		});

	}

	public class GoldLabel extends Thread {

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				while (hp < 40) {
					try {
						hp++;
//						System.out.println(hp);
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

	public class SkillLabel extends Thread {

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e1) {

					e1.printStackTrace();
				}
				while (mp < 40) {
					try {
						mp++;
						skillellabel.setText(mp + "/" + "40");
						Thread.sleep(500);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}

		}
	}

	public void 거리계산() {
		while (true) {
			for (int i = 0; i < mouselist.size(); i++) {
				for (int j = 0; j < zombielist.size(); j++) {
					if (zombielist.get(j).x < mouselist.get(i).x + 100) {
						mouselist.get(i).isMoving = false;
						zombielist.get(j).isMoving2 = false;

						mouselist.get(i).setLocation(mouselist.get(i).x, mouselist.get(i).y);
						zombielist.get(j).setLocation(zombielist.get(j).x, zombielist.get(j).y);

						/*
						 * if(mouselist.get(i).isMoving==false) {
						 * mouselist.get(i).setIcon(mouse.mouse_attackIcon);
						 * zombielist.get(j).setVisible(false);
						 * mouselist.get(i).setLocation(mouselist.get(i).x, mouselist.get(i).y); }
						 */

					}
					System.out.println("쥐" + i + "번" + mouselist.get(i).x);
					System.out.println("좀비" + j + "번" + zombielist.get(j).x);

					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {

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
