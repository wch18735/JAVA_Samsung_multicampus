package com.mulcam.j0104;

public class Child extends Parent{
   int k=23;
   
   public Child() {
	 System.out.println("Child생성자");
   }
   
   void goodBye() {
	 System.out.println("잘가~!!");
   }
   
   void hello() {
	  System.out.println("자식안녕~!!");
   }//메소드 재정의(메소드 오버라이딩) 
   //오버라이딩: 접근제한자는 똑같거나 확장해야 함!!
   
}
