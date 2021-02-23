package com.mulcam.j0109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameMenuTest2 {
  public static void main(String[] args) throws IOException {

   BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 	  
   NameMenu menu = new NameMenu();	
   
   String no;
   do {	  
	System.out.println("<이름메뉴>");
	System.out.println("1.추가 2.검색 3.수정 4.삭제 5.종료");
	System.out.print("번호입력==> ");
	no = in.readLine();
	 	
	 switch(no) {
	   case "1": 
		       System.out.print("이름입력: ");
		       String name = in.readLine();
		       menu.insert(name);
		       break;
		       
	   case "2": break;
	   case "3": break;
	   case "4":
	 }
	
	 System.out.println();
   }while(!no.equals("5"));//(no!=5);
	
   System.out.println("-- END --");
  }//main
}//class end



