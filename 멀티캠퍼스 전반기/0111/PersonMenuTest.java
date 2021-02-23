package com.mulcam.j0111;

import java.util.Scanner;

public class PersonMenuTest {
	
  public static void main(String[] args) {

   Scanner scan = new Scanner(System.in); 	  
   int no=0;
   PersonMenu menu = new PersonMenu();
   
   String num;
   do {	  
	System.out.println("<����޴�>");
	System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.����");
	System.out.print("��ȣ�Է�==> ");
	
	num = scan.nextLine(); 
	 System.out.println();	 
	 switch(num) {
	   case "1": 
	        {
		     System.out.print("�̸�: ");
		         String name=scan.nextLine();
		     System.out.print("����: ");
		         int age=Integer.parseInt(scan.nextLine());
		     System.out.print("����: ");
		         String job=scan.nextLine();
		     		         
//		    Person p  = new Person();
//		       p.setName(name);
//		       p.setJob(job);
		    //Person p = new Person(no, name, age, job)
		    Person p = new Person(++no, name, age, job);    
		    menu.insert(p);
	       }
		         break;
		       
	   case "2": 
		        menu.select();
		        break;
		        
	   case "3":
		   System.out.print("������ ��ȣ: ");
		     String upNo=scan.nextLine();
		   System.out.print("����: ");
		     int age= Integer.parseInt(scan.nextLine());		   
		   System.out.print("����: ");
		     String job=scan.nextLine();
		     
		   Person p = new Person(no, null, age, job);
		   menu.update(p);
		   
		        break;
	   case "4":
		   System.out.print("������ ��ȣ: ");
		   String str=scan.nextLine();
		   
		   if(!str.matches("[\\d]+"))//���� �ƴ� ���� ���ԵǾ��ٸ�!!
		   {
			 System.err.println("#���ڸ� �Է�!!");
		     continue;
		   }
			   
		   int delNo = Integer.parseInt(str);
		   menu.delete(delNo);
		   
	 }
	
	 System.out.println();
   }while(!num.equals("5"));
	
   System.out.println("-- END --");
  }//main
}//class end



