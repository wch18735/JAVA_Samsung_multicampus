package com.mulcam.j0107;

import java.io.IOException;

public class SuMenu {
   	
	
	
  public static void main(String[] args) throws IOException {
	int no;
	int su=0;//���,����,����
	
	do{ 	  
	   System.out.println("<<�޴�>>");
	   System.out.println("1.�˻� 2.���� 3.���� 4.����");
	   System.out.print("��ȣ==>");
	   no=System.in.read()-48;//�Է½���
	          System.in.read();//����Ű ó��(CR)
	          System.in.read();//����Ű ó��(LF)
	    
        //�޴�ó��(��ȣ1~3): if~else if~else��,  switch~case��
        	    
	    switch(no) {
	      case 1: System.out.println("#�˻����:"+su);
	              break;
	      case 2: su++;	    
	              System.out.println("#1�����Ͽ����ϴ�.");
	              break;
	      case 3: su--;
	              System.out.println("#1�����Ͽ����ϴ�.");	             
	    }//switch
	          
        System.out.println();	          
	  }while(no != 4);//(no==1 || no==2 || no==3);//�ݺ� ����
	
	System.out.println("-- END --");
	
  }//main
}
