package com.mulcam.j0109;

public class StringTest2 {
  public static void main(String[] args) {
	 
/*
   
    A a =  new A();
    byte [] b = str.getBytes();
   
   
             str.getBytes()             str.toCharArray()
              <-------                  -------->
 	 byte []b         String str="abc";          char []ch
 	={97,98,99};                                 ={'a','b','c'}; 
 	         --------->                 <---------
 	          new String(b);             new String(ch);          
 	 
 	 
 	 
 	 byte []b2={97,99,101}; 문자열변환?
 	         
 	  String s = new String (b2);
           "ace" 	
 	 
*/
	  String str="Java3Progra0mming7";
	  //인덱스          012345678901234567
	  //문제) 문자열str안의 숫자의 갯수를 화면에 출력하시오.
    	 
      byte[]b= str.getBytes();
      
      int count=0;
      for (int i = 0; i < b.length; i++) {
		//System.out.println("b["+i+"]="+b[i]);
    	  if(b[i] >= 48  &&  b[i] <= 57) {//숫자 코드가 있다면
    		  count++;
    	  }
	  }
      System.out.println("숫자의 갯수(byte배열사용):"+ count);
      
      char[]ch=str.toCharArray();
      count=0;
	  for (int i = 0; i < ch.length; i++) {
		// System.out.println("ch["+i+"]="+ch[i]);
		  if(ch[i] >= '0'  &&  ch[i] <= '9') {//숫자 코드가 있다면
    		  count++;
    	  }		  
	  }
	  System.out.println("숫자의 갯수(char배열사용):"+ count);
	  
	  count=0;
	  for(int i=0; i< str.length(); i++) {
		  char c = str.charAt(i);
		  if( c >= '0'  &&  c <= '9') {//숫자 코드가 있다면
    		  count++;
    	  }	
	  }
	  System.out.println("숫자의 갯수(String index사용):"+ count);
	  
	  
  }//main
}




