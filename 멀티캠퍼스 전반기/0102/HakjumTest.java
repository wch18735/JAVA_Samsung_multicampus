package com.mulcam.j0102;

public class HakjumTest {
  public static void main(String[] args) {
	int jumsu=100;	
	/*  <공통점 찾기>
	     99/10 : 9
	     95/10 : 9
	     90/10 : 9
	 */	
	switch(jumsu/10) {//(jumsu) {	  
	  case 10:
	  case 9: System.out.println("A학점입니다!!"); break;
	  case 8: System.out.println("B학점입니다!!"); break;
	  case 7: System.out.println("C학점입니다!!"); break;
	  case 6: System.out.println("D학점입니다!!"); break;
	  default: System.out.println("F학점입니다!!");
	}	
  }//main
}
