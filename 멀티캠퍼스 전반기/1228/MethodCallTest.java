package com.mulcam.j1228;

class A{
  void hello() {
	  System.out.println("AŬ���� �ȳ�~!!");
  }
}

class B{
	void hello() {
		System.out.println("BŬ���� �ȳ�~!!");
	}	
}

public class MethodCallTest {
  public static void main(String[] args) {
	System.out.println("main()�޼ҵ�!!");
	
	//��ü������ A obj = new A();
	         B  b = new B();
	         //BŬ������ ���� ���(�ʵ�,�޼ҵ�)���� �޸� �Ҵ�.
	         //---> BŬ������ ����� �غ� �۾� ��.
	         //���� :  �ּҺ�����.�ʵ��   ����������.�޼ҵ��();
	         // b.~  ==> BŬ������ �ִ�~
	         
	         b.hello();//���� ȣ��
	         
         A a = new A();
           a.hello();
  }
}





