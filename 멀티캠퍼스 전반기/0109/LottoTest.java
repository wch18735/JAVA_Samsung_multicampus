package com.mulcam.j0109;

import java.util.Random;

public class LottoTest {
   public static void main(String[] args) {
	   //6개의 정수 데이터를 저장 ---> 배열
	  int [] lotto = new int[6];//[0]번지~[5]번지 방생성
	  //배열 객체 생성: 자료형 []배열명 = new 자료형[배열크기];
	  Random r = new Random();	  
	  
//	  for (int i = 0; i < lotto.length; i++) {//배열인덱스표현:0~5
//		 lotto[i]= r.nextInt(45)+1; //0~44  --- +1 ---> 1~45
//	  }
	  
	  lotto[0]=r.nextInt(45)+1;
	 
	 do { 
	  lotto[1]=r.nextInt(45)+1;
	 }while(lotto[1]==lotto[0]);//while(반복할 조건식);
	  
	 do {
	  lotto[2]=r.nextInt(45)+1;
	 }while(lotto[2]==lotto[0] || lotto[2]==lotto[1]);
	 
	 do {
	  lotto[3]=r.nextInt(45)+1;
	 }while(lotto[3]==lotto[0] || lotto[3]==lotto[1] || 
			lotto[3]==lotto[2]);
	 
	 do {
	  lotto[4]=r.nextInt(45)+1;
	 }while(lotto[4]==lotto[0] || lotto[4]==lotto[1] || 
			lotto[4]==lotto[2] || lotto[4]==lotto[3]);
	 
	 do {
	  lotto[5]=r.nextInt(45)+1;
	 }while(lotto[5]==lotto[0] || lotto[5]==lotto[1] || 
			lotto[5]==lotto[2] || lotto[5]==lotto[3] ||
			lotto[5]==lotto[4]);
	 
	 //결과값 출력
	 for (int i = 0; i < lotto.length; i++) {//배열인덱스표현:0~5
		 System.out.println("lotto["+i+"]="+lotto[i]); 
	 }
		  
	  
	   
   }//main
}




