package com.mulcam.j0110;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
	
   public static void main(String[] args) {
	 //new Vector(int initialCapacity,int capacityIncrement)
	 //initialCapacity: 벡터용량(방크기)
	 //capacityIncrement: 증가치(새로운 데이터가 입력될때 증가하는 값)
	   
	 Vector v = new Vector(5,3);
	 System.out.println("벡터용량(방크기): "+ v.capacity());
	 System.out.println("벡터 요소갯수: "+ v.size());//★
	 
	 //벡터는 객체에 대한 참조를 저장하는 클래스!!
	 
	 //v.addElement(Object obj);
	 //Integer i = new Integer(13);  i:참조변수
	 
	 for(int i=1; i<9; i++) {
		 v.addElement(new Integer(i));
	 }
	 
	 int i=1; int j=2;  int k=3;
	 Integer u = new Integer(4);
	 
	 int y= new Integer(5);
	 Integer z = 6;
	 
	 v.addElement(9); //AutoBoxing  UnBoxing
	 
	 System.out.println("벡터용량(방크기): "+ v.capacity());
	 System.out.println("벡터 요소갯수: "+ v.size());//★
	 
	 v.addElement(3.14);
	 v.addElement(5.67);
	 
	 v.addElement("자바");
	 
	 
	 if(v.contains(3.14)) {//요소를 포함하면 리턴 true
		 System.out.println("3.14를 포함!!");
	 }
	 
	 System.out.println("v의 첫번째 요소: "+ v.firstElement());
	 System.out.println("v의 마지막 요소: "+ v.lastElement());
	 
	 //벡터 v의 전체 요소 출력	 
     Enumeration enu = v.elements();
     //Enumeration: 열거형 인터페이스
     //[1,2,3,4,5,6,7,8,9, 3.14,  5.67, "자바"]
     
     while(enu.hasMoreElements()) {
       System.out.println(enu.nextElement());
     }
	  
   }//main	

}












