package com.mulcam.j0109;

public class GugudanTest {
/*
2*1=2   3*1=3   4*1=4       .....         9*1=9
2*2=4   3*2=6   4*2=8       .....         9*2=18

..............................................

2*9=18  3*9=27  4*9=36      .....         9*9=81  
 	
*/
  public static void main(String[] args) {
	 for(int i=1; i<10; i++) {//기준 (곱하여지는 수) *1~9
		 for(int dan=2; dan<10; dan++) {//단수 : 2~9
		   System.out.print(dan+"*"+i+"="+ (dan*i) +"  ");
		   if( (dan*i) < 10) System.out.print(" ");
		 }
		 System.out.println();
	 }
	 System.out.println("======================================");
	 for(int i=1; i<10; i++) {//기준 (곱하여지는 수) *1~9
		 for(int dan=2; dan<10; dan++) {//단수 : 2~9
		   System.out.print(dan+"*"+i+"="+ (dan*i) +"\t");
		 }
		 System.out.print("\n");
	 }
	 
	 System.out.println("======================================");
	 for(int i=1; i<10; i++) {//기준 (곱하여지는 수) *1~9
		 for(int dan=2; dan<10; dan++) {//단수 : 2~9
			 System.out.printf("%d*%d=%-5d", dan, i, (dan*i));
		 }
		 System.out.print("\n");
	 }
	 
	 
  }//main
}




