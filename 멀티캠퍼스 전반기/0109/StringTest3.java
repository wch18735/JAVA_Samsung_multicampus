package com.mulcam.j0109;

import java.util.StringTokenizer;

public class StringTest3 {
    
    public static void main(String[] args) {
      String tel="010--5678";
      //�ε���          0123456789012
      String tel1,tel2,tel3;
		
      //����) '-'���� ���еǴ� �� ���ڸ� tel1,tel2,tel3�� �����Ͽ� ����Ͻÿ�.
      //    ==> substring()�� indexOf()�޼ҵ� ���.
      int idx1 = tel.indexOf('-');
      int idx2 = tel.lastIndexOf('-');
      System.out.println("ù��°�ε���:"+ idx1+ ", �ι�°�ε���:"+idx2);
      
      tel1= tel.substring(0,idx1);//3);
      tel2= tel.substring(idx1+1, idx2);//(4,8);
      tel3= tel.substring(idx2+1);//(9);
      
      
      System.out.println("tel1="+ tel1);
      System.out.println("tel2="+ tel2);
      System.out.println("tel3="+ tel3);
      
      System.out.println("=======================");
      //StringTokenizerŬ���� !!  ��ū: �����ڸ� ���� �и��Ǵ� ������.
      //String tel="010-1234-5678";
      //new StringTokenizer(String str,String delim)
      //str---> ���ع��ڿ�(��ü���ڿ�), delim(iter) ---> ������
      StringTokenizer st = new StringTokenizer(tel,"-");
      //st=["010","1234","5678"]
      while(st.hasMoreTokens()) {//st�ȿ� ��ū�� �����ϸ� true����
        System.out.println(st.nextToken());
      }
      System.out.println("=======================");
      
      
      //StringŬ�������� ���ڿ� �и� ����� ���� �޼ҵ� : split()
      //tel.split(String regex) regex:�����ڸ� �־ ���!!
      String []tels =tel.split("-"); //tels={"010","1234","5678"}
      for (int i = 0; i < tels.length; i++) {
		 System.out.println("tels["+i+"]="+ tels[i]);
	  }
      
      
      
      
	}//main
    
}


