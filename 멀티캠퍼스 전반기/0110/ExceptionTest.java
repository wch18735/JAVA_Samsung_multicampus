package com.mulcam.j0110;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest {
	
   public static void main(String[] args)  {
	   
	   
	  /*
	      <Java I/O�� 4�� Ŭ����(�߻�Ŭ����)>
	       
	      byte����                   ���ڴ��� 
	    --------------------------    
�б�	     InputStream       Reader
����	     OutputStream      Writer
	       
	  */
	   //a.txt������ �о ȭ���ֿܼ� ���
	   //new FileReader(String fileName) 
	   //             ==> fileName : ��θ� ������ ���ϸ� 
	   
	   //���� ��δ� ��ü ��θ� ���� ǥ���ϴ� ���� �⺻!!
/*	   
	   FileReader fr = new FileReader
			   ("e:\\jaelee\\workspace\\JavaApp\\a.txt");
	   
	   FileReader fr = new FileReader
			   ("e:/jaelee/workspace/JavaApp/a.txt");
*/
	   
/*
package java.io;

public class FileReader{

   public FileReader(String fileName) throws FileNotFoundException{
   
   }
   
   public int read()throws IOException{
   
   }

}
 	   
*/   
  
	   
	try {
		//��Ŭ������ JavaProject�� ��츸 ������Ʈ����� �����ϴ� ���� ����!!
		   FileReader fr = new FileReader("a.txt");
		   
		   //System.out.println(fr.read()); --> ���� ������ �ڵ尪 ����
		   //    ---> �� �̻� ���� ���ڰ� ���� �� -1����
		   
		   FileWriter fw = new FileWriter("b.txt"); 
		   
		   int i;
		   while( (i=fr.read()) !=  -1) {//���� ���ڰ� �ִٸ�
			   System.out.print((char)i); //�ܼ� ���
			   // (char)97  ----> 'a'
			   
			   fw.write(i);//���� ���!! (����Copy)
		   }
		   
		   fw.close();
		   
		   
		   //System.out.println("#���� �б� ����!!");
	} catch (FileNotFoundException e) {
		//e ---> �����޽��� ��ü!!
		System.out.println(e);
//		System.out.println(e.toString());
//		System.out.println(e.getMessage());//���� �޽����� ���
//		e.printStackTrace();//������ �߻���Ų �޼ҵ� ���� ȣ�� ������� ���
		
		System.out.println("##�а��� �ϴ� ������ ��� �Ǵ� ���ϸ��� Ȯ���ϼ���!!");
		
	}catch (IOException e) {
		e.printStackTrace();
	} 
	 
	   
   }//main	

}







