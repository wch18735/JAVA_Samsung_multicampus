package com.mulcam.j0103;

public class ContinueTest {
  //숫자 1에서 10까지 더한 값을 화면에 출력하시오. (1+2+3+....+9+10)
	
	public static void main(String[] args) {
	   int sum=0,n=1;
	   boolean flag=true;
	   
	 /*
	            ※제어문
	    1.break;
	      -switch문 또는 반복문에서만 사용
	      -switch블럭 또는 반복문 블럭을 벗어나는 역할.
	      
	    2.continue;
	      -반복문(for,while,do~while)에서만 사용
	      -반복블럭을 계속 진행시키는 역할.
	        for문 경우: 증감연산자로 분기
	        while,do~while문 경우: 조건식으로 분기         
	 */
	   
	   
	   while(flag) {
		 sum+=n;//0+1+...+10  
		  
		 n++;
		 if(n <= 10) continue;
		 //1.> 2.< 3.==  4. >=  5.<=
		 
		 flag=false;
	   }//while
	   
	   System.out.println("sum="+sum);
	   System.out.println("n="+n);
	}//main
}
