package com.mulcam.j0109;

import java.util.Scanner;

public class NameMenuTest {
  public static void main(String[] args) {

   Scanner scan = new Scanner(System.in); 	  
   NameMenu menu = new NameMenu();	
   int no;
   do {	  
	System.out.println("<이름메뉴>");
	System.out.println("1.추가 2.검색 3.수정 4.삭제 5.종료");
	System.out.print("번호입력==> ");
	no = scan.nextInt();
	 	
	 switch(no) {
	   case 1: 
		       System.out.print("이름입력: ");
		       String name = scan.nextLine();
		       menu.insert(name);
		       break;
		       
	   case 2: break;
	   case 3: break;
	   case 4:
	 }
	
	 System.out.println();
   }while(no!=5);
	
   System.out.println("-- END --");
  }//main
}//class end



