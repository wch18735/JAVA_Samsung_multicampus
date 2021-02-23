package com.mulcam.j0114;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderTest extends Frame{
   //컨테이너, 컴포넌트 선언	
   Button bt1,bt2,bt3,bt4,bt5;
	
   public BorderTest(String title) {
	super(title);//부모 생성자 호출
	   
	setTitle("타이틀 변경");
    //컨테이너, 컴포넌트 객체생성!!
	bt1 = new Button("1");   
	bt2 = new Button("2");   
	bt3 = new Button("3");   
	bt4 = new Button("4");   
	bt5 = new Button("5");	   
	   
    //레이아웃설정, 붙이기   
	//this.setLayout(new BorderLayout());
	setLayout(new BorderLayout());
	add("North",bt1);//보더레이아웃의 경우 붙이는 위치 표시
	add("East",bt2);//문자열로 위치 표현하는 경우 첫글자 대문자로 표현
	add("South",bt3);
	add("West",bt4);
	add("Center",bt5);
		   
	//마무리 (사이즈,보이기 설저)
	setSize(300,300);
	setVisible(true);
   }//생성자
   
   public static void main(String[] args) {
	  new BorderTest("Border테스트");
   }
}








