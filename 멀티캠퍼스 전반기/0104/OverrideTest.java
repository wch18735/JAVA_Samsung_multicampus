package com.mulcam.j0104;

class Parents{
  void hello() {}	
}

class Child1 extends Parents{
	void hello() {System.out.print("Hello");}}
class Child2 extends Parents{
	void hello() {System.out.print("╬хЁГ");}}
class Child3 extends Parents{
	void hello() {System.out.print("╫еб╔©ю");}}

class Test{
	void print(Parents c) {//(Child1 c) {//int c=100;  Child1 c = new Child1();
		c.hello();
	}
}

public class OverrideTest {
   public static void main(String[] args) {
	  Test t = new Test();
	  t.print(new Child3());//(100);
   }
}






