package com.mulcam.j0114;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class TextFieldAreaTest extends Frame{
  TextField tf1,tf2;
  TextArea ta;
  Label la;
  
  Panel northp; //�гο� �ٴ� ������Ʈ�� �Ӽ��� ��Ÿ���� ���ؼ� ���.
  Panel southp; //�� ������ �ΰ� �̻��� ������Ʈ ���϶� ���. 
	
  public TextFieldAreaTest() {
	 setTitle("TextFieldArea�׽�Ʈ"); 
	  
	 tf1 = new TextField("�⺻Text",15);//��� TextField  
	 //tf2 = new TextField(int columns);
	 tf2 = new TextField(15);//�ϴ� TextField
	 
	 ta = new TextArea();
	 la = new Label("�����̸�:");
	 
	 southp = new Panel();//�����̳�
	 //southp.setLayout(new FlowLayout()); //�⺻��
	 southp.setBackground(Color.YELLOW);//(new Color(255,255,0));
	 southp.setForeground(Color.red);
	   southp.add(la);//�����̳ʿ� ������Ʈ ���̱�
	   southp.add(tf2);
	   
	 northp = new Panel();
     //������ ����(Background), ���ڻ�����(Foreground)
	 //Color c = new Color(int red, int green, int blue)
	 //���� ������ ���� : 0~255
	  Color c = new Color(0,255,0);
	   northp.setBackground(c);
	 
	   northp.add(tf1);
	   
	 
	 //BorderLayout����!!(��ġ�����ؼ� ���̱�)
	 setLayout(new BorderLayout());
	  //add("North",tf1);
	  add("North",northp);
	  add("Center",ta);
	  //add("South",la); 
	  //add("South",tf2);
	  add("South",southp);
	  
	 setSize(300,300); 
	 setVisible(true);
  }//������
  
  public static void main(String[] args) {
	new TextFieldAreaTest();
  }
}





