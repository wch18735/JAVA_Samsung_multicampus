package com.mulcam.j0104;

import java.io.IOException;

public class InputTest {
	
   public static void main(String[] args) throws IOException{
	 //�ƽ�Ű�ڵ�(����)�Է�                              //����޼ҵ忡�� ����ó���� �� �ѱ����
	   
	 System.out.print("�� �ڸ����� �Է�:");  
	 int su= System.in.read();//���� �Է½���
	         System.in.read();//����Ű ó��
	         System.in.read();//����Ű ó��
	         
	 //------------------------------------
	 //   3����  -----> 51 13 10
	 //------------------------------------
	 
	 System.out.print("������ ���� �ٽ� �Է�:");  
	 int su2= System.in.read()-48;//���� �Է½���
	 
	 System.out.println("����� �Է��� ���� "+su2+"�̰� �� ���� "
	 		         + "�ƽ�Ű�ڵ尪�� "+su+"�Դϴ�^^");
	 
	   
   }//main	

}
