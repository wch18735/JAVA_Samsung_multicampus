package com.mulcam.j0103;

public class ArrayTest {
  public static void main(String[] args) {
	 int []su= {11,22,33,44,55,66};
	 //�ε���         0  1  2  3
	 
	 //�迭�� ������ �̿��ؼ� ���(������ ���� �� �����͸� ����)
	 /*
	  System.out.println("su[0]="+ su[0] ); 
	  System.out.println("su[1]="+ su[1] );
	  System.out.println("su[2]="+ su[2] ); 
	  System.out.println("su[3]="+ su[3] );
	  System.out.println("su[4]="+ su[4] );
	*/
	 
	 System.out.println("�迭�� ũ��(��Ұ���)="+ su.length);
	 
	 for(int i=0; /*i<4*/ i<su.length; i++) {//0~3ǥ��
		 System.out.println("su[" +i+  "]="+ su[i] );  
	 }
	 
  }
}




