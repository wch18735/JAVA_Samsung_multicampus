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
	System.out.println("<�̸��޴�>");
	System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.����");
	System.out.print("��ȣ�Է�==> ");
	no = in.readLine();
	 	
	 switch(no) {
	   case "1": 
		       System.out.print("�̸��Է�: ");
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



