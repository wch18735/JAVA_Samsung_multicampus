package com.mulcam.j0114;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardTest extends Frame 
                     implements ActionListener{
	
   //CardLayout�׽�Ʈ - ���� ��ġ����
   
   Panel redp,  bluep, yellowp;
   Button bt1,  bt2,   bt3;
	
   Panel p1,     p2,    p3; //ī�� 
	
   CardLayout card;
   
   public CardTest() {
	  card= new CardLayout();
	  
	  redp = new Panel();
	   redp.setBackground(Color.red);
	  bluep = new Panel();
	   bluep.setBackground(Color.blue);
	  yellowp = new Panel();
	   yellowp.setBackground(Color.yellow);
	  
	  bt1 = new Button("����");//301ȣ
	  bt2 = new Button("����");//302ȣ
	  bt3 = new Button("����");//303ȣ
	  
	  p1 = new Panel();
	    p1.setLayout(new BorderLayout());
	    p1.add("Center", redp);
	    p1.add("South", bt1);
	    
	  p2 = new Panel();
	    p2.setLayout(new BorderLayout());
	    p2.add("Center",bluep);
	    p2.add("South",bt2);
	    
	  p3 = new Panel();
	    p3.setLayout(new BorderLayout());
	    p3.add("Center",yellowp);
	    p3.add("South",bt3);
	   
	  setTitle("ī�巹�̾ƿ�");
	  setLayout(card);
	  
	  //ī�带 �����̳�(�Ǵ� ������Ʈ)�� ���϶� ����(alias)�� �־ ���̱�!!
	  //add("����",p1);//����
	  add("a1",p1);//����
	  add("a2",p2);//�Ķ�
	  add("a3",p3);//���
	    
	  //Ư�� ī�带 �տ� ���̱� ����!!
	  //card.show(Container parent,String name);
	  // ��    ������                   ���                ������
	  card.show(this, "a3");
	  
	  setSize(250,300);
	  setVisible(true);
	  
	  addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
	  });
	  
	  bt1.addActionListener(this);
	  bt2.addActionListener(this);
	  bt3.addActionListener(this);
	  
   }//������
   
   @Override
   public void actionPerformed(ActionEvent e) {
	 Object ob =  e.getSource();
	   //���� �޼ҵ带 ȣ���� �̺�Ʈ�ҽ��� �ּ�(301ȣ ,  302ȣ,  303ȣ)
	   
	 if(ob==bt1)//(����ī��ؿ� ��ưŬ����)  
	  //System.out.println("�Ķ���ī�庸�̱�");
	   card.show(this,"a2");	 
	 else if(ob==bt2)//(�Ķ�ī��ؿ� ��ưŬ����)
	  //System.out.println("�����ī�庸�̱�");
	   card.show(this, "a3");	 
	 else //if(���ī��ؿ� ��ưŬ����)
	  //System.out.println("������ī�庸�̱�");
	   card.show(this, "a1"); 
	   
	   
   }//�̺�Ʈ ó����
   
   
   public static void main(String[] args) {
	  new CardTest();
   }


}
