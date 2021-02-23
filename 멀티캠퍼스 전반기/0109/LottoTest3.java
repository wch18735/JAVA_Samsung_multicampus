package com.mulcam.j0109;

import java.util.Random;

public class LottoTest3 {
  public static void main(String[] args) {
	//사고의 전환(처음부터 중복을 허용하지 않게 하기!!)
	  
	  int []lotto = new int[45];
	  
	  for (int i = 0; i < lotto.length; i++) {
		lotto[i]= i+1;  
		//System.out.println("lotto["+i+"]="+lotto[i]);
	  }
	  
	  //번호섞어주기 (0번지와 랜덤한 번지의 값들을 서로 교환)
	  int temp;
	  
	  Random r = new Random();
	  
	  for(int i=0; i<1000; i++) {//섞어주는 횟수
		int rIdx = r.nextInt(44)+1; //0번지를 제외한 1번지~44번지
	    temp     = lotto[0];
	    lotto[0] = lotto[rIdx];
        lotto[rIdx] = temp;
	  }
	  
	  for (int i = 0; i < lotto.length; i++) {			 
		System.out.println("lotto["+i+"]="+lotto[i]);
      }
	  
	  System.out.println("★★로또번호★★");
	  for(int i=0; i<6; i++) {
		System.out.print(lotto[i]); 
		if(i<5)System.out.print(", "); 
	  }
	  
  }//main

}






