package bubblebubble;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel{


	public Player player = this;
	public final static String TAG = "Player:";

	public ImageIcon icPlayerR, icPlayerL;
	public int x = 55;
	public int y = 535;
	public boolean isRight = false;
	public boolean isLeft = false;
	public boolean isUp = false;
	public boolean isDown = false;
	
	public int floor = 1; //535, 2��415 295 177
	
	public Player() {
	icPlayerR = new ImageIcon("image/playerR.png");	
	icPlayerL = new ImageIcon("image/playerL.png");	
	setIcon(icPlayerR);
	setSize(50,50);
	setLocation(x,y);
	
	}
	
	public void moveRight() {
		System.out.println(TAG+"moveRight");
		
		if(isRight==false) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					setIcon(icPlayerR);
					isRight = true;
					while (isRight) {
						x++;
						setLocation(x, y); //���ο� repaint() ����
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}				
				}
			}).start();
		}
	}
	
	public void moveLeft() {
		System.out.println(TAG+"moveLeft");
		
		if(isLeft==false) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					setIcon(icPlayerL);
					isLeft = true;
					while (isLeft) {
						x--;
						setLocation(x, y); //���ο� repaint() ����
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}				
				}
			}).start();
		}
		
	}
	public void moveJump() {
		moveUp();
//		moveDown();
	}
	
	public void moveUp() {
		System.out.println(TAG+"moveUp");
		if(isUp==false) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					isUp = true;
					while (isUp) {
						y--;
						setLocation(x, y); //���ο� repaint() ����
						
						try {
							if(y==415) {
								break;
								}
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}			
					
					moveDown();
				}
			}).start();
		}
	}
	
	public void moveDown() {
		System.out.println(TAG+"moveDown");
//		if(isDown==false) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					isDown = true;
					while (isDown) {
						y++;
						setLocation(x, y); //���ο� repaint() ����
						if (floor == 1 && /*x��ǥ*/ y>535) {
							break;
						}
						
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}			isUp = false;	
				}
			}).start();
		}
	
	
	//���� ����
	public void attack() {
		
	}
	
}