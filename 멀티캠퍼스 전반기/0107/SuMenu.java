package com.mulcam.j0107;

import java.io.IOException;

public class SuMenu {
   	
	
	
  public static void main(String[] args) throws IOException {
	int no;
	int su=0;//출력,증가,감소
	
	do{ 	  
	   System.out.println("<<메뉴>>");
	   System.out.println("1.검색 2.증가 3.감소 4.종료");
	   System.out.print("번호==>");
	   no=System.in.read()-48;//입력시점
	          System.in.read();//엔터키 처리(CR)
	          System.in.read();//엔터키 처리(LF)
	    
        //메뉴처리(번호1~3): if~else if~else문,  switch~case문
        	    
	    switch(no) {
	      case 1: System.out.println("#검색결과:"+su);
	              break;
	      case 2: su++;	    
	              System.out.println("#1증가하였습니다.");
	              break;
	      case 3: su--;
	              System.out.println("#1감소하였습니다.");	             
	    }//switch
	          
        System.out.println();	          
	  }while(no != 4);//(no==1 || no==2 || no==3);//반복 조건
	
	System.out.println("-- END --");
	
  }//main
}
