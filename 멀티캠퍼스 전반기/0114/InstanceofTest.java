package com.mulcam.j0114;

class A{}
class B extends A{}
class C extends B{}

public class InstanceofTest {
   public static void main(String[] args) {
       A a = new A();
       B b = new B();
       C c = new C();
       
       if(a instanceof A) {
    	  System.out.println("a�� AŬ���� ��ü~!!"); 
    	  //a���۷��� ���� AŬ���� ��� �׼��� ����?
       }
       
       if(a instanceof C) {
    	   System.out.println("a�� CŬ���� ��ü~!!");     	   
       }else {
    	   System.out.println("a�� CŬ���� ��ü�ƴ�~!!");
       }
       
       if(c instanceof A) {
    	   System.out.println("c�� AŬ���� ��ü~!!");     	   
       }else {
    	   System.out.println("c�� AŬ���� ��ü�ƴ�~!!");
       }
       
   }
}


