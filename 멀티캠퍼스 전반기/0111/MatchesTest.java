package com.mulcam.j0111;

public class MatchesTest {
	
	public static void main(String[] args) {
	    String str="123";
	    
	    //str�� ���� ��������?
	    
	    //boolean str.matches(String regex)
	    System.out.println(str.matches("[0123456789]"));
	    //���� str���ڿ��� 0~9���� �ѹ� �����ϸ� true 
	    
	    System.out.println(str.matches("[0123456789]*"));
	    //���� str���ڿ��� 0~9���� 0~���Ѵ� �����ϸ� true
	    
	    if(str.matches("[0-9]+")) {
	       System.out.println("str�� ����!!");	
	    }else {//NumberFormatException ����
	       System.out.println("str�� ���ھƴ�!!");	
	    }
	    
	    String juminBunho="950203-2012345";
	    
	    //{min,}   {min,max}   {Ư��ȸ��}
	    if(juminBunho.matches("[\\d]{6}-[\\d]{7}")) {
	    	System.out.println("��ȿ�� �ֹι�ȣ!!");
	    }else {
	       System.out.println("��ȿ���� ���� �ֹι�ȣ!!");
	    }
	    
	    String id="gildong10045";//���̵�(6~12  �����ڿ� ���� ȥ��)
	    if(id.matches("[0-9a-zA-Z]{6,12}")) {
	    	System.out.println("��ȿ�� ���̵�!!");
	    }else {
	       System.out.println("��ȿ���� ���� ���̵�!!");
	    }
	    
	    String name="ȫ�浿";//�ѱ� ���!!(�ѱ۸� ��ȿ)
	    if(name.matches("[��-�R]+")) {
	      System.out.println("�ѱ����~!!");	
	    }else {
	      System.out.println("�ѱ���� �ƴ�~!!");	
	    }
	    
	}//main

}







