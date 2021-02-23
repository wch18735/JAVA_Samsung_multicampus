package com.mulcam.j1228;

class A{
  void hello() {
	  System.out.println("A클래스 안녕~!!");
  }
}

class B{
	void hello() {
		System.out.println("B클래스 안녕~!!");
	}	
}

public class MethodCallTest {
  public static void main(String[] args) {
	System.out.println("main()메소드!!");
	
	//객체생성식 A obj = new A();
	         B  b = new B();
	         //B클래스가 갖는 멤버(필드,메소드)들의 메모리 할당.
	         //---> B클래스를 사용할 준비 작업 끝.
	         //사용법 :  주소변수명.필드명   참조변수명.메소드명();
	         // b.~  ==> B클래스에 있는~
	         
	         b.hello();//실제 호출
	         
         A a = new A();
           a.hello();
  }
}





