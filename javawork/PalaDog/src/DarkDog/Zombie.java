package DarkDog;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.GamePanel;
import PalaDog.Mouse;
import lombok.Data;

public class Zombie extends JLabel {
	public ImageIcon zombieIcon, zombie_attackIcon;

	public GamePanel gamepanel;
	public Zombie zombie = this;
	public int x = 800;
	public int y = 240;
	public final static String TAG = "Zombie:";
	public Boolean isMoving = true;

	public Zombie() {

		new Thread(new Runnable() {
			@Override
			synchronized public void run() {
				zombieIcon = new ImageIcon("images/zombie_walk.gif");
				zombie_attackIcon = new ImageIcon("images/zombie1.png");
				setIcon(zombieIcon);
				setSize(90, 90);
				setLocation(x, y);
				MoveLeft();

			}
		}).start();
	}

	public void MoveLeft() {
		new Thread(new Runnable() {

			@Override
			synchronized public void run() {
				while (isMoving) {
					zombie.x -= 10;
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