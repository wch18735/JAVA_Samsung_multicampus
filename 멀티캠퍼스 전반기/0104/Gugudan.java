package com.mulcam.j0104;

public class Gugudan {//javac Gugudan.java   ----> Gugudan.class
	                  //java  Gugudan ȫ�浿 �����
	                  //          String []args={"ȫ�浿","�����"};
                      //java  Gugudan 3
	                  //          String []args={"3"};
	
  public static void main(String[] args) {
	//3�� ���
/*
3*1=3      
3*2=6      
.....      
3*8=24      
3*9=27 
*/
/*	  
	  System.out.println(3+"*"+1+"="+(3*1)); 
	  System.out.println(3+"*"+2+"="+(3*2));
	  
	  System.out.println(3+"*"+8+"="+(3*8)); 
	  System.out.println(3+"*"+9+"="+(3*9)); 
	  
      for(int i=1; i<10; i++) {//1~9ǥ��
    	  System.out.println(3+"*"+i+"="+(3*i));
      }
*/	  
	  
	  
	  //���θ޼ҵ��� �Ķ���͸� �̿��� ������ ����!!
	  
	  //int dan=5; 
	  int dan= Integer.parseInt(args[0]); //String []args={"3"};
	                    // Integer.parseInt("3"); ---> 3
	  
	  for(int i=1; i<10; i++) {//1~9ǥ��
    	  System.out.println(dan+"*"+i+"="+(dan*i));
      }
	  
	  
  }//main
}




