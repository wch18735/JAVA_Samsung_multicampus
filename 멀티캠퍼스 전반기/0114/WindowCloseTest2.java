package com.mulcam.j0114;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloseTest2 extends WindowAdapter{
//프레임 우측 상단 X버튼을 클릭했을때 닫기(프로그램 종료)
//관련 클래스(인터페이스) - WindowListener !!	
  Frame f;	
	
  
  public WindowCloseTest2() {
	f = new Frame();
	
	f.setTitle("창닫기테스트2");
	  
	f.setSize(300,300);
	f.setVisible(true);
	
	//이벤트소스: Frame  

	f.addWindowListener(this);
  }//생성자
    
  public void windowClosing(WindowEvent e) {//이벤트 핸들러
	 System.out.println("프로그램을 종료하겠습니다2~!!"); 
	 System.exit(0); 
  }  
  
  public static void main(String[] args) {
	 new WindowCloseTest2();
  }


}
