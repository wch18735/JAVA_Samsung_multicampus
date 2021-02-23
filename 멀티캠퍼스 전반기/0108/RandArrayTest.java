package com.mulcam.j0108;

import java.util.Random;

public class RandArrayTest {//배열에 랜덤한 값(임의의 수) 입력하기
    int []su;
    Random r;
    
    public RandArrayTest() {
	   su=new int[5];//5개의 정수를 입력할 수 있는 방 생성
	   r = new Random();
	}//생성자
    
    public void printArray() {//현재 배열이 갖는 값을 출력
       for (int i = 0; i < su.length; i++) {
		  System.out.println("su["+i+"]="+su[i]);
	   }	
    }//printArray
    
    public void inputArray() {
       //난수발생 - java.lang.Math:    random()   
   	   //        java.util.Random:   next() 
    	
       for (int i = 0; i < su.length; i++) {
		  //su[i]=난수;
    	   //su[i]= Math.random();   int i=13.45;
    	   //su[i]= (int)Math.random();   //int i=(int)13.45;
    	            //0.0  ~ 0.9999999
    	   
    	   //su[i]=(int)(Math.random()*1000); // 0.0 ~ 999.99999
    	   //r.nextInt(int bound);  //0~ bound전까지
    	   su[i]=r.nextInt(2000);
	   }	
    	
    	
    }//inputArray
    
    
    public void sortArray() {//배열값에 대한 정렬(오름차순,내림차순)
      int []data= { 47, 35,  29, 58, 99};
               //   [0] [1]  [2] [3] [4]
      
      
       int temp;//임시변수
      for(int i=0; i< su.length-1; i++) {//비교할 왼쪽 데이터 (기준)  0~3 
    	  for(int j=i+1; j<su.length; j++) {//비교할 오른쪽 데이터    1~4
    		      //i=0  j=1,2,3,4
    		      //i=1  j=2,3,4
    		      //i=2  j=3,4
    		      //i=3  j=4
    		  //su[i]==>왼쪽데이터  su[j]==>오른쪽데이터
    		 
    		 //if(su[i] > su[j]) {//왼쪽 데이터가 크다면(오름차순정렬)ascending
   			 if(su[i] < su[j]) {//오른쪽 데이터가 크다면(내림차순정렬)decending
    	      //데이터 교환식		 
    		  temp =su[i];
    		  su[i]=su[j];
    		  su[j]=temp;
    		 }
    	  }//for
      }//for
      
      
    }
	
	
	public static void main(String[] args) {
		RandArrayTest rat = new RandArrayTest();
		 rat.inputArray();
		 rat.sortArray();
		 rat.printArray();
	}
}




