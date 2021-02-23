package com.mulcam.j0103;

public class MethodCallTest {
	
	public static void main(String[] args) {
		//A obj = new A();
		
	   A a = new A();
	   //A클래스 사용할 준비를 끝마쳤음.
	   //A클래스의 멤버들에 대한 메모리 할당.
	   //사용법!!
	   //a.멤버
	   //a.속성변수명  a.메소드명();
	   //a.~  A클래스에 있는~
	   
	   System.out.println(a.홍길동);
       System.out.println(a.gildong2);
       
       //System.out.println(a.hello());
       a.hello();
       
       int no1=11;
       //m1()메소드 호출 , no1값을 전달
       
       a.m1(11);//메소드 호출
       a.m1(no1);//메소드 호출
       
       int no2=22;
       //m2()메소드 호출, no1,no2값을 전달
       
       a.m2( no1, no2 );
       
       String name="홍길동";
       int age=13;
       String job="학생";
       
       
       //m3()메소드 호출,
       //name,age,job데이터를 전달
       
       a.m3(name,age,job);//메소드 호출
System.out.println("=========");
       a.m3(job,age,name);//메소드 호출
       
       
     //리턴형 정의된 메소드 호출!!
       a.m11();
      
      int su = a.m11();
     //리턴void(반환데이터 없음)와의 차이점
     //메소드호출앞에 받고자 하는 데이터의 변수선언을 함.
      System.out.println("su="+su); 
       
      String str = a.m12();
      
      System.out.println("str="+str);
      
      int [] arr =a.m13();
      //전체 배열의 인덱스를 표현하는 for문
      for (int i = 0; i < arr.length; i++) {
		System.out.println("arr["+i+"]번지="+arr[i]);
	  }
      
      Person pp= a.m14();
      System.out.println("이름:"+pp.name);
      System.out.println("나이:"+pp.age);
      System.out.println("직업:"+pp.job);
      
      
	}//main

}






