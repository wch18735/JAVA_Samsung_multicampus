package com.mulcam.j0103;

public class A {
   //데이터 ==> 홍길동   100   3.14   true
    String 홍길동="ABC";
	String gildong1=홍길동;
	String gildong2="홍길동";
	
	int num1=100;
	String num2="100";
   
	float num3=3.14f;
	double num4=3.14;
	
	boolean a = true;
	
	void hello() {
      System.out.println("A클래스 안녕~!!"); 		
	}//hello
	
	//매개변수 메소드 호출!!
	void m1(int no1) {
	  System.out.println("m1():"+
	              no1);
	}
	
	void m2(int no1,int no2) {
      System.out.println("m2():"+
	    no1+","+no2);		
	}
	
	void m3(String name,
			int age,
			String job) {
	  System.out.println("m3()");
	  System.out.println("이름:"+name);
	  System.out.println("나이:"+age);
	  System.out.println("직업:"+job);
	  
	  
	}//메소드 끝괄호가 return;을 대신함
	//만약 return 데이터; 일때는 생략불가

	//리턴형 정의된 메소드 호출!!
    int plus(int su1, int su2) {
    	int result = su1+su2;
    	
    	return result;
    }
	
	
	int m11() {
    //리턴형: 메소드를 실행한 후 결과물
	   int su=20000;
	   
	   return su;
	} 
	
	String m12() {
	   String name="김주원";
	   
	   return name;	
	}
	
	//int,int,int m13() { 에러발생!!
	//메소드명 앞에 리턴형은 한개의 자료형만 정의!!
	int[] m13() {
	   int a=10;
	   int b=20;
	   int c=30;
	   
	  //리턴형을 통해 a,b,c를 전달
	   
	   //return  a,b,c; 에러발생
	  //return 다음에는 한개의 데이터만 전달. 
	   int []array= {a,b,c};
	   
	   return array;
	}
	
	Person m14() {
	  String name="김주원";
	  int age=15;
	  String job="학생";
	  
	  Person p = new Person();
	   p.name=name;
	   p.age=age;
	   p.job=job;
	   
	  return p; 		
	}
	
	Person[] m15() {
		String name="김주원";
		int age=15;
		String job="학생";
		
		String name2="홍길동";
		int age2=16;
		String job2="학생";
		
		Person p = new Person();
		p.name=name;
		p.age=age;
		p.job=job;
		
		Person p2 = new Person();
		p2.name=name2;
		p2.age=age2;
		p2.job=job2;
		
		
		//int []su={};
		Person []persons= {p,p2};
		
		
		return persons; 		
	}
	
	
}//A class










