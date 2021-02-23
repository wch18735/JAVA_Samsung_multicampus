package com.mulcam.j0108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gugudan2 {//기능 정의
  
  BufferedReader in;//null
  
  public Gugudan2() {//멤버필드에 대한 초기화코드, 선행작업
	  in = new BufferedReader(new InputStreamReader(System.in));
  }
	
	
  public int inputDan() throws IOException {//단입력 기능	  
	System.out.print("원하는 단? ");  
	int dan = Integer.parseInt(in.readLine());//입력시점
	              //"3" ----> 3	          
	return dan;  
  }
  //--------------------------------------------------------
  
  public String continueDan() throws IOException{//계속여부 묻는 기능	
	  
	System.out.print("계속(y/n)? ");  
	
	 String yn = in.readLine();//입력시점
	               
	 return yn;
  }//continueDan
  
  public void printDan(int dan){//특정단 출력 기능
	  //dan*1~dan*9
	  
	  for(int i=1; i<10; i++) {//1~9  
		  System.out.println(dan+"*"+i+"="+(dan*i));	  
	  }    
	  
	  //return;  
  }//printDan
}





