package com.mulcam.j0102;

public class IfElseTest {
   public static void main(String[] args) {
	  //���� ���
	   
	  //������ ����
	  int year=2020;
	  boolean b1 = year%4 == 0;
	  boolean b2 = year%100 != 0;
			 
	  boolean b3 = year%400 == 0;
		  
	  boolean result = (b1 && b2) || b3;
	  
	  if(result) {//result==true
		 System.out.println(year+"���� �����Դϴ�!!");		 
	  } else {//result==false
  	     System.out.println(year+"���� ����Դϴ�!!");
	  }

	  //�ֹι�ȣ 7��° ���� - 1,2,3,4,5,6,7,8
	  int gender=1;//2;

	 if(gender % 2 == 0   )//gender�� ¦����� 
	  System.out.println("�����Դϴ�!!");
	 else
	  System.out.println("�����Դϴ�!!");
	  
	  
   }//main
}





