package com.mulcam.j0108;

import java.io.IOException;

public class Gugudan {//��� ����
  
  public int inputDan() throws IOException {//���Է� ���
		   
	System.out.print("���ϴ� ��? ");  
	int dan = System.in.read()-48;//�Է½���
	          System.in.read();
	          System.in.read();
	return dan;  
  }
  
  public void printDan(int dan){//Ư���� ��� ���
	 //dan*1~dan*9
	  
	for(int i=1; i<10; i++) {//1~9  
     System.out.println(dan+"*"+i+"="+(dan*i));	  
	}    
	  
	//return;  
  }//printDan
  
  public char continueDan() throws IOException{//��ӿ��� ���� ���
	System.out.print("���(y/n)? ");  
	char yn = (char)System.in.read();//�Է½���
	          System.in.read();
	          System.in.read();     
	 return yn;
  }//continueDan
  
}





