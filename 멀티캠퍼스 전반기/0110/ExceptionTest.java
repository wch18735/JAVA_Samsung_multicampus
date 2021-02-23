package com.mulcam.j0110;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest {
	
   public static void main(String[] args)  {
	   
	   
	  /*
	      <Java I/O의 4대 클래스(추상클래스)>
	       
	      byte단위                   문자단위 
	    --------------------------    
읽기	     InputStream       Reader
쓰기	     OutputStream      Writer
	       
	  */
	   //a.txt파일을 읽어서 화면콘솔에 출력
	   //new FileReader(String fileName) 
	   //             ==> fileName : 경로를 포함한 파일명 
	   
	   //파일 경로는 전체 경로를 전부 표시하는 것이 기본!!
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
		//이클립스의 JavaProject의 경우만 프로젝트명까지 생략하는 것이 가능!!
		   FileReader fr = new FileReader("a.txt");
		   
		   //System.out.println(fr.read()); --> 읽은 문자의 코드값 리턴
		   //    ---> 더 이상 읽을 문자가 없을 때 -1리턴
		   
		   FileWriter fw = new FileWriter("b.txt"); 
		   
		   int i;
		   while( (i=fr.read()) !=  -1) {//읽은 문자가 있다면
			   System.out.print((char)i); //콘솔 출력
			   // (char)97  ----> 'a'
			   
			   fw.write(i);//파일 출력!! (파일Copy)
		   }
		   
		   fw.close();
		   
		   
		   //System.out.println("#파일 읽기 성공!!");
	} catch (FileNotFoundException e) {
		//e ---> 에러메시지 객체!!
		System.out.println(e);
//		System.out.println(e.toString());
//		System.out.println(e.getMessage());//간단 메시지만 출력
//		e.printStackTrace();//에러를 발생시킨 메소드 간의 호출 관계까지 출력
		
		System.out.println("##읽고자 하는 파일의 경로 또는 파일명을 확인하세요!!");
		
	}catch (IOException e) {
		e.printStackTrace();
	} 
	 
	   
   }//main	

}







