package com.mulcam.j0103;

public class ArrayTest {
  public static void main(String[] args) {
	 int []su= {11,22,33,44,55,66};
	 //인덱스         0  1  2  3
	 
	 //배열은 번지를 이용해서 사용(번지를 통해 각 데이터를 구분)
	 /*
	  System.out.println("su[0]="+ su[0] ); 
	  System.out.println("su[1]="+ su[1] );
	  System.out.println("su[2]="+ su[2] ); 
	  System.out.println("su[3]="+ su[3] );
	  System.out.println("su[4]="+ su[4] );
	*/
	 
	 System.out.println("배열의 크기(요소갯수)="+ su.length);
	 
	 for(int i=0; /*i<4*/ i<su.length; i++) {//0~3표현
		 System.out.println("su[" +i+  "]="+ su[i] );  
	 }
	 
  }
}




