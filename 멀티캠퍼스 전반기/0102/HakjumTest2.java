package com.mulcam.j0102;

public class HakjumTest2 {
	//if~else if~else사용한 학점 구하기
	public static void main(String[] args) {
	   int jumsu=100;//0~100
	   
	   //if(90<=jumsu<=100) { ==> 에러발생: jumsu에 대하여 각각 비교해야 함
	   if(jumsu<0 ||  jumsu>100) {//적절하지 못한 데이터가 입력되었을때
		   System.out.println("#범위(0~100)내의 정수만 입력!!");
	   }else
	   if(jumsu>=90) {//if(jumsu>=90  && jumsu<=100)
		 System.out.println("A학점");  
	   }else //jumsu<90
		   if(jumsu>=80) {
			   System.out.println("B학점");
		   }else if(jumsu>=70) {
			   System.out.println("C학점");
		   }else if(jumsu>=60) {
			   System.out.println("D학점");
		   }else {//위의 네개if에 거짓인 결과
			   System.out.println("F학점");
		   }
	   
	}

}
