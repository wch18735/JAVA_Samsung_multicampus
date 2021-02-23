package com.mulcam.j0109;

import java.util.StringTokenizer;

public class StringTest3 {
    
    public static void main(String[] args) {
      String tel="010--5678";
      //인덱스          0123456789012
      String tel1,tel2,tel3;
		
      //문제) '-'으로 구분되는 각 숫자를 tel1,tel2,tel3에 저장하여 출력하시오.
      //    ==> substring()과 indexOf()메소드 사용.
      int idx1 = tel.indexOf('-');
      int idx2 = tel.lastIndexOf('-');
      System.out.println("첫번째인덱스:"+ idx1+ ", 두번째인덱스:"+idx2);
      
      tel1= tel.substring(0,idx1);//3);
      tel2= tel.substring(idx1+1, idx2);//(4,8);
      tel3= tel.substring(idx2+1);//(9);
      
      
      System.out.println("tel1="+ tel1);
      System.out.println("tel2="+ tel2);
      System.out.println("tel3="+ tel3);
      
      System.out.println("=======================");
      //StringTokenizer클래스 !!  토큰: 구분자를 통해 분리되는 데이터.
      //String tel="010-1234-5678";
      //new StringTokenizer(String str,String delim)
      //str---> 기준문자열(전체문자열), delim(iter) ---> 구분자
      StringTokenizer st = new StringTokenizer(tel,"-");
      //st=["010","1234","5678"]
      while(st.hasMoreTokens()) {//st안에 토큰이 존재하면 true리턴
        System.out.println(st.nextToken());
      }
      System.out.println("=======================");
      
      
      //String클래스내의 문자열 분리 기능을 갖는 메소드 : split()
      //tel.split(String regex) regex:구분자를 넣어서 사용!!
      String []tels =tel.split("-"); //tels={"010","1234","5678"}
      for (int i = 0; i < tels.length; i++) {
		 System.out.println("tels["+i+"]="+ tels[i]);
	  }
      
      
      
      
	}//main
    
}


