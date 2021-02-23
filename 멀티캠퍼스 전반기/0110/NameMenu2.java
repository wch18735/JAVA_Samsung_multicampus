package com.mulcam.j0110;

import java.util.Vector;

public class NameMenu2 {
   Vector<String> names;
   
   public NameMenu2() {
	 names = new Vector<>();
   }
	
   public void insert(String name){
	 if(existName(name)) {
		System.out.println("#중복되는 이름이 존재합니다!!");
		return;
	 }  
	   
	 if(names.size() < 5)  
	  names.add(name);
	 else// names.size() >= 5
	  System.out.println("#더 이상 입력할 수 없습니다!!\r\n" + 
	  		          " 입력을 원할 시 기존 이름을 먼저 삭제하세요!!");	 
   }//insert
    
   public void search(){//배열내의 전체 사람 데이터를 출력
	  System.out.println("#이름목록");
	  
	  for(int i=0; i<names.size(); i++) {//입력 요소의 수만큼
		 System.out.println(" "+ names.get(i));  
	  }
   }//search  
  
   public void update(String oldName, String newName){
	  //전체 배열에서 기존이름을 찾기!!
	  if(!existName(oldName)) {
		  System.out.println("#존재하지 않는 이름입니다!!");
		  return;
	  }
	   
	   
	  for (int i = 0; i < names.size(); i++) {
		 if(names.get(i).equals(oldName)) {//일치하는 이름을 찾았다면
			names.set(i, newName);   //새로운 이름으로 변경!!
			break;
		 }
	  }  
   }//update
    
   public void delete(String delName){
     //전체 배열에서 삭제할 이름을 찾기!!
//	 for (int i = 0; i < names.size(); i++) {
//	   if(names.get(i).equals(delName)) {//일치하는 이름을 찾았다면
//			names.remove(i);  
//			break;
//	   }
//	 }
	   if(!existName(delName)) {
			  System.out.println("#존재하지 않는 이름입니다!!");
			  return;
	   }
	   names.remove(delName);
	 
   }//delete
   
   public boolean existName(String name) {//존재하는 이름 발견시 true리턴
	   return names.contains(name);
   }
   
   
}


   
   

