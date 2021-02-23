package com.mulcam.j0108;

class Person{
   String name;
   int age;
   String job;
   
  public Person(String name, int age, String job) {
	this.name = name;
	this.age = age;
	this.job = job;
  }

	@Override
	public String toString() {
		return "Person [이름=" + name + ", 나이=" + age 
				+ ", 직업=" + job + "]";
	}

  
	
}//Person


public class ArrayTest {
	
  public static void main(String[] args) {
	//1차원배열 (데이터값이 이미 정의된 경우)
	
	 //int []su;
	 //      su= {11,22,33,44}; //에러발생!! (선언과 초기화를 따로 작성X)
	  
	 int[]su= {11,  22,   33,   44};
	   //    su[0]  su[1] su[2] su[3] 
	 //su배열의 전체 데이터를 출력 ---> 보통 for문을 사용
	 
	 System.out.println("배열의 크기(요소갯수):"+ su.length);
	 for(int i=0; i<su.length; i++) {//배열의 인덱스를 표현 (0~3)
		 System.out.println("su["+i+"]번지="+su[i]);
	 }
	 
	 //1차원배열 (배열객체생성)- 프로그램 실행 중 발생하는 데이터를 입력할 때
	 //형식) 자료형[]배열명 = new 자료형[배열크기];
	 //int []su2 = new int[5];//5개의 정수를 받을 준비(5개의 방생성)
	 int []su2;
	       su2 = new int[5];//---> 각 자료형의 기본값이 입력!!
	 System.out.println("-----------------------");      
     for (int i = 0; i < su2.length; i++) {//su2배열의 인덱스 표현(0~4)
    	 System.out.println("su2["+i+"]번지="+su2[i]);
	 }
     
     //각 방의 데이터를 입력
     su2[0]=2;
     su2[1]=4;
     su2[2]=6;
     System.out.println("-----------------------");      
     for (int i = 0; i < su2.length; i++) {//su2배열의 인덱스 표현(0~4)
    	 System.out.println("su2["+i+"]번지="+su2[i]);
	 }
	  
     System.out.println("-----------------------");      
     Person [] persons=new Person[3];
       Person p = new Person("홍길동",13,"학생");
       System.out.println(p);//p는 toString()를 호출
       System.out.println(p.toString());
       
       persons[0]=p;
       persons[1]=new Person("길라임",15,"학생");
       persons[2]=new Person("김주원",17,"학생");

     
     for (int i = 0; i < persons.length; i++) {
    	 System.out.println("persons["+i+"]번지="+persons[i]);
	 }      
     
     
     System.out.println("==============================");      
     //2차원배열의 값 출력
     int [][]su3 = {{1}, {1,2},  {1,2,3}};
     
     System.out.println("su3.length(su3배열의 행 갯수)="+ su3.length);
     
     for(int i=0; i<su3.length; i++) {//행의 인덱스 (0~2)
    	 for(int j=0; j<su3[i].length; j++) {
    		 //각행마다의 열 인덱스(0행-1, 1행-2, 2행-3)
    		 // su3[1].length ---> 2
    		System.out.println("su3["+i+"]["+j+"]="+ su3[i][j]); 
    	 }
     }
     
     
  }//main

}






