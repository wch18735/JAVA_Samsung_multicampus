package com.mulcam.j0110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameMenuTest2 {
  public static void main(String[] args) throws IOException {

   BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 	  
   //NameMenu menu = new NameMenu(); //�迭	
   NameMenu2 menu = new NameMenu2(); //����	
   
   String no;
   do {	  
	System.out.println("<�̸��޴�(����)>");
	System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.����");
	System.out.print("��ȣ�Է�==> ");
	no = in.readLine();
	 	
	System.out.println();
	 switch(no) {
	   case "1": 
	           {
		        System.out.print("�̸��Է�: ");
		        String name = in.readLine();//�Է½���
		        menu.insert(name);
	           }
		       break;
		       
	   case "2": 
		         menu.search();
		         break;
	   case "3":
		       System.out.print("�����̸��Է�: ");
		       String oldName = in.readLine();//�Է½���
		       System.out.print("�����̸��Է�: ");
		       String newName = in.readLine();//�Է½���
		       
		       menu.update(oldName, newName);
		        break;
	   case "4":
		       System.out.print("�����̸��Է�: ");
		       String delName = in.readLine();//�Է½���
		       menu.delete(delName);
	 }//switch
	
	 System.out.println();
   }while(!no.equals("5"));//(no!=5);
	
   System.out.println("-- END --");
  }//main
}//class end



