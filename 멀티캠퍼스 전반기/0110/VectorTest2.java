package com.mulcam.j0110;

import java.util.Vector;

public class VectorTest2 {//★
	
  public static void main(String[] args) {
	 /*
	  Vector는 데이터를 담는 클래스 
	  //(가변길이배열: 입력되는 데이터수가 일정하지 않을 때 사용)
	 
	  <> : 제네릭타입(자료형을 명시)     -----> 명료성을 높이기 위해 사용(JDK5부터)
	  
	  <E> element로 사용될 자료형을 명시
	  <K> key로 사용될 자료형을 명시
	  <V> value로 사용될 자료형을 명시
	  <T> type 
	  */
	 //Vector<String> v = new Vector<String>();
	 Vector<String> v = new Vector<>();
	 //데이터 입력
	 //v.add(Stirng e)
	 v.add("나길동");//인덱스 0
	 v.add("홍라임");//인덱스 1
	 //v.add(new Integer(100)); //에러발생 : 제네릭 명시한 자료형만 입력 가능
	 v.add("고주원");//인덱스 2
	 
	 
	 //요소 수정!! ("홍라임"----> "길라임" 변경)
	 //v.set(int index,String element)
	 //index에 해당하는 요소를 element로 변경해라
	 v.set(1, "길라임");
	 
	 
	 //요소 삭제!!  ("나길동" 삭제)
	 //v.remove("나길동");//첫번째 발견되는 "나길동"을 삭제
	 v.remove(0); 
	 
	 
//전체 데이터 출력 (벡터는 입력되는 요소들에 대해서 첫번째 요소부터 0,1,2,3...를 부여)
	 for(int i=0; i< v.size();  i++) {
		System.out.println(i +":"+ v.get(i)); 
	 }
	 
	 
	 
  }//main	

}







