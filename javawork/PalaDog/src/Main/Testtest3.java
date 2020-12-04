//팔라독 게임화면

package Main;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Testtest3 extends JFrame {

	ImageIcon img, img2;
	JPanel panel;
	Image backimg;
	JLabel lblNewLabel_2;

	public Testtest3() {

		init();
		batch();
		setting();
		batch();

		setVisible(true);

	}

	public void init() {

		panel = new MyPanel();
		img = new ImageIcon("images/background_img3.png");
		backimg = img.getImage();
		img2 = new ImageIcon("images/mainbottom.jpg");
		lblNewLabel_2 = new JLabel();
	}

	public void batch() {

		getContentPane().add(panel);
		getContentPane().add(lblNewLabel_2);
	}

	public void setting() {

		setSize(760, 574);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(panel);
		panel.setBounds(0, 0, 743, 375);
		panel.setLayout(null);
		lblNewLabel_2.setIcon(img2);
		lblNewLabel_2.setBounds(0, 372, 743, 165);

	}

	class MyPanel extends JPanel {

		public MyPanel() {

			setFocusable(true);

		}

		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			g.drawImage(backimg, 0, 0, this);
		}
	}

	public static void main(String[] args) {
		new Testtest3();
	}
}
