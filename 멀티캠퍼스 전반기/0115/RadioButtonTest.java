package com.mulcam.j0115;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class RadioButtonTest extends JFrame{
	JRadioButton rb1,rb2,rb3;
	JPanel panel;
	
	public RadioButtonTest() {
	  ImageIcon icon1= new ImageIcon("image/left.gif");
	  ImageIcon icon2= new ImageIcon("image/leftrollover.gif");
	  ImageIcon icon3= new ImageIcon("image/leftdown.gif");
	  
	  ImageIcon icon4= new ImageIcon("image/right.gif");
	  ImageIcon icon5= new ImageIcon("image/rightrollover.gif");
	  ImageIcon icon6= new ImageIcon("image/rightdown.gif");
		
		
	  //new JRadioButton(Icon icon);
	  //new JRadioButton(String text,Image icon)
	  //new JRadioButton(String text,boolean selected)
	  rb1 = new JRadioButton("ù��°������ư", icon1);	 
	    rb1.setRolloverIcon(icon2);
	    rb1.setSelectedIcon(icon3);
	    
	  rb2 = new JRadioButton("�ι�°������ư", icon4);
	    rb2.setRolloverIcon(icon5);
	    rb2.setSelectedIcon(icon6);
	  
	  rb3 = new JRadioButton("����°������ư");
	    rb3.setToolTipText("����°������ư�� ����...");
	  
	  
	  ButtonGroup group = new ButtonGroup();//�׷���
	    group.add(rb1);
	    group.add(rb2);
	    group.add(rb3);
	  
	  panel = new JPanel();
	  //panel.setBorder(Border border);//�׵θ� �Ӽ� ����
//	  panel.setBorder(new TitledBorder(
//			    new BevelBorder(BevelBorder.RAISED),"�г�Ÿ��Ʋ"));
	  panel.setBorder(new TitledBorder("�г�Ÿ��Ʋ"));
	  
	  panel.setLayout(new GridLayout(3,1));
	   panel.add(rb1);
	   panel.add(rb2);
	   panel.add(rb3);
	   
	  setTitle("������ư�׽�Ʈ"); 
	  add(panel);//JFrame : BorderLayout�⺻, "Center"�⺻
	  
	  setSize(300,300);
	  setVisible(true);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  
	}//������
	
	public static void main(String[] args) {
		new RadioButtonTest();
	}

}
