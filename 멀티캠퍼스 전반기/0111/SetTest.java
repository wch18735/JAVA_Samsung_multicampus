package com.mulcam.j0111;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
   //Set : 중복 데이터 제거, 순서가 일정치 않다.   null허용? O
	
   public static void main(String[] args) {
	
   	
   //Set<String> set = new HashSet<>();	
   HashSet<String> set = new HashSet<>();	
       set.add("홍길동");
       set.add("길라임");
       set.add("김주원");
       set.add("홍길동");
       set.add("이순신");
       set.add(null);
       set.add(null);
       
     System.out.println("Set에 저장된 요소 갯수: "+  set.size());
     
     //모든 요소 출력 
     Iterator<String>  it = set.iterator();
     //열거형 인터페이스
     
     while(it.hasNext()) {
    	System.out.println(it.next()); 
     }
     
     Object []ob = set.toArray();
     for (int i = 0; i < ob.length; i++) {
		System.out.println("ob["+i+"]="+ob[i]);
	 }
     
     
     
   }//main	
}







