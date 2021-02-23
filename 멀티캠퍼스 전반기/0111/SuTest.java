package com.mulcam.j0111;

public class SuTest {
   public static void main(String[] args) {
//	 try {  
	  String noStr = "1234a";
	  //noStr의 숫자조합 체크를 어떻게 할 수 있을까요?
	  //만약 전체 숫자조합이 아닌 문자열을 만났을 때 
	  //화면에 "#숫자만 입력!!"
	  
	  
	  
	  
	  //유효성 검사!!(valid check)
	  for(int i=0; i<noStr.length(); i++) {
		 char ch = noStr.charAt(i);
		 if(ch<'0' || ch>'9') {
			 System.err.println("#숫자만 입력!!");
			 return;
		 }
	  }
	  
	  int no = Integer.parseInt(noStr);
	  
	  System.out.println("no="+no);
//	 }catch(NumberFormatException e) {
//		 System.err.println("#숫자만 입력!!");
//	 }
	  
   }
}



