package com.mulcam.j0115;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest  extends JFrame {
   JButton bt;
	
   public SwingTest() {
	  setTitle("Swing테스트"); 
	  bt = new JButton
	("<html><font size=10 color=red face=궁서체>나버튼</font></html>");
	  
	  add(bt);
	  
	  setSize(300,300);
	  setVisible(true);
	  
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  
//	  addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
	  
	  
   }//생성자	

   public static void main(String[] args) {
	   new SwingTest();
   }
}


