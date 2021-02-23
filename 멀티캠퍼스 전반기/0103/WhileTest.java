package com.mulcam.j0103;

public class WhileTest {
  public static void main(String[] args) {
	//숫자 1에서 10까지 더한 값을 화면에 출력하시오. (1+2+3+....+9+10)
	  
	int sum=0;
	int n=1;
	
	while(true) {
	  
		sum+=n;//sum = sum+n;//0+1+2+...+10
	  
	  if(n++ == 10)break;
	}//1.<  2.>  3.== 4.<=  5.>=
	         
	System.out.println("sum="+sum);//55
	
  }//main
}


