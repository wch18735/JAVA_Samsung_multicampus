package com.mulcam.j0109;

import java.util.Random;

public class LottoTest3 {
  public static void main(String[] args) {
	//����� ��ȯ(ó������ �ߺ��� ������� �ʰ� �ϱ�!!)
	  
	  int []lotto = new int[45];
	  
	  for (int i = 0; i < lotto.length; i++) {
		lotto[i]= i+1;  
		//System.out.println("lotto["+i+"]="+lotto[i]);
	  }
	  
	  //��ȣ�����ֱ� (0������ ������ ������ ������ ���� ��ȯ)
	  int temp;
	  
	  Random r = new Random();
	  
	  for(int i=0; i<1000; i++) {//�����ִ� Ƚ��
		int rIdx = r.nextInt(44)+1; //0������ ������ 1����~44����
	    temp     = lotto[0];
	    lotto[0] = lotto[rIdx];
        lotto[rIdx] = temp;
	  }
	  
	  for (int i = 0; i < lotto.length; i++) {			 
		System.out.println("lotto["+i+"]="+lotto[i]);
      }
	  
	  System.out.println("�ڡڷζǹ�ȣ�ڡ�");
	  for(int i=0; i<6; i++) {
		System.out.print(lotto[i]); 
		if(i<5)System.out.print(", "); 
	  }
	  
  }//main

}






