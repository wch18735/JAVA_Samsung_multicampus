package com.mulcam.j1228;

//class A{  }   ---> 자바 클래스
//class A{ main(){} }   ---> 자바 Application(자바응용프로그램)
//                      ---> 독립적으로 실행할 수 있는 프로그램!!


public class OperatorTest {
   public static void main(String[] args) {
	  int su1=10;
	  int su2=3;//5;
	  
	  
	  //1+2+"3"    3+"3"  "33"
	  //"1"+2+3    "12"+3   "123"
	  System.out.println(1+2+"3");
	  System.out.println("1"+2+3);
	  
	  //su1과 su2의 사칙연산
	  System.out.println("su1+su2 =" + (su1+su2) );
	                     // 문자열        +  더한결과값
	  System.out.println(su1+ "-" + su2 +"="+ (su1-su2) );
	  System.out.println(su1+ "*" + su2 +"="+ (su1*su2) );
	  System.out.println(su1+ "/" + su2 +"="+ (su1/su2) );
	  System.out.println(su1+ "%" + su2 +"="+ (su1%su2) );
	  
	  System.out.println("===========================");
	  
	  int su3=10;
	  int su4=10;
	  
	  int sum3=0;
	  int sum4=0;
	  
	  //su3의 1증가된 값을 sum3에 저장
	     sum3 = su3++;
	  System.out.println("sum3="+ sum3 +", su3="+ su3);
	     
	  //su4의 1증가된 값을 sum4에 저장
	     sum4 = ++su4;
      System.out.println("sum4="+ sum4 +", su4="+ su4);
	  
	  int su5=10;
	  int su6=10;
	  //su5의 값을 2증가하시오
	    //su5= su5+2;
	     su5 += 2;
	  System.out.println("su5="+ su5);
	  //su6의 값을 4증가하시오
	    su6 += 4;
	  System.out.println("su6="+ su6);
	    
	    //현재 su6값에 3배는?   su6 = su6*3;
	    su6 *= 3;
      System.out.println("su6="+ su6);
	   
   }//main
}//class



