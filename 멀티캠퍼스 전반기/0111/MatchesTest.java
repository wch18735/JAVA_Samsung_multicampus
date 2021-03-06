package com.mulcam.j0111;

public class MatchesTest {
	
	public static void main(String[] args) {
	    String str="123";
	    
	    //str이 숫자 조합인지?
	    
	    //boolean str.matches(String regex)
	    System.out.println(str.matches("[0123456789]"));
	    //기준 str문자열에 0~9까지 한번 출현하면 true 
	    
	    System.out.println(str.matches("[0123456789]*"));
	    //기준 str문자열에 0~9까지 0~무한대 출현하면 true
	    
	    if(str.matches("[0-9]+")) {
	       System.out.println("str은 숫자!!");	
	    }else {//NumberFormatException 유발
	       System.out.println("str은 숫자아님!!");	
	    }
	    
	    String juminBunho="950203-2012345";
	    
	    //{min,}   {min,max}   {특정회수}
	    if(juminBunho.matches("[\\d]{6}-[\\d]{7}")) {
	    	System.out.println("유효한 주민번호!!");
	    }else {
	       System.out.println("유효하지 못한 주민번호!!");
	    }
	    
	    String id="gildong10045";//아이디(6~12  영문자와 숫자 혼합)
	    if(id.matches("[0-9a-zA-Z]{6,12}")) {
	    	System.out.println("유효한 아이디!!");
	    }else {
	       System.out.println("유효하지 못한 아이디!!");
	    }
	    
	    String name="홍길동";//한국 사람!!(한글만 유효)
	    if(name.matches("[ㄱ-힣]+")) {
	      System.out.println("한국사람~!!");	
	    }else {
	      System.out.println("한국사람 아님~!!");	
	    }
	    
	}//main

}







