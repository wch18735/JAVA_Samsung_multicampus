package com.mulcam.j0104;//현재 클래스의 위치를 표현 package 패키지명;

import com.mulcam.j0103.A;
//다른패키지에 있는 클래스를 현재 클래스에 가져와서 사용하겠음!!
//가져오고자 하는 클래스의 위치를 표현!!
// import 패키지명.클래스명;

//import com.mulcam.j0103.A;

class Abc{
   String str;
   
   Abc(){//기본생성자
     this("자바");//또 다른 생성자를 호출
	 System.out.println("기본생성자!!");
	 //str="자바";
	 
   }
   
   Abc(String str){
	 System.out.println("오버로딩생성자!!");
	 //str=str;//지역매개변수=지역매개변수
	 this.str=str;//멤버변수=지역매개변수
   }
}


public class ThisTest {
   public static void main(String[] args) {
	  Abc a =    new           Abc();
	  //     (동적)메모리할당         생성자호출!!
	  
	  System.out.println("str="+ a.str);
	  System.out.println("=========================");
	  Abc a2 = new Abc("파이썬");
	  System.out.println("str="+ a2.str);
	  
	  A a3 = new A();
	  
   }
}





