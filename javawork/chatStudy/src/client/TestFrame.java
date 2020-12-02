package client;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;;

public class TestFrame extends JFrame{

   private JTextField chatF;
   private JTextArea chatA;
   private JPanel backGroundPanel;

   public TestFrame() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      setSize(500, 500);

      backGroundPanel = new JPanel();
      backGroundPanel.setLayout(new BorderLayout());
      setContentPane(backGroundPanel);
      uiInit();
      
      ClientThread ct = new ClientThread();
      ct.start();

      chatF.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == 10) {
               // Server로 전송
               String msg = chatF.getText();
               chatF.setText("");
               ct.send(msg);
            }
         }
      });

      setVisible(true);
   }

   private void uiInit() {
      chatF = new JTextField();
      chatA = new JTextArea();
      backGroundPanel.add(chatA, BorderLayout.CENTER);
      backGroundPanel.add(chatF, BorderLayout.SOUTH);
   }

   class ClientThread extends Thread{
      
      private Socket socket;
      private BufferedReader reader;
      private PrintWriter writer;
      
      public ClientThread() {
         //서버 연결
         try {
            socket = new Socket("localhost", 5000);
            writer = new PrintWriter(socket.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
         } catch (Exception e) {
            e.printStackTrace();
         } 
      }
      
      @Override
      public void run() {
         try {
            String line;
            while ((line = reader.readLine()) != null) {
               chatA.append(line+"\n");
               repaint();
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
      
      // UI쓰레드 사용
      public void send(String msg) {
          writer.println(msg);
      }
   }


   public static void main(String[] args) {
      new TestFrame();
   }
}
