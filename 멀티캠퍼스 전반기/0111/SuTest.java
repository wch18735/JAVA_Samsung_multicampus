package com.mulcam.j0111;

public class SuTest {
   public static void main(String[] args) {
//	 try {  
	  String noStr = "1234a";
	  //noStr�� �������� üũ�� ��� �� �� �������?
	  //���� ��ü ���������� �ƴ� ���ڿ��� ������ �� 
	  //ȭ�鿡 "#���ڸ� �Է�!!"
	  
	  
	  
	  
	  //��ȿ�� �˻�!!(valid check)
	  for(int i=0; i<noStr.length(); i++) {
		 char ch = noStr.charAt(i);
		 if(ch<'0' || ch>'9') {
			 System.err.println("#���ڸ� �Է�!!");
			 return;
		 }
	  }
	  
	  int no = Integer.parseInt(noStr);
	  
	  System.out.println("no="+no);
//	 }catch(NumberFormatException e) {
//		 System.err.println("#���ڸ� �Է�!!");
//	 }
	  
   }
}



