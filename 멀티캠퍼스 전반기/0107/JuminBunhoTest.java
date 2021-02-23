package com.mulcam.j0107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class JuminBunhoTest {
  //주민번호를 콘솔통해 입력받아서 나이를 출력!!
  //"950203-1012345"
  //계산식?  2019 - (1900+95) + 1	
	
  public static void main(String[] args) throws IOException {
	//날짜 관련 클래스: Calendar, Date
	Calendar cal = Calendar.getInstance() ;
	      //cal안에 시간관련 데이터가 모두 저장!!
	
	//cal.get(int field);
	int year = cal.get(Calendar.YEAR);//현 시스템의 연도
	//System.out.println("year="+year);
	BufferedReader br = new BufferedReader
			  (new InputStreamReader(System.in));
	
	System.out.print("주민번호를 정확히 입력하세요('-'하이픈 포함): ");
	String id = br.readLine();//입력시점
	  //"950203-1012345"
//인덱스     01234567890123 
	
	  //"080306-3012345"
	  //char charAt(int index)
	  //"080306-3012345".charAt(7) -----> '3'
	  //"950203-1012345".charAt(7) -----> '1'
	
	//id.substring(int beginIndex,int endIndex);
	//              시작인덱스:포함       끝인덱스:비포함
	String birthYear = id.substring(0,2);//0~1
	//System.out.println("birthYear="+birthYear);
	int age;       
	
	char ch = id.charAt(7);//'1' '2' '3' '4'
	
	if(ch < '3')
	  age= year - (1900+ Integer.parseInt(birthYear) ) + 1;	
	else
	  age= year - (2000+ Integer.parseInt(birthYear) ) + 1;	
	                    //"95" ---> 95
	System.out.println("당신의 나이는 "+ age +"세입니다!!");
  }//main	
	
}




