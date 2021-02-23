package com.mulcam.j0110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameMenuTest2 {
  public static void main(String[] args) throws IOException {

   BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 	  
   //NameMenu menu = new NameMenu(); //배열	
   NameMenu2 menu = new NameMenu2(); //벡터	
   
   String no;
   do {	  
	System.out.println("<이름메뉴(벡터)>");
	System.out.println("1.추가 2.검색 3.수정 4.삭제 5.종료");
	System.out.print("번호입력==> ");
	no = in.readLine();
	 	
	System.out.println();
	 switch(no) {
	   case "1": 
	           {
		        System.out.print("이름입력: ");
		        String name = in.readLine();//입력시점
		        menu.insert(name);
	           }
		       break;
		       
	   case "2": 
		         menu.search();
		         break;
	   case "3":
		       System.out.print("기존이름입력: ");
		       String oldName = in.readLine();//입력시점
		       System.out.print("변경이름입력: ");
		       String newName = in.readLine();//입력시점
		       
		       menu.update(oldName, newName);
		        break;
	   case "4":
		       System.out.print("삭제이름입력: ");
		       String delName = in.readLine();//입력시점
		       menu.delete(delName);
	 }//switch
	
	 System.out.println();
   }while(!no.equals("5"));//(no!=5);
	
   System.out.println("-- END --");
  }//main
}//class end



