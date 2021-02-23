package com.mulcam.j1228;

public class LeapYearTest {
   public static void main(String[] args) {//프로그램시작
	 int year=2016;
	 String name="홍길동";
	 int i = year%4;
	 boolean b1 = year%4 == 0;
	 boolean b2 = year%100 != 0;
	 
	 boolean b3 = year%400 == 0;
	 
	 System.out.println(b1);
	 System.out.println(b2);
	 System.out.println(b3);
	 
	 System.out.println("결과값:"+ (b1 && b2 || b3));
	   
   }//프로그램 끝
}



