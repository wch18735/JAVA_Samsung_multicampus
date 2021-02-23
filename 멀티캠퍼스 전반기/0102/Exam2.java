package com.mulcam.j0102;

public class Exam2 {
  public static void main(String[] args) {
	System.out.println("巩力2)");  
	for(int i=1; i<6;  i++) {//1~5
		System.out.print(i+" "); // "1 "
	}//for
	
	System.out.println();
	System.out.println("================");
	System.out.println("巩力3)");
	
	for(int i=5; i>0;  i--) {//5~1
		System.out.print(i+" "); // 
	}//for
	
	System.out.println();
	System.out.println("================");
	System.out.println("巩力4)");
	
	for(int i=3; i<13;  i+=3) {//3 6 9 12
		System.out.print(i+" "); // 
	}//for
	
	System.out.println();
	System.out.println("================");
	System.out.println("巩力5)");
	
	System.out.print("[");
	for(int i=5; i<21;  i=i+5) {// [5, 10, 15, 20]
		System.out.print(i);
		if(i<20) {
		 System.out.print(", ");
		}
	}//for
	System.out.print("]");
  }
}


