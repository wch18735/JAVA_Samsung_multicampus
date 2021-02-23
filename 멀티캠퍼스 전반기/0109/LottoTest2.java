package com.mulcam.j0109;

import java.util.Arrays;
import java.util.Random;

public class LottoTest2 {
  int []lotto;
  Random r;
  
  public LottoTest2() {
	lotto=new int[6];
	r = new Random();
  }//생성자
  	
  public void printNum(int no) {//번호 출력
    //출력형식) 2, 12, 15, 34, 36, 42
	Arrays.sort(lotto);  
	
	System.out.print(" "+no+"회: ");
	for (int i = 0; i < lotto.length; i++) {//0~5
	  System.out.print(lotto[i]);
	  if(i< lotto.length-1)System.out.print(", ");	
	}
	System.out.println();
  }//printNum
  
  public void generateNum() {//번호 생성
	for (int i = 0; i < lotto.length; i++) {
		lotto[i]=r.nextInt(45)+1;//랜덤한 수 입력
		//boolean flag = duplicateNumCheck(i);
		//if(flag) {i--;}//중복데이터 발견시
		if(duplicateNumCheck(i)) {i--;}
	}  
  }//generateNum
  
  public boolean duplicateNumCheck(int idx) {
	//중복검사 (중복데이터 발견시 true리턴)
	//입력된수 1(idx):0,  2:0,1  3:0,1,2  4:0,1,2,3  5:0,1,2,3,4
	
	for(int i=0; i<idx; i++) {// ':'뒤에 수를 표현
	   if(lotto[idx] ==  lotto[i]) return true;	//중복데이터 발견시  
	} 
	  
    return false;	  
  }
  
	
  public static void main(String[] args) {
	  LottoTest2 lotto = new LottoTest2();
	 System.out.println("★★ 금주 행운의 로또번호 ★★");
	 for(int i=1; i<6; i++) {//번호 횟수 정의 (5회)
	   lotto.generateNum();	   
	   lotto.printNum(i);		 
	 }
	  
  }//main
}






