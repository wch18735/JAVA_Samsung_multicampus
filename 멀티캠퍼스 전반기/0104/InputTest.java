package com.mulcam.j0104;

import java.io.IOException;

public class InputTest {
	
   public static void main(String[] args) throws IOException{
	 //아스키코드(자판)입력                              //현재메소드에서 예외처리를 떠 넘기겠음
	   
	 System.out.print("한 자리수를 입력:");  
	 int su= System.in.read();//실제 입력시점
	         System.in.read();//엔터키 처리
	         System.in.read();//엔터키 처리
	         
	 //------------------------------------
	 //   3엔터  -----> 51 13 10
	 //------------------------------------
	 
	 System.out.print("동일한 수를 다시 입력:");  
	 int su2= System.in.read()-48;//실제 입력시점
	 
	 System.out.println("당신이 입력한 수는 "+su2+"이고 그 수의 "
	 		         + "아스키코드값은 "+su+"입니다^^");
	 
	   
   }//main	

}
