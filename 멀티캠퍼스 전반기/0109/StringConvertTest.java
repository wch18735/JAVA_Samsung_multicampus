package com.mulcam.j0109;

public class StringConvertTest {

  public static void main(String[] args) {
	//StringŬ���� - ������ ���ڿ� ǥ�� (�ѹ� �ʱ�ȭ�� ���ڿ��� ��� �����Ǿ�� ��)
	//StringBufferŬ���� - �������ڿ� ǥ��
	  
	 String s1="�츮����";
	 String s2="���ѹα�";
	 
	 s1 = s1+s2;
	 System.out.println(s1);
	 /*
	   1. StringŬ������ü ����
	   2. ���ڿ� ��ȯ �۾��� ���� �ӽ÷� StringBufferŬ������ü ����
	   3. append()�޼ҵ� ����
	   4. ������� ���ڿ� ����
	   5. StringBufferŬ������ü �Ҹ�  
	   
	   s1+s2+s3+s4
	 */
	 
	 System.out.println("======================");
     StringBuffer sb = new StringBuffer("�츮����");
     sb.append("���ѹα�");
     
     System.out.println(sb);
     /*
        1. StringBufferŬ������ü ����
        2. append()�޼ҵ� ����
        
        append(s1).append(s2).append(s3)
      */
	 
  }//main	
	
}



