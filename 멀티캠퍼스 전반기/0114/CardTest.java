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
	
   //CardLayout테스트 - 같은 위치정렬
   
   Panel redp,  bluep, yellowp;
   Button bt1,  bt2,   bt3;
	
   Panel p1,     p2,    p3; //카드 
	
   CardLayout card;
   
   public CardTest() {
	  card= new CardLayout();
	  
	  redp = new Panel();
	   redp.setBackground(Color.red);
	  bluep = new Panel();
	   bluep.setBackground(Color.blue);
	  yellowp = new Panel();
	   yellowp.setBackground(Color.yellow);
	  
	  bt1 = new Button("다음");//301호
	  bt2 = new Button("다음");//302호
	  bt3 = new Button("다음");//303호
	  
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
	   
	  setTitle("카드레이아웃");
	  setLayout(card);
	  
	  //카드를 컨테이너(또는 컴포넌트)에 붙일때 별명(alias)을 넣어서 붙이기!!
	  //add("별명",p1);//빨강
	  add("a1",p1);//빨강
	  add("a2",p2);//파랑
	  add("a3",p3);//노랑
	    
	  //특정 카드를 앞에 보이기 설정!!
	  //card.show(Container parent,String name);
	  // 를    보여라                   어디에                무엇을
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
	  
   }//생성자
   
   @Override
   public void actionPerformed(ActionEvent e) {
	 Object ob =  e.getSource();
	   //현재 메소드를 호출한 이벤트소스의 주소(301호 ,  302호,  303호)
	   
	 if(ob==bt1)//(빨강카드밑에 버튼클릭시)  
	  //System.out.println("파랑색카드보이기");
	   card.show(this,"a2");	 
	 else if(ob==bt2)//(파랑카드밑에 버튼클릭시)
	  //System.out.println("노랑색카드보이기");
	   card.show(this, "a3");	 
	 else //if(노랑카드밑에 버튼클릭시)
	  //System.out.println("빨강색카드보이기");
	   card.show(this, "a1"); 
	   
	   
   }//이벤트 처리부
   
   
   public static void main(String[] args) {
	  new CardTest();
   }


}
