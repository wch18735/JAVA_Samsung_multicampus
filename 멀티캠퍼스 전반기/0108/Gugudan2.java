package com.mulcam.j0108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gugudan2 {//��� ����
  
  BufferedReader in;//null
  
  public Gugudan2() {//����ʵ忡 ���� �ʱ�ȭ�ڵ�, �����۾�
	  in = new BufferedReader(new InputStreamReader(System.in));
  }
	
	
  public int inputDan() throws IOException {//���Է� ���	  
	System.out.print("���ϴ� ��? ");  
	int dan = Integer.parseInt(in.readLine());//�Է½���
	              //"3" ----> 3	          
	return dan;  
  }
  //--------------------------------------------------------
  
  public String continueDan() throws IOException{//��ӿ��� ���� ���	
	  
	System.out.print("���(y/n)? ");  
	
	 String yn = in.readLine();//�Է½���
	               
	 return yn;
  }//continueDan
  
  public void printDan(int dan){//Ư���� ��� ���
	  //dan*1~dan*9
	  
	  for(int i=1; i<10; i++) {//1~9  
		  System.out.println(dan+"*"+i+"="+(dan*i));	  
	  }    
	  
	  //return;  
  }//printDan
}





