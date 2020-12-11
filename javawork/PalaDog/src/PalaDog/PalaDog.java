package PalaDog;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class PalaDog extends JLabel{
	public PalaDog Paladog = this;
	public int x=0;
	public int y = 160;
	public boolean isRight = false;
	public boolean isLeft = false;
	public boolean isPunch = true;   
	public ImageIcon icPaladogR,icPaladogL, icPaladogRM, icPaladogLM;

	
	public PalaDog() {
		setSize(500,200);
		//�̹��� ����
		icPaladogRM = new ImageIcon("images/PaladogRightMove.gif");
		icPaladogLM = new ImageIcon("images/PaladogLeftMove.gif");
		icPaladogR = new ImageIcon("images/PaladogRight.png");
		icPaladogL = new ImageIcon("images/PaladogLeft.png");
		setIcon(icPaladogR);
		setLocation(x, y);
		System.out.println("�ȶ� ���´�");

	}
	public void Right() {
		setIcon(icPaladogR);
	}
	public void Letf() {
		setIcon(icPaladogR);
	}
	
	
	public void moveRight() {
	     if(isRight==false) {
	         new Thread(new Runnable() {
	            
	            @Override
	            public void run() {
	               setIcon(icPaladogRM);
	               isRight = true;
	               while (isRight) {
	                  x++;
	                  setLocation(x, y); //���ο� repaint() ����
	                  try {
	                	  if(x>570) {
	                		  break;
	                	  }
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
	      if(isLeft==false) {
	          new Thread(new Runnable() {
	             
	             @Override
	             public void run() {
	                setIcon(icPaladogLM);
	                isLeft = true;
	                while (isLeft) {
	                   x--;
	                   setLocation(x, y); //���ο� repaint() ����
	                   try {
	                	   if(x==0) {
	                		   break;
	                	   }
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
}
