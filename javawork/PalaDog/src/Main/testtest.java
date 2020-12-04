package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class testtest extends JFrame {

	public testtest() {

		setSize(760, 575);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 984, 538);
		getContentPane().add(panel);

		panel.setLayout(null);
		getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("123");
		ImageIcon img = new ImageIcon("images/background_img3.png");
		lblNewLabel.setIcon(img);

		lblNewLabel.setBounds(0, 0, 743, 377);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 373, 743, 165);
		panel.add(lblNewLabel_1);
		ImageIcon img2 = new ImageIcon("images/mainbottom.jpg");
		lblNewLabel_1.setIcon(img2);

		setVisible(true);

	}

	public static void main(String[] args) {
		new testtest();
	}
}
