package com.mulcam.j0111;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class LottoSet {
   //�ߺ����� �ʴ� 6���� ������ ���(1~45)
   public static void main(String[] args) {
	  Random r = new Random();
	  
	  //HashSet<Integer> set = new HashSet<>();
	  TreeSet<Integer> set = new TreeSet<>(); //���ı�� �߰�!!
	    while(true) {
	      set.add(r.nextInt(45)+1);
	      if(set.size()==6)break;
	    }
      System.out.println("����� ��ȣ:"+ set);	    
   }//main
}








