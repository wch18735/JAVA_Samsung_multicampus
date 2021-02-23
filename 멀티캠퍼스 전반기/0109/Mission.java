package com.mulcam.j0109;

public class Mission {
  public static void main(String[] args) {
	  int k=5;
	  
	  int []su={  1,  2,  3,   4,   k};
	  //                          su[4]
	  
	System.out.println("문제1)");
	for (int i = 0; i < su.length; i++) {//0~4
	  System.out.println(su[i]);	
	}
	
	System.out.println("================");
	System.out.println("문제2)");
	for (int i = 4; i >= 0; i--) {//4~0
		System.out.println(su[i]);	
	}
	      //행         0행      1행          2행
	int su2[][]={ {1}, {1,2}, {1,2,3}  };
	      //열          0    0 1    0 1 2
	
	//su2:2차원배열   su2.length: 행의 갯수
	//su2[1] : su2의 두번째데이터(1행 배열 데이터)
	//su2[1].length : 배열의 크기(요소갯수)
	
	System.out.println("================");
	System.out.println("문제3)2차원배열 전체 데이터 출력");
	
	for(int i=0; i<su2.length; i++) {
		//기준: 행 ---> 행의 인덱스
	  for(int j=0; j<su2[i].length; j++) {
		  //각행(배열)의 열 인덱스
	  System.out.println("su2["+i+"]["+j+"]번지="
		        +su2[i][j]); 
	  }
	}
	System.out.println("================");
	System.out.println("문제4)배열변수이해(참조변수)");
	
	
	
	int []su3;
	   
	     //su3 = su;//주소 복사
	
	     su3= new int[su.length];
	
	for(int i=0; i<su.length; i++) {
		su3[i] = su[i];//값의 복사
	}
	     
	     su3[2]=33;
	     
	System.out.println("======su3배열======");
    for (int i = 0; i < su3.length; i++) {
	  System.out.println(su3[i]);	
	}	     
    
    System.out.println("======su배열======");
    for (int i = 0; i < su.length; i++) {
    	System.out.println(su[i]);	
    }	
    
    System.out.println("================");
	System.out.println("문제5)");
	
	//int []su={  1,  2,  3,   4,   5};
	int temp;
	int endIdx= su.length-1;
	
	//int loopCnt = su.length/2;//    5/2
	
	for (int i = 0; i < su.length/2; i++) {
		temp = su[i];
		su[i]= su[endIdx];
		su[endIdx]= temp;
		
		endIdx--;
	} 		
	
	
	for (int i = 0; i < su.length; i++) {
    	System.out.println(su[i]);
    }
	
  }
}










