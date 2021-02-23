package com.mulcam.j0114;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Scrollbar;

public class ComponentTest extends Frame{
  //Scrollbar,Choice,List테스트
  //레이아웃보다는 각 컴포넌트의 속성을 알아보자.
  Label la;
  Scrollbar sb;
  Choice cho;
  List list;
  
  Panel leftTop, scrollp, leftBottom;
	
  public ComponentTest() {
	la = new Label("빨강");
//Scrollbar(int orientation,int value,int visible,int minimum,int maximum) 
//orientation: 수평또는 수직, value :조절바 시작위치
//visible: 조절바 너비,  min: 좌표 최소값  , max:좌표 최대값
	sb = new Scrollbar
			(Scrollbar.HORIZONTAL,0, 10, 0,100);
	
	cho = new Choice();
	  //cho.add(String item);
	  cho.add("서울");
	  cho.add("부산");
	  cho.add("광주");
	  cho.add("진주");
	  cho.add("제주");
	  
	//new List(int rows, boolean multipleMode)
	 //rows: 디스플레이 행의 갯수, multipleMode: 다중선택
	  
	list = new List(3, true);
	  list.add("야구");
	  //list.addItem("축구");
	  list.add("축구");
	  list.add("농구");
	  list.add("배구");
	  list.add("야구2");
	  list.add("축구2");
	  list.add("농구2");
	  list.add("배구2");
	
	leftBottom = new Panel();
	  leftBottom.add(list);
	  
	  
	scrollp = new Panel();
	  scrollp.setLayout(new BorderLayout());
	  scrollp.add("West", la);
	  scrollp.add("Center", sb);
	  
	leftTop = new Panel();
	 leftTop.setBackground(Color.yellow);
	 leftTop.setLayout(new GridLayout(3,1,0,20));
	 leftTop.add(new Label());
	 leftTop.add(scrollp);
	 //leftTop.add(comp);
	 
	//전체프레임속성
	setTitle("비주얼컴포넌트 테스트");
	setLayout(new GridLayout(2,2));
	 add(leftTop);
	 add(cho);
	 //add(list);
	 add(leftBottom);
	 
   	setSize(500,300); 
	setVisible(true);
	
  }//생성자
  
  public static void main(String[] args) {
	 new ComponentTest();
  }
	
}




