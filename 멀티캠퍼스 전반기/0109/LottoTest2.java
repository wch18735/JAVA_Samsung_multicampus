package com.mulcam.j0109;

import java.util.Arrays;
import java.util.Random;

public class LottoTest2 {
  int []lotto;
  Random r;
  
  public LottoTest2() {
	lotto=new int[6];
	r = new Random();
  }//������
  	
  public void printNum(int no) {//��ȣ ���
    //�������) 2, 12, 15, 34, 36, 42
	Arrays.sort(lotto);  
	
	System.out.print(" "+no+"ȸ: ");
	for (int i = 0; i < lotto.length; i++) {//0~5
	  System.out.print(lotto[i]);
	  if(i< lotto.length-1)System.out.print(", ");	
	}
	System.out.println();
  }//printNum
  
  public void generateNum() {//��ȣ ����
	for (int i = 0; i < lotto.length; i++) {
		lotto[i]=r.nextInt(45)+1;//������ �� �Է�
		//boolean flag = duplicateNumCheck(i);
		//if(flag) {i--;}//�ߺ������� �߽߰�
		if(duplicateNumCheck(i)) {i--;}
	}  
  }//generateNum
  
  public boolean duplicateNumCheck(int idx) {
	//�ߺ��˻� (�ߺ������� �߽߰� true����)
	//�Էµȼ� 1(idx):0,  2:0,1  3:0,1,2  4:0,1,2,3  5:0,1,2,3,4
	
	for(int i=0; i<idx; i++) {// ':'�ڿ� ���� ǥ��
	   if(lotto[idx] ==  lotto[i]) return true;	//�ߺ������� �߽߰�  
	} 
	  
    return false;	  
  }
  
	
  public static void main(String[] args) {
	  LottoTest2 lotto = new LottoTest2();
	 System.out.println("�ڡ� ���� ����� �ζǹ�ȣ �ڡ�");
	 for(int i=1; i<6; i++) {//��ȣ Ƚ�� ���� (5ȸ)
	   lotto.generateNum();	   
	   lotto.printNum(i);		 
	 }
	  
  }//main
}






