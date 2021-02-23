package com.mulcam.j0114;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

public class CheckboxTest extends Frame{
	
  Checkbox cb1,cb2,cb3,cb4;
  TextArea ta;
  Label la;
  
  Panel northp,southp;
	
  public CheckboxTest() {
    setTitle("체크박스테스트");	  
	  
	cb1 = new Checkbox("사과");  
	cb2 = new Checkbox("딸기",true);  
	
	//new Checkbox(String label, boolean state, CheckboxGroup group)
	CheckboxGroup cg = new CheckboxGroup();
	cb3 = new Checkbox("남자",true, cg);  
	cb4 = new Checkbox("여자",false, cg);
	
	ta = new TextArea();
	la = new Label("성별:");
	
	northp = new Panel();//기본레이아웃:Flow
	northp.setBackground(Color.yellow);
	  northp.add(cb1);
	  northp.add(cb2);
	
	southp = new Panel();
	southp.setBackground(Color.orange);
	  southp.add(la);
	  southp.add(cb3);
	  southp.add(cb4);
	  
	  
	add("North",northp);
	add("Center",ta);
	add("South", southp);
	
	setSize(300,300);
	setVisible(true);
	
  }//생성자
  
  public static void main(String[] args) {
	 new CheckboxTest();
  }//main
	
}



