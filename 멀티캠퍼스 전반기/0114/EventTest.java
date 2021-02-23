package com.mulcam.j0114;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest extends Frame implements ActionListener{
   int cnt;
   Button bt;	
   //이벤트(사건): 버튼을 눌렀을때, 체크박스를 체크했을때, 마우스를 움직였을때
   //           키보드를 눌렀을때, 스크롤 조절바를 움직였을때
   
   //==> bt를 눌렀을때 (이벤트!!)
        //==> 이벤트를 발생시킨 컴포넌트 : Event Source ★
        //==> 분석: ActionEvent
                  //==> ActionListener (인터페이스)
   
   //==> 화면 콘솔에 '안녕'을 출력.   
        //==> 기능 추가 : Event Handler ★
   
   
   public EventTest() {
	  setTitle("이벤트테스트");
      bt = new Button("나버튼");
      
      setLayout(new FlowLayout());
      add(bt);
      
      setSize(300, 300);
      setVisible(true);
      
      //소스.add리스너명(핸들러위치);
      bt.addActionListener(this);
   }//생성자
   
   @Override
   public void actionPerformed(ActionEvent e) {//이벤트 핸들러(처리부)
	  cnt++;
     //추가적인 기능 정의!!
	  System.out.println("안녕~!!");
	  setTitle("이벤트테스트-"+cnt);
	  
	  //프로그램종료
	  System.exit(0);//음수:   시스템에게 비정상적인 종료를 하겠다고 알림   
	                 //0,양수:  시스템에게 정상적인 종료를 하겠다고 알림
	   
   }
   
   
   public static void main(String[] args) {
	  new EventTest();
   }

}
