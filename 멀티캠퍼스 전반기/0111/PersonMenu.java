package com.mulcam.j0111;

import java.util.Vector;

public class PersonMenu {//'사람'데이터를 Vector에 추가,삭제,수정,검색(조회)

   Vector<Person> persons;
   
   public PersonMenu() {
	 persons = new Vector<Person>();
   }
	
	
   public void insert(Person p) {//String name,int age, String job){
	   persons.add(p);
   }
   
   public void delete(int delNo){
//	 for(int i=0; i<persons.size(); i++) {
//	   Person p=persons.get(i);
//	   if(p.getAge() == delNo) {
//		   persons.remove(i);
//		   return true;
//	   }
//	 }
	   for(Person p: persons) {
		   if(p.getNo() == delNo) persons.remove(p);
	   }
   }	
   
   public void update(Person newP){
	   //persons.set(0, p);
	   
	  //번호 일치하는 Person을 찾아서 '정보 변경(age,job)'
	  for(Person oldP:persons) {
		  //oldP: 기존Person의 메모리 주소
		  if(oldP.getNo()  ==  newP.getNo()) {
			  oldP.setAge(  newP.getAge()  );
			  oldP.setJob(  newP.getJob()  );
			  break;//번호는 유일한 값을 가지므로 반복문(조회) 탈출
		  }
	  }
   }//update	
   
   public void select(){
    //벡터내의 모든 사람정보 출력
	/*
	    #사람목록
   1: [홍길동,13,학생]
   2: [김주원,14,학생]   
	 */
	  System.out.println("#사람목록"); 
//	  for(int i=0; i<persons.size(); i++) {//벡터 인덱스
////		persons.get(0).getNo()  
////		persons.get(0).getName()  
////		persons.get(0).getAge()  
////		persons.get(0).getJob()
//		Person p = persons.get(i);
//		
//		System.out.println(p.getNo()+": ["+p.getName()+","
//			+p.getAge()+","+p.getJob()+"]");  
//	  }
	  for(Person p :persons) {
		  System.out.println(p);//내부적으로 p.toString()메소드를 호출
	  }
	   
   }//select	
	
}








