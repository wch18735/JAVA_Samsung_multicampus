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
  //Scrollbar,Choice,List�׽�Ʈ
  //���̾ƿ����ٴ� �� ������Ʈ�� �Ӽ��� �˾ƺ���.
  Label la;
  Scrollbar sb;
  Choice cho;
  List list;
  
  Panel leftTop, scrollp, leftBottom;
	
  public ComponentTest() {
	la = new Label("����");
//Scrollbar(int orientation,int value,int visible,int minimum,int maximum) 
//orientation: ����Ǵ� ����, value :������ ������ġ
//visible: ������ �ʺ�,  min: ��ǥ �ּҰ�  , max:��ǥ �ִ밪
	sb = new Scrollbar
			(Scrollbar.HORIZONTAL,0, 10, 0,100);
	
	cho = new Choice();
	  //cho.add(String item);
	  cho.add("����");
	  cho.add("�λ�");
	  cho.add("����");
	  cho.add("����");
	  cho.add("����");
	  
	//new List(int rows, boolean multipleMode)
	 //rows: ���÷��� ���� ����, multipleMode: ���߼���
	  
	list = new List(3, true);
	  list.add("�߱�");
	  //list.addItem("�౸");
	  list.add("�౸");
	  list.add("��");
	  list.add("�豸");
	  list.add("�߱�2");
	  list.add("�౸2");
	  list.add("��2");
	  list.add("�豸2");
	
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
	 
	//��ü�����ӼӼ�
	setTitle("���־�������Ʈ �׽�Ʈ");
	setLayout(new GridLayout(2,2));
	 add(leftTop);
	 add(cho);
	 //add(list);
	 add(leftBottom);
	 
   	setSize(500,300); 
	setVisible(true);
	
  }//������
  
  public static void main(String[] args) {
	 new ComponentTest();
  }
	
}




