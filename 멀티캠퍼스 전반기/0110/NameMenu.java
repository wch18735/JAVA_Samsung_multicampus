package com.mulcam.j0110;

public class NameMenu {
   String []names;
   
   public NameMenu() {
	 names = new String[5];
	 //      {null, null, null, null, null}
	 //names  [0]    [1]   [2]   [3]   [4]
   }
	
   public void insert(String name){
	  //매개변수를 통해 전달 받은 이름을 배열에 저장!!
	  //빈방(번지의 값이 null)을 찾아서 배열에 저장!!
	  for (int i = 0; i < names.length; i++) {//전체 배열에서 빈방 찾기
		 if(names[i] == null) {//빈방(null)을 찾았다면
		   names[i] = name;
		   break;
		 }
	  } 
   }//insert
    
   public void search(){//배열내의 전체 사람 데이터를 출력
	  System.out.println("#이름목록");
	  
	  for(int i=0; i<names.length; i++) {//5번 반복
		 if(names[i] != null)//빈방이 아니였을때 
		  System.out.println(" "+names[i]);  
	  }
   }//search  
  
   public void update(String oldName, String newName){
	  //전체 배열에서 기존이름을 찾기!!
	  for (int i = 0; i < names.length; i++) {
		 if(oldName.equals(names[i])) {//일치하는 이름을 찾았다면
			names[i]=newName;   //새로운 이름으로 변경!!
			break;
		 }
	  }  
   }//update
    
   public void delete(String delName){
     //전체 배열에서 삭제할 이름을 찾기!!
	 for (int i = 0; i < names.length; i++) {
	   //if(names[i] != null) {//null 체크!! (null이 아닐때)	 
		 if(names[i] != null && names[i].equals(delName)) {
			names[i]=null; //삭제 구현 ---> null값 채우기
			break;
		 }
	   //}
	 }
	 /* 
	          ※ 참고    
          if( A조건식 && B조건식   ):   A 조건식이 false이면 B조건식 실행X
          if( A조건식 || B조건식   ):   A 조건식이 true이면 B조건식 실행X
	   */
   }//delete
}


   
   

