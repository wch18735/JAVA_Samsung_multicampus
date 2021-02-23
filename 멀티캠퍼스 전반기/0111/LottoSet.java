package com.mulcam.j0111;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class LottoSet {
   //중복되지 않는 6개의 정수를 출력(1~45)
   public static void main(String[] args) {
	  Random r = new Random();
	  
	  //HashSet<Integer> set = new HashSet<>();
	  TreeSet<Integer> set = new TreeSet<>(); //정렬기능 추가!!
	    while(true) {
	      set.add(r.nextInt(45)+1);
	      if(set.size()==6)break;
	    }
      System.out.println("행운의 번호:"+ set);	    
   }//main
}








