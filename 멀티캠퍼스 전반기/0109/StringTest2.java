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
 	 
 	 
 	 
 	 byte []b2={97,99,101}; ���ڿ���ȯ?
 	         
 	  String s = new String (b2);
           "ace" 	
 	 
*/
	  String str="Java3Progra0mming7";
	  //�ε���          012345678901234567
	  //����) ���ڿ�str���� ������ ������ ȭ�鿡 ����Ͻÿ�.
    	 
      byte[]b= str.getBytes();
      
      int count=0;
      for (int i = 0; i < b.length; i++) {
		//System.out.println("b["+i+"]="+b[i]);
    	  if(b[i] >= 48  &&  b[i] <= 57) {//���� �ڵ尡 �ִٸ�
    		  count++;
    	  }
	  }
      System.out.println("������ ����(byte�迭���):"+ count);
      
      char[]ch=str.toCharArray();
      count=0;
	  for (int i = 0; i < ch.length; i++) {
		// System.out.println("ch["+i+"]="+ch[i]);
		  if(ch[i] >= '0'  &&  ch[i] <= '9') {//���� �ڵ尡 �ִٸ�
    		  count++;
    	  }		  
	  }
	  System.out.println("������ ����(char�迭���):"+ count);
	  
	  count=0;
	  for(int i=0; i< str.length(); i++) {
		  char c = str.charAt(i);
		  if( c >= '0'  &&  c <= '9') {//���� �ڵ尡 �ִٸ�
    		  count++;
    	  }	
	  }
	  System.out.println("������ ����(String index���):"+ count);
	  
	  
  }//main
}




