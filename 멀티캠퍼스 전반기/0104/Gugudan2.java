package com.mulcam.j0104;

import java.io.IOException;

public class Gugudan2 {
  public static void main(String[] args) throws IOException {
	
	  System.out.println("#������ ���#");
	  
	  System.out.print("���۴�?");
	  int start = System.in.read()-48;
	              System.in.read();
	              System.in.read();
	  
	  System.out.print("����?");
	  int end = System.in.read()-48;

	  
	 for(int dan=start; dan<=end; dan++) { //���ؼ�:�ܼ�(�� 3~6) 
		
	  System.out.println("<"+dan+"��>");	 
      //dan=3,   4,    5,   6		 
	  for(int i=1; i<10; i++) {//���� ����Ǵ� ��: ���Ͽ����� ��(1~9)
		  System.out.println(dan+"*"+i+"="+(dan*i));	  
	  }
	  System.out.println();
	  
	  
	 } 
  }//main
}




