package com.mulcam.j0103;

public class Child extends Parent{
	//class 클래스명 extends 부모클래스명
	
  void print() {
	 System.out.println("자식프린트!!"); 
  }//오버라이딩(메소드 재정의)
	
  void hello() {
	 System.out.println("안녕~!!");
  }
  
  void hello(String name) {
	 System.out.println
	        ("안녕,"+name+"!!"); 
  }//오버로딩 메소드
}



