package com.mulcam.j0109;

public class StringTest {
  public static void main(String[] args) {
	String s1="java";
	String s2="JAVA"; //String s2 = new String("JAVA");
	
	//문자열비교
	//문자열.equals(비교문자열)
	
	if(s1.equals(s2)) {    //"java".equals(s2)
	  System.out.println("s1과 s2문자열은 같음!!");	
	}else {//if(s1.equals(s2)==false)) --->if(!s1.equals(s2)) 
  	  System.out.println("s1과 s2문자열은 다름!!");
	}
	
	//대소문자(case) 구분없는 문자열 비교!!
	//1. 대소문자를 맞춰주기        2. 대소문자 구분없이 비교하는 메소드 사용.
	
	System.out.println("s1="+s1);
	System.out.println("s1.toUpperCase()="+s1.toUpperCase());
	//1.
	if( s1.toLowerCase().equals(s2.toLowerCase())  ) {
	  System.out.println("문자열 같음!!");	
	}
	
	//2.
	if(s1.equalsIgnoreCase(s2)) {//대소문자 구분없이 비교할때 사용
	  System.out.println("문자열 같음!!!");	
	}
	
	
	String str="JavaProgramming";//문자열 : 문자들의 나열
	//인덱스          012345678901234
	
	//문자열 길이 구하기(문자의 갯수)
	System.out.println("str의 길이: "+ str.length());
		
	//부분문자열 얻어오기("Pro","Programming")
	
	//str.substring(int beginIndex,int endIndex)
	//beginIndex-포함   , endIndex-불포함
	System.out.println("str.substring(4, 7)="+ 
	                        str.substring(4, 7));//4~6
	//str.substring(int beginIndex); beginIndex부터 ~ 끝까지
	System.out.println("str.substring(4)="+ str.substring(4));
		
	//특정인덱스의 문자 얻어오기(다섯번째 문자)
	System.out.println("str의 다섯번째 문자="+ str.charAt(4));
	
	//특정문자의 인덱스 얻어오기 ('P'문자의 인덱스)
	//str.indexOf(int ch)
	System.out.println( str.indexOf(10));//일치하는 문자를 찾지 못했을때 -1
	System.out.println( str.indexOf(80));
	System.out.println( str.indexOf('P'));//4
	//String str="JavaProgramming";
	//'a'문자의 인덱스를 구하시오?
	System.out.println("str.indexOf('a')="+ str.indexOf('a'));//4
	//세번째'a'문자의 인덱스를 구하시오?
	System.out.println("str.indexOf(\"am\")="+ str.indexOf("am"));
	System.out.println("뒤에서 첫번째 a의 인덱스="+ str.lastIndexOf('a'));
		
	//문자열 치환(대체) 1. 'a'---> 'o'    2. "Java" ---> "자바"
	
	//str.replace(char oldChar, char newChar)
	System.out.println("str.replace('a', 'o')="+
	                               str.replace('a', 'o'));
	//str = str.replace('a', 'o');
	System.out.println("str="+ str);
	
	//str.replace(CharSequence target,CharSequence replacement)
	System.out.println("str.replace(\"Java\", \"자바\")="+
	                  str.replace("Java", "자바"));
	
	//문자열 공백 제거
    System.out.println("jaelee".equals("jaelee "));//false	
    
    str = "  "+str+"  "; //앞뒤 각각 두개의 space(공백)추가
    System.out.println("공백추가후 str문자열 길이="+ str.length());
    
    str = str.trim();// 양쪽에 연속된 공백을 제거하는 기능
    System.out.println("공백제거후 str문자열 길이="+ str.length());
    
    
  }
}






