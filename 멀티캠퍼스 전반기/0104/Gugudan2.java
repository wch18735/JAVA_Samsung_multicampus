package com.mulcam.j0104;

import java.io.IOException;

public class Gugudan2 {
  public static void main(String[] args) throws IOException {
	
	  System.out.println("#구구단 출력#");
	  
	  System.out.print("시작단?");
	  int start = System.in.read()-48;
	              System.in.read();
	              System.in.read();
	  
	  System.out.print("끝단?");
	  int end = System.in.read()-48;

	  
	 for(int dan=start; dan<=end; dan++) { //기준수:단수(예 3~6) 
		
	  System.out.println("<"+dan+"단>");	 
      //dan=3,   4,    5,   6		 
	  for(int i=1; i<10; i++) {//자주 변경되는 수: 곱하여지는 수(1~9)
		  System.out.println(dan+"*"+i+"="+(dan*i));	  
	  }
	  System.out.println();
	  
	  
	 } 
  }//main
}




