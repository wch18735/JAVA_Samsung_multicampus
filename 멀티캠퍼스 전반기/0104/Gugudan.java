package com.mulcam.j0104;

public class Gugudan {//javac Gugudan.java   ----> Gugudan.class
	                  //java  Gugudan 홍길동 길라임
	                  //          String []args={"홍길동","길라임"};
                      //java  Gugudan 3
	                  //          String []args={"3"};
	
  public static void main(String[] args) {
	//3단 출력
/*
3*1=3      
3*2=6      
.....      
3*8=24      
3*9=27 
*/
/*	  
	  System.out.println(3+"*"+1+"="+(3*1)); 
	  System.out.println(3+"*"+2+"="+(3*2));
	  
	  System.out.println(3+"*"+8+"="+(3*8)); 
	  System.out.println(3+"*"+9+"="+(3*9)); 
	  
      for(int i=1; i<10; i++) {//1~9표현
    	  System.out.println(3+"*"+i+"="+(3*i));
      }
*/	  
	  
	  
	  //메인메소드의 파라미터를 이용한 데이터 전달!!
	  
	  //int dan=5; 
	  int dan= Integer.parseInt(args[0]); //String []args={"3"};
	                    // Integer.parseInt("3"); ---> 3
	  
	  for(int i=1; i<10; i++) {//1~9표현
    	  System.out.println(dan+"*"+i+"="+(dan*i));
      }
	  
	  
  }//main
}




