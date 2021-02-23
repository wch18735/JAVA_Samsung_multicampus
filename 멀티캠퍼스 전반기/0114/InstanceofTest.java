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
    	  System.out.println("a는 A클래스 객체~!!"); 
    	  //a레퍼런스 통해 A클래스 멤버 액세스 가능?
       }
       
       if(a instanceof C) {
    	   System.out.println("a는 C클래스 객체~!!");     	   
       }else {
    	   System.out.println("a는 C클래스 객체아님~!!");
       }
       
       if(c instanceof A) {
    	   System.out.println("c는 A클래스 객체~!!");     	   
       }else {
    	   System.out.println("c는 A클래스 객체아님~!!");
       }
       
   }
}


