package com.mulcam.j0108;

import java.util.Arrays;

public class ArraysTest {
	
  public static void main(String[] args) {
	 int []su= {999,88,709, 150,45};
	 
	 Arrays.sort(su);
	 
	 for (int i = 0; i < su.length; i++) {//0~4
	   System.out.println("su["+i+"]="+su[i]);	
	 }
	 
	 System.out.println("-----------내림차순결과-------------");
	 for (int i = su.length-1; i > -1; i--) {//4~0
		 System.out.println("su["+i+"]="+su[i]);	
	 }
	 System.out.println("===========================");
	 //'A'--> 65   'a'--> 97
	 char []ch= {'j','B','a','A','v','a'};
	 Arrays.sort(ch);
	 for (int i = 0; i < ch.length; i++) {
		   System.out.println("ch["+i+"]="+ch[i]);	
	 }
	 
	 System.out.println("===========================");
	 String []str= {"홍길동","길라임","김주원","이순신"};
	 Arrays.sort(str);
	 for (int i = 0; i < str.length; i++) {
		 System.out.println("str["+i+"]="+str[i]);
	 }
	 
  }//main	

}



