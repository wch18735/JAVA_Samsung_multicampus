package com.mulcam.j0102;

public class HakjumTest {
  public static void main(String[] args) {
	int jumsu=100;	
	/*  <������ ã��>
	     99/10 : 9
	     95/10 : 9
	     90/10 : 9
	 */	
	switch(jumsu/10) {//(jumsu) {	  
	  case 10:
	  case 9: System.out.println("A�����Դϴ�!!"); break;
	  case 8: System.out.println("B�����Դϴ�!!"); break;
	  case 7: System.out.println("C�����Դϴ�!!"); break;
	  case 6: System.out.println("D�����Դϴ�!!"); break;
	  default: System.out.println("F�����Դϴ�!!");
	}	
  }//main
}
