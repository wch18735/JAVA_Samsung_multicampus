package com.mulcam.j0114;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest {
  //컨테이너, 컴포넌트 선언	
  Button bt1,bt2,bt3,bt4,bt5;
  Frame f;
	
  public FlowTest() {
	//컨테이너, 컴포넌트 객체생성!!(NullPointer예외 발생 방지)
	//new Button(String label)
	bt1 = new Button("첫번째버튼");
	bt2 = new Button("두번째버튼");
	bt3 = new Button("세번째버튼");
	bt4 = new Button("네번째버튼");
	bt5 = new Button("다섯번째버튼");
	
	//new Frame(String title)
	f = new Frame("Flow테스트");
	  
	//FlowLayout fl = new FlowLayout();
	//f.setLayout(fl);  
	f.setLayout(new FlowLayout());//가운데 정렬  
	f.add(bt1);//프레임에 버튼을 붙여라
	f.add(bt2);//프레임에 버튼을 붙여라
	f.add(bt3);//프레임에 버튼을 붙여라
	f.add(bt4);//프레임에 버튼을 붙여라
	f.add(bt5);//프레임에 버튼을 붙여라
	//컨테이너.add(붙일 컴포넌트)
	  
	
	//마무리(컨테이너 사이즈, 보이기)
	//f.setSize(int width, int height);
	f.setSize(300, 300);
	f.setVisible(true);
	
  }//생성자
  
  public static void main(String[] args) {
	//FlowTest ft = new FlowTest();
	   new FlowTest();
  }
}
