package com.mulcam.j0102;

public class IfTest {
   public static void main(String[] args) {
	  int year=2020;
	  
	  boolean b1 = year%4 == 0;
      boolean b2 = year%100 != 0;
		 
	  boolean b3 = year%400 == 0;
	  
	  boolean result = (b1 && b2) || b3;
	   
	  System.out.println("ture출력:"+ true);
	  System.out.println("!ture출력:"+ !true);
	  
	 if(result) //if(result==true) { 
	  System.out.println("윤년입니다!!");
	 
	 
	 if(!result) { //if(result==false) {
	  System.out.println("평년입니다!!");
	  System.out.println(year+"년은 평년입니다!!");
	 }
	 
   }//main
}//class end





