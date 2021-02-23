package com.mulcam.j0103;


public class InheritanceTest {
   public static void main(String[] args) {
	
	  //hello()메소드 호출 가능?
	   
	  //A  obj = new A();
	  Child c = new Child(); 
	  //c.~~  Child클래스에 있는~
	  
	  c.hello();

	  //부모클래스의 메소드를 호출.
	  c.goodBye();
	  
	  c.toString();
	  //c.abc();
	  c.print();
	  
	  c.hello();
	  c.hello("길동");
	  
   }
}
