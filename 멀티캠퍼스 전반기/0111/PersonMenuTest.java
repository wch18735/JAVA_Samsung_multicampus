package com.mulcam.j0111;

import java.util.Scanner;

public class PersonMenuTest {
	
  public static void main(String[] args) {

   Scanner scan = new Scanner(System.in); 	  
   int no=0;
   PersonMenu menu = new PersonMenu();
   
   String num;
   do {	  
	System.out.println("<사람메뉴>");
	System.out.println("1.추가 2.검색 3.수정 4.삭제 5.종료");
	System.out.print("번호입력==> ");
	
	num = scan.nextLine(); 
	 System.out.println();	 
	 switch(num) {
	   case "1": 
	        {
		     System.out.print("이름: ");
		         String name=scan.nextLine();
		     System.out.print("나이: ");
		         int age=Integer.parseInt(scan.nextLine());
		     System.out.print("직업: ");
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
		   System.out.print("수정할 번호: ");
		     String upNo=scan.nextLine();
		   System.out.print("나이: ");
		     int age= Integer.parseInt(scan.nextLine());		   
		   System.out.print("직업: ");
		     String job=scan.nextLine();
		     
		   Person p = new Person(no, null, age, job);
		   menu.update(p);
		   
		        break;
	   case "4":
		   System.out.print("삭제할 번호: ");
		   String str=scan.nextLine();
		   
		   if(!str.matches("[\\d]+"))//숫자 아닌 값이 포함되었다면!!
		   {
			 System.err.println("#숫자만 입력!!");
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



