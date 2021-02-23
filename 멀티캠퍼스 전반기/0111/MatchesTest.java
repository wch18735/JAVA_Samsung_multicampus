package com.mulcam.j0111;

public class MatchesTest {
	
	public static void main(String[] args) {
	    String str="123";
	    
	    //strÀÌ ¼ıÀÚ Á¶ÇÕÀÎÁö?
	    
	    //boolean str.matches(String regex)
	    System.out.println(str.matches("[0123456789]"));
	    //±âÁØ str¹®ÀÚ¿­¿¡ 0~9±îÁö ÇÑ¹ø ÃâÇöÇÏ¸é true 
	    
	    System.out.println(str.matches("[0123456789]*"));
	    //±âÁØ str¹®ÀÚ¿­¿¡ 0~9±îÁö 0~¹«ÇÑ´ë ÃâÇöÇÏ¸é true
	    
	    if(str.matches("[0-9]+")) {
	       System.out.println("strÀº ¼ıÀÚ!!");	
	    }else {//NumberFormatException À¯¹ß
	       System.out.println("strÀº ¼ıÀÚ¾Æ´Ô!!");	
	    }
	    
	    String juminBunho="950203-2012345";
	    
	    //{min,}   {min,max}   {Æ¯Á¤È¸¼ö}
	    if(juminBunho.matches("[\\d]{6}-[\\d]{7}")) {
	    	System.out.println("À¯È¿ÇÑ ÁÖ¹Î¹øÈ£!!");
	    }else {
	       System.out.println("À¯È¿ÇÏÁö ¸øÇÑ ÁÖ¹Î¹øÈ£!!");
	    }
	    
	    String id="gildong10045";//¾ÆÀÌµğ(6~12  ¿µ¹®ÀÚ¿Í ¼ıÀÚ È¥ÇÕ)
	    if(id.matches("[0-9a-zA-Z]{6,12}")) {
	    	System.out.println("À¯È¿ÇÑ ¾ÆÀÌµğ!!");
	    }else {
	       System.out.println("À¯È¿ÇÏÁö ¸øÇÑ ¾ÆÀÌµğ!!");
	    }
	    
	    String name="È«±æµ¿";//ÇÑ±¹ »ç¶÷!!(ÇÑ±Û¸¸ À¯È¿)
	    if(name.matches("[¤¡-ÆR]+")) {
	      System.out.println("ÇÑ±¹»ç¶÷~!!");	
	    }else {
	      System.out.println("ÇÑ±¹»ç¶÷ ¾Æ´Ô~!!");	
	    }
	    
	}//main

}







