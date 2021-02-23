package com.mulcam.j0108;

import java.io.IOException;

public class Gugudan {//기능 정의
  
  public int inputDan() throws IOException {//단입력 기능
		   
	System.out.print("원하는 단? ");  
	int dan = System.in.read()-48;//입력시점
	          System.in.read();
	          System.in.read();
	return dan;  
  }
  
  public void printDan(int dan){//특정단 출력 기능
	 //dan*1~dan*9
	  
	for(int i=1; i<10; i++) {//1~9  
     System.out.println(dan+"*"+i+"="+(dan*i));	  
	}    
	  
	//return;  
  }//printDan
  
  public char continueDan() throws IOException{//계속여부 묻는 기능
	System.out.print("계속(y/n)? ");  
	char yn = (char)System.in.read();//입력시점
	          System.in.read();
	          System.in.read();     
	 return yn;
  }//continueDan
  
}





