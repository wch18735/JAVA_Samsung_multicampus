package com.mulcam.j0114;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridTest extends Frame{
   Button b1,b2,b3,b4,b5,b6;	
	
   public GridTest() {
     b1 = new Button("1");   
     b2 = new Button("2");   
     b3 = new Button("3");   
     b4 = new Button("4");   
     b5 = new Button("5");   
     b6 = new Button("6");
     
     //new GridLayout(): �࿭ ������ ��ġ ���
     //new GridLayout(int rows,int cols);
 //new GridLayout(rows, cols, hgap, vgap)
     setTitle("�׸����׽�Ʈ");
     //setLayout(new GridLayout(2,3));
     setLayout(new GridLayout(2,3,0,10));
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(b5);
      //add(b6);
     
	 setSize(500, 300);
	 setVisible(true);
   }//������
   
   
   public static void main(String[] args) {
	  new GridTest();
   }
}
