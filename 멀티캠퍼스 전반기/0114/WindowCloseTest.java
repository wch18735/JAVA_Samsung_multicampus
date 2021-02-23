package com.mulcam.j0114;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowCloseTest extends Frame 
                             implements WindowListener{
//프레임 우측 상단 X버튼을 클릭했을때 닫기(프로그램 종료)
//관련 클래스(인터페이스) - WindowListener !!	
  
  public WindowCloseTest() {
	setTitle("창닫기테스트1");
	  
	setSize(300,300);
	setVisible(true);
	
	//이벤트소스: Frame  
	
	//this.addWindowListener(this);
	addWindowListener(this);
  }//생성자
    
  public void windowOpened(WindowEvent e) {}    
  public void windowClosing(WindowEvent e) {//이벤트 핸들러
	 System.out.println("프로그램을 종료하겠습니다~!!"); 
	 System.exit(0); 
  }  
  public void windowClosed(WindowEvent e) {}  
  public void windowIconified(WindowEvent e) {}  
  public void windowDeiconified(WindowEvent e) {}  
  public void windowActivated(WindowEvent e) {}
  public void windowDeactivated(WindowEvent e) {}
  
  public static void main(String[] args) {
	 new WindowCloseTest();
  }


}
