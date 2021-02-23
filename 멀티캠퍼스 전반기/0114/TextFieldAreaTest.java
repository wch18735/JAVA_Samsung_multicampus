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
  
  Panel northp; //패널에 붙는 컴포넌트의 속성을 나타내기 위해서 사용.
  Panel southp; //한 영역에 두개 이상의 컴포넌트 붙일때 사용. 
	
  public TextFieldAreaTest() {
	 setTitle("TextFieldArea테스트"); 
	  
	 tf1 = new TextField("기본Text",15);//상단 TextField  
	 //tf2 = new TextField(int columns);
	 tf2 = new TextField(15);//하단 TextField
	 
	 ta = new TextArea();
	 la = new Label("파일이름:");
	 
	 southp = new Panel();//컨테이너
	 //southp.setLayout(new FlowLayout()); //기본값
	 southp.setBackground(Color.YELLOW);//(new Color(255,255,0));
	 southp.setForeground(Color.red);
	   southp.add(la);//컨테이너에 컴포넌트 붙이기
	   southp.add(tf2);
	   
	 northp = new Panel();
     //바탕색 설정(Background), 글자색설정(Foreground)
	 //Color c = new Color(int red, int green, int blue)
	 //색깔 정수의 범위 : 0~255
	  Color c = new Color(0,255,0);
	   northp.setBackground(c);
	 
	   northp.add(tf1);
	   
	 
	 //BorderLayout설정!!(위치설정해서 붙이기)
	 setLayout(new BorderLayout());
	  //add("North",tf1);
	  add("North",northp);
	  add("Center",ta);
	  //add("South",la); 
	  //add("South",tf2);
	  add("South",southp);
	  
	 setSize(300,300); 
	 setVisible(true);
  }//생성자
  
  public static void main(String[] args) {
	new TextFieldAreaTest();
  }
}





