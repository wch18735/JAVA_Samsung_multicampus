package com.mulcam.j0114;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class Abc extends WindowAdapter{
   @Override
  public void windowClosing(WindowEvent e) {//이벤트 핸들러
	System.out.println("프로그램을 종료하겠습니다3~!!");
  }
}


public class WindowCloseTest3 extends Frame{
//프레임 우측 상단 X버튼을 클릭했을때 닫기(프로그램 종료)
//관련 클래스(인터페이스) - WindowListener !!	
  
  public WindowCloseTest3() {
	setTitle("창닫기테스트3");
	  
	setSize(300,300);
	setVisible(true);
	
	//이벤트소스: Frame  

    Abc a = new Abc();
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("프로그램을 종료하겠습니다3~!!");
			System.exit(0);
		}
	});
  }//생성자
    
  
  
  public static void main(String[] args) {
	 new WindowCloseTest3();
  }


}
