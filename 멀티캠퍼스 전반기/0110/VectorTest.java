package com.mulcam.j0110;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
	
   public static void main(String[] args) {
	 //new Vector(int initialCapacity,int capacityIncrement)
	 //initialCapacity: ���Ϳ뷮(��ũ��)
	 //capacityIncrement: ����ġ(���ο� �����Ͱ� �Էµɶ� �����ϴ� ��)
	   
	 Vector v = new Vector(5,3);
	 System.out.println("���Ϳ뷮(��ũ��): "+ v.capacity());
	 System.out.println("���� ��Ұ���: "+ v.size());//��
	 
	 //���ʹ� ��ü�� ���� ������ �����ϴ� Ŭ����!!
	 
	 //v.addElement(Object obj);
	 //Integer i = new Integer(13);  i:��������
	 
	 for(int i=1; i<9; i++) {
		 v.addElement(new Integer(i));
	 }
	 
	 int i=1; int j=2;  int k=3;
	 Integer u = new Integer(4);
	 
	 int y= new Integer(5);
	 Integer z = 6;
	 
	 v.addElement(9); //AutoBoxing  UnBoxing
	 
	 System.out.println("���Ϳ뷮(��ũ��): "+ v.capacity());
	 System.out.println("���� ��Ұ���: "+ v.size());//��
	 
	 v.addElement(3.14);
	 v.addElement(5.67);
	 
	 v.addElement("�ڹ�");
	 
	 
	 if(v.contains(3.14)) {//��Ҹ� �����ϸ� ���� true
		 System.out.println("3.14�� ����!!");
	 }
	 
	 System.out.println("v�� ù��° ���: "+ v.firstElement());
	 System.out.println("v�� ������ ���: "+ v.lastElement());
	 
	 //���� v�� ��ü ��� ���	 
     Enumeration enu = v.elements();
     //Enumeration: ������ �������̽�
     //[1,2,3,4,5,6,7,8,9, 3.14,  5.67, "�ڹ�"]
     
     while(enu.hasMoreElements()) {
       System.out.println(enu.nextElement());
     }
	  
   }//main	

}












