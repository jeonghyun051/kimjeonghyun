//팔라독 게임화면 움직이는거

package Main;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import PalaDog.Mouse;

public class Testtest2 extends JFrame {

	Mouse mouse = new Mouse();
	ImageIcon backIc = new ImageIcon("images/background_img3.png");
	Image backImg = backIc.getImage();

	int back1X = 0;
	int back2X = backImg.getWidth(null);

	public Testtest2() {
		setSize(760, 575);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JPanel panel = new MyPanel();
		panel.setBounds(0, 0, 743, 375);
		panel.add(mouse);
		add(panel);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 372, 743, 165);
		ImageIcon img2 = new ImageIcon("images/mainbottom.jpg");
		lblNewLabel.setIcon(img2);
		add(lblNewLabel);

		setVisible(true);

	}

	class MyPanel extends JPanel {

		public MyPanel() {
			setFocusable(true);
			new Thread(new Runnable() {

				@Override
				public void run() {
					while (true) {

						back1X--;
						back2X--;

						if (back1X < -(backImg.getWidth(null))) {
							back1X = backImg.getWidth(null);
						}
						if (back2X < -(backImg.getWidth(null))) {
							back2X = backImg.getWidth(null);
						}

						repaint();

						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

				}
			}).start();
		}

		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			g.drawImage(backImg, back1X, 0, this);
			g.drawImage(backImg, back2X, 0, this);
		}

	}

	public static void main(String[] args) {

		new Testtest2();
	}
}
