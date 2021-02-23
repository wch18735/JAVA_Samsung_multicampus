package com.mulcam.j0108;

public class Car {
   String carName;//null  ---> "소나타"
   int wheelNum;//0       ---> 4
   int velocity;//0       ---> 100
    
   public Car(String carName, int wheelNum, int velocity) {	
	 //생성자: 멤버초기화 코드
	this.carName = carName;
	this.wheelNum = wheelNum;
	this.velocity = velocity;
   }

  public boolean equals(Car c) {//두 객체간의 내용 비교
	 if(carName == c.carName &&
	    wheelNum == c.wheelNum &&
	    velocity == c.velocity)
	  {
		  return true;
	  }
	 else {
		 return false;
	 }
	 
   }//equals
   
   public String toString() {//문자열 변환기능 메소드, 객체의 상태를 표현하는 메소드
	  String str="이 차는 "+ this.carName+"이고 바퀴수는 "+
                 wheelNum+"이고 속도는 "+velocity;
	  return str;
   }//toString
   
   public static void main(String[] args) {
	  //자동차 클래스에 대한 객체 생성
	   Car c1 = new Car("소나타",4,100);
	   Car c2 = c1;//new Car("소나타",4,100);
	   
	   Car c3;
	   
	       c3 = c1;
	   
	  System.out.println(c1.toString());
	                 // ----
	                 // this	   
	   
	  //★ c1과 c2를 비교 (1.객체의 내용(데이터)을 비교  2.주소를 비교)
	 if(c1.equals(c2)){
     //---       ---- 
	 //this        c
	 
	    System.out.println("객체내용 같음!!");
	 }else {
		System.out.println("객체내용 다름!!");
	 }
	   
	 /*
	    int su1=10;   int su2=10;
	    기본자료형 변수의 데이터 값을 비교 ==>    su1 == su2    (O)
	      
	    String str1="자바";   String str2="자바";
	  클래스자료형 변수의 데이터 값을 비교 ==>    str1 == str2   
	                                 ---------------
	                                                                  메모리 주소비교!! 
	                                   
	                                   
	 ★★                                                                        str1.equals(str2)  (O)                 
	                              ------------------
	                                                              문자열 내용 비교!!
	    
	 */
	 
	 
	 if(c1  == c2) {
		System.out.println("객체주소 같음!!(같은 레퍼런스)");
		//                 ----> 한 개의 메모리 할당을 서로 다른 변수가 참조!!
	 }else {
		System.out.println("객체주소 다름!!(다른 레퍼런스)");
	 }
	 
	   
   }//main
   
}





