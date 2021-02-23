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
    setTitle("üũ�ڽ��׽�Ʈ");	  
	  
	cb1 = new Checkbox("���");  
	cb2 = new Checkbox("����",true);  
	
	//new Checkbox(String label, boolean state, CheckboxGroup group)
	CheckboxGroup cg = new CheckboxGroup();
	cb3 = new Checkbox("����",true, cg);  
	cb4 = new Checkbox("����",false, cg);
	
	ta = new TextArea();
	la = new Label("����:");
	
	northp = new Panel();//�⺻���̾ƿ�:Flow
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
	
  }//������
  
  public static void main(String[] args) {
	 new CheckboxTest();
  }//main
	
}



