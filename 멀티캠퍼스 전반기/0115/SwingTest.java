package com.mulcam.j0115;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest  extends JFrame {
   JButton bt;
	
   public SwingTest() {
	  setTitle("Swing�׽�Ʈ"); 
	  bt = new JButton
	("<html><font size=10 color=red face=�ü�ü>����ư</font></html>");
	  
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
	  
	  
   }//������	

   public static void main(String[] args) {
	   new SwingTest();
   }
}


