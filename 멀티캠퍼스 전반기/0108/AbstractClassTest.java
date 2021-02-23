package com.mulcam.j0108;

abstract class Shape{
   void hello() {System.out.println("안녕하세요~!!");}
   abstract void draw();//접근제한자? default
}

class Triangle extends Shape{
   void draw() {System.out.println("삼각형 그리기~!!");}	
}

class Rectangle extends Shape{
	@Override
	protected void draw() {System.out.println("사각형 그리기~!!");}	
}

class Circle extends Shape{
	@Override
	public void draw() {System.out.println("원 그리기~!!");}
}


public class AbstractClassTest {
   public static void main(String[] args) {
       Shape s; //= new Shape(); 추상클래스 자체로 객체생성 불가	
             s = new Triangle();//자식클래스 객체생성하여 사용(자식은 부모다!!)
             s = new Rectangle();
             s = new Circle();
             
       s.draw();      
   }
}








