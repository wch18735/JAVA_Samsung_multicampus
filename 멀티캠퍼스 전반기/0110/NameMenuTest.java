package com.mulcam.j0110;

import java.util.Scanner;

public class NameMenuTest {
  public static void main(String[] args) {

   Scanner scan = new Scanner(System.in); 	  
   NameMenu menu = new NameMenu();	
   //int no;
   String no;
   do {	  
	System.out.println("<�̸��޴�>");
	System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.����");
	System.out.print("��ȣ�Է�==> ");
	//no = scan.nextInt();  //3����
	// 	 scan.nextLine();//����ó��
	
	no = scan.nextLine();  //3����
	 	 
	 switch(no) {
	   case "1": 
		       System.out.print("�̸��Է�: ");
		       String name = scan.nextLine();
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



