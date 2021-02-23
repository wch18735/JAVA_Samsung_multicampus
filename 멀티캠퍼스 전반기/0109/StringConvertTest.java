package com.mulcam.j0109;

public class StringConvertTest {

  public static void main(String[] args) {
	//String클래스 - 고정된 문자열 표현 (한번 초기화된 문자열은 계속 유지되어야 함)
	//StringBuffer클래스 - 가변문자열 표현
	  
	 String s1="우리나라";
	 String s2="대한민국";
	 
	 s1 = s1+s2;
	 System.out.println(s1);
	 /*
	   1. String클래스객체 생성
	   2. 문자열 변환 작업을 위해 임시로 StringBuffer클래스객체 생성
	   3. append()메소드 실행
	   4. 결과값을 문자열 저장
	   5. StringBuffer클래스객체 소멸  
	   
	   s1+s2+s3+s4
	 */
	 
	 System.out.println("======================");
     StringBuffer sb = new StringBuffer("우리나라");
     sb.append("대한민국");
     
     System.out.println(sb);
     /*
        1. StringBuffer클래스객체 생성
        2. append()메소드 실행
        
        append(s1).append(s2).append(s3)
      */
	 
  }//main	
	
}



