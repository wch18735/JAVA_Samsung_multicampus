package com.mulcam.j0109;

public class StringTest {
  public static void main(String[] args) {
	String s1="java";
	String s2="JAVA"; //String s2 = new String("JAVA");
	
	//���ڿ���
	//���ڿ�.equals(�񱳹��ڿ�)
	
	if(s1.equals(s2)) {    //"java".equals(s2)
	  System.out.println("s1�� s2���ڿ��� ����!!");	
	}else {//if(s1.equals(s2)==false)) --->if(!s1.equals(s2)) 
  	  System.out.println("s1�� s2���ڿ��� �ٸ�!!");
	}
	
	//��ҹ���(case) ���о��� ���ڿ� ��!!
	//1. ��ҹ��ڸ� �����ֱ�        2. ��ҹ��� ���о��� ���ϴ� �޼ҵ� ���.
	
	System.out.println("s1="+s1);
	System.out.println("s1.toUpperCase()="+s1.toUpperCase());
	//1.
	if( s1.toLowerCase().equals(s2.toLowerCase())  ) {
	  System.out.println("���ڿ� ����!!");	
	}
	
	//2.
	if(s1.equalsIgnoreCase(s2)) {//��ҹ��� ���о��� ���Ҷ� ���
	  System.out.println("���ڿ� ����!!!");	
	}
	
	
	String str="JavaProgramming";//���ڿ� : ���ڵ��� ����
	//�ε���          012345678901234
	
	//���ڿ� ���� ���ϱ�(������ ����)
	System.out.println("str�� ����: "+ str.length());
		
	//�κй��ڿ� ������("Pro","Programming")
	
	//str.substring(int beginIndex,int endIndex)
	//beginIndex-����   , endIndex-������
	System.out.println("str.substring(4, 7)="+ 
	                        str.substring(4, 7));//4~6
	//str.substring(int beginIndex); beginIndex���� ~ ������
	System.out.println("str.substring(4)="+ str.substring(4));
		
	//Ư���ε����� ���� ������(�ټ���° ����)
	System.out.println("str�� �ټ���° ����="+ str.charAt(4));
	
	//Ư�������� �ε��� ������ ('P'������ �ε���)
	//str.indexOf(int ch)
	System.out.println( str.indexOf(10));//��ġ�ϴ� ���ڸ� ã�� �������� -1
	System.out.println( str.indexOf(80));
	System.out.println( str.indexOf('P'));//4
	//String str="JavaProgramming";
	//'a'������ �ε����� ���Ͻÿ�?
	System.out.println("str.indexOf('a')="+ str.indexOf('a'));//4
	//����°'a'������ �ε����� ���Ͻÿ�?
	System.out.println("str.indexOf(\"am\")="+ str.indexOf("am"));
	System.out.println("�ڿ��� ù��° a�� �ε���="+ str.lastIndexOf('a'));
		
	//���ڿ� ġȯ(��ü) 1. 'a'---> 'o'    2. "Java" ---> "�ڹ�"
	
	//str.replace(char oldChar, char newChar)
	System.out.println("str.replace('a', 'o')="+
	                               str.replace('a', 'o'));
	//str = str.replace('a', 'o');
	System.out.println("str="+ str);
	
	//str.replace(CharSequence target,CharSequence replacement)
	System.out.println("str.replace(\"Java\", \"�ڹ�\")="+
	                  str.replace("Java", "�ڹ�"));
	
	//���ڿ� ���� ����
    System.out.println("jaelee".equals("jaelee "));//false	
    
    str = "  "+str+"  "; //�յ� ���� �ΰ��� space(����)�߰�
    System.out.println("�����߰��� str���ڿ� ����="+ str.length());
    
    str = str.trim();// ���ʿ� ���ӵ� ������ �����ϴ� ���
    System.out.println("���������� str���ڿ� ����="+ str.length());
    
    
  }
}






