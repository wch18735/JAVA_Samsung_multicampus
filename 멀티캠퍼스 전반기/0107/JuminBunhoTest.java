package com.mulcam.j0107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class JuminBunhoTest {
  //�ֹι�ȣ�� �ܼ����� �Է¹޾Ƽ� ���̸� ���!!
  //"950203-1012345"
  //����?  2019 - (1900+95) + 1	
	
  public static void main(String[] args) throws IOException {
	//��¥ ���� Ŭ����: Calendar, Date
	Calendar cal = Calendar.getInstance() ;
	      //cal�ȿ� �ð����� �����Ͱ� ��� ����!!
	
	//cal.get(int field);
	int year = cal.get(Calendar.YEAR);//�� �ý����� ����
	//System.out.println("year="+year);
	BufferedReader br = new BufferedReader
			  (new InputStreamReader(System.in));
	
	System.out.print("�ֹι�ȣ�� ��Ȯ�� �Է��ϼ���('-'������ ����): ");
	String id = br.readLine();//�Է½���
	  //"950203-1012345"
//�ε���     01234567890123 
	
	  //"080306-3012345"
	  //char charAt(int index)
	  //"080306-3012345".charAt(7) -----> '3'
	  //"950203-1012345".charAt(7) -----> '1'
	
	//id.substring(int beginIndex,int endIndex);
	//              �����ε���:����       ���ε���:������
	String birthYear = id.substring(0,2);//0~1
	//System.out.println("birthYear="+birthYear);
	int age;       
	
	char ch = id.charAt(7);//'1' '2' '3' '4'
	
	if(ch < '3')
	  age= year - (1900+ Integer.parseInt(birthYear) ) + 1;	
	else
	  age= year - (2000+ Integer.parseInt(birthYear) ) + 1;	
	                    //"95" ---> 95
	System.out.println("����� ���̴� "+ age +"���Դϴ�!!");
  }//main	
	
}




