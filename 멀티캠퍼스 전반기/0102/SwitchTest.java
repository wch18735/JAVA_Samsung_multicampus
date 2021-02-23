package com.mulcam.j0102;

public class SwitchTest {
   int su;//== int su=0;	
	
   public static void main(String[] args) {
	  int year;//지역변수는 반드시 초기화해서 사용해야 함!!
	      year=2020;
	  
	  /*
	     <break제어문>
	     -switch문 또는 반복문내에서만 사용
	     -특정 블럭을 벗어나는 역할을 수행.
	   */
	      
	  switch(year) {
	     case 1995: 
	    	 System.out.println("자바가 발표된 해입니다!!");
	    	 break;//switch블럭을 벗어나라!!
	     case 2019:
	    	 System.out.println("황금돼지 해입니다!!");
	    	 break;
	     default:
	    	 System.out.println(year +"년 입니다!!");	    	 
	  }//switch
	   
	   
   }//main
}//class end
