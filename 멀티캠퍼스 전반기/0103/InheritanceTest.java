package com.mulcam.j0103;


public class InheritanceTest {
   public static void main(String[] args) {
	
	  //hello()�޼ҵ� ȣ�� ����?
	   
	  //A  obj = new A();
	  Child c = new Child(); 
	  //c.~~  ChildŬ������ �ִ�~
	  
	  c.hello();

	  //�θ�Ŭ������ �޼ҵ带 ȣ��.
	  c.goodBye();
	  
	  c.toString();
	  //c.abc();
	  c.print();
	  
	  c.hello();
	  c.hello("�浿");
	  
   }
}
