package com.mulcam.j0102;

public class SwitchTest {
   int su;//== int su=0;	
	
   public static void main(String[] args) {
	  int year;//���������� �ݵ�� �ʱ�ȭ�ؼ� ����ؾ� ��!!
	      year=2020;
	  
	  /*
	     <break���>
	     -switch�� �Ǵ� �ݺ����������� ���
	     -Ư�� ���� ����� ������ ����.
	   */
	      
	  switch(year) {
	     case 1995: 
	    	 System.out.println("�ڹٰ� ��ǥ�� ���Դϴ�!!");
	    	 break;//switch���� �����!!
	     case 2019:
	    	 System.out.println("Ȳ�ݵ��� ���Դϴ�!!");
	    	 break;
	     default:
	    	 System.out.println(year +"�� �Դϴ�!!");	    	 
	  }//switch
	   
	   
   }//main
}//class end
