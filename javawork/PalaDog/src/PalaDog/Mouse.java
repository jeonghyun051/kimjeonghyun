package PalaDog;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Data;

@Data
public class Mouse extends JLabel {
	public ImageIcon mouseIcon;
	public Mouse mouse = this;
	public int x = 0;
	public int y = 250;
	public final static String TAG = "Mouse:";

	public Mouse() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				mouseIcon = new ImageIcon("images/mouse_walk.gif");
				setIcon(mouseIcon);
				setSize(80, 80);
				setLocation(x, y);
				MoveLight();

			}
		}).start();
	}

	public void MoveLight() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					mouse.x += 10;
					setLocation(x, y);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();

	}
}
