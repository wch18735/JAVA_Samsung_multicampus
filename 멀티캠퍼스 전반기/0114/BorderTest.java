package com.mulcam.j0114;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderTest extends Frame{
   //�����̳�, ������Ʈ ����	
   Button bt1,bt2,bt3,bt4,bt5;
	
   public BorderTest(String title) {
	super(title);//�θ� ������ ȣ��
	   
	setTitle("Ÿ��Ʋ ����");
    //�����̳�, ������Ʈ ��ü����!!
	bt1 = new Button("1");   
	bt2 = new Button("2");   
	bt3 = new Button("3");   
	bt4 = new Button("4");   
	bt5 = new Button("5");	   
	   
    //���̾ƿ�����, ���̱�   
	//this.setLayout(new BorderLayout());
	setLayout(new BorderLayout());
	add("North",bt1);//�������̾ƿ��� ��� ���̴� ��ġ ǥ��
	add("East",bt2);//���ڿ��� ��ġ ǥ���ϴ� ��� ù���� �빮�ڷ� ǥ��
	add("South",bt3);
	add("West",bt4);
	add("Center",bt5);
		   
	//������ (������,���̱� ����)
	setSize(300,300);
	setVisible(true);
   }//������
   
   public static void main(String[] args) {
	  new BorderTest("Border�׽�Ʈ");
   }
}








