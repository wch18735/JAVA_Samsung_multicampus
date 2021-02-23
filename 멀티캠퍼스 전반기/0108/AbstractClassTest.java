package com.mulcam.j0108;

abstract class Shape{
   void hello() {System.out.println("�ȳ��ϼ���~!!");}
   abstract void draw();//����������? default
}

class Triangle extends Shape{
   void draw() {System.out.println("�ﰢ�� �׸���~!!");}	
}

class Rectangle extends Shape{
	@Override
	protected void draw() {System.out.println("�簢�� �׸���~!!");}	
}

class Circle extends Shape{
	@Override
	public void draw() {System.out.println("�� �׸���~!!");}
}


public class AbstractClassTest {
   public static void main(String[] args) {
       Shape s; //= new Shape(); �߻�Ŭ���� ��ü�� ��ü���� �Ұ�	
             s = new Triangle();//�ڽ�Ŭ���� ��ü�����Ͽ� ���(�ڽ��� �θ��!!)
             s = new Rectangle();
             s = new Circle();
             
       s.draw();      
   }
}








