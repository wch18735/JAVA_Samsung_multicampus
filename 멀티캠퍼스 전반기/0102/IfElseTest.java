package com.mulcam.j0102;

public class IfElseTest {
   public static void main(String[] args) {
	  //윤년 평년
	   
	  //윤년의 조건
	  int year=2020;
	  boolean b1 = year%4 == 0;
	  boolean b2 = year%100 != 0;
			 
	  boolean b3 = year%400 == 0;
		  
	  boolean result = (b1 && b2) || b3;
	  
	  if(result) {//result==true
		 System.out.println(year+"년은 윤년입니다!!");		 
	  } else {//result==false
  	     System.out.println(year+"년은 평년입니다!!");
	  }

	  //주민번호 7번째 숫자 - 1,2,3,4,5,6,7,8
	  int gender=1;//2;

	 if(gender % 2 == 0   )//gender가 짝수라면 
	  System.out.println("여자입니다!!");
	 else
	  System.out.println("남자입니다!!");
	  
	  
   }//main
}





