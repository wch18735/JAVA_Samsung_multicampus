package com.mulcam.j0108;

import java.util.Random;

public class RandArrayTest {//�迭�� ������ ��(������ ��) �Է��ϱ�
    int []su;
    Random r;
    
    public RandArrayTest() {
	   su=new int[5];//5���� ������ �Է��� �� �ִ� �� ����
	   r = new Random();
	}//������
    
    public void printArray() {//���� �迭�� ���� ���� ���
       for (int i = 0; i < su.length; i++) {
		  System.out.println("su["+i+"]="+su[i]);
	   }	
    }//printArray
    
    public void inputArray() {
       //�����߻� - java.lang.Math:    random()   
   	   //        java.util.Random:   next() 
    	
       for (int i = 0; i < su.length; i++) {
		  //su[i]=����;
    	   //su[i]= Math.random();   int i=13.45;
    	   //su[i]= (int)Math.random();   //int i=(int)13.45;
    	            //0.0  ~ 0.9999999
    	   
    	   //su[i]=(int)(Math.random()*1000); // 0.0 ~ 999.99999
    	   //r.nextInt(int bound);  //0~ bound������
    	   su[i]=r.nextInt(2000);
	   }	
    	
    	
    }//inputArray
    
    
    public void sortArray() {//�迭���� ���� ����(��������,��������)
      int []data= { 47, 35,  29, 58, 99};
               //   [0] [1]  [2] [3] [4]
      
      
       int temp;//�ӽú���
      for(int i=0; i< su.length-1; i++) {//���� ���� ������ (����)  0~3 
    	  for(int j=i+1; j<su.length; j++) {//���� ������ ������    1~4
    		      //i=0  j=1,2,3,4
    		      //i=1  j=2,3,4
    		      //i=2  j=3,4
    		      //i=3  j=4
    		  //su[i]==>���ʵ�����  su[j]==>�����ʵ�����
    		 
    		 //if(su[i] > su[j]) {//���� �����Ͱ� ũ�ٸ�(������������)ascending
   			 if(su[i] < su[j]) {//������ �����Ͱ� ũ�ٸ�(������������)decending
    	      //������ ��ȯ��		 
    		  temp =su[i];
    		  su[i]=su[j];
    		  su[j]=temp;
    		 }
    	  }//for
      }//for
      
      
    }
	
	
	public static void main(String[] args) {
		RandArrayTest rat = new RandArrayTest();
		 rat.inputArray();
		 rat.sortArray();
		 rat.printArray();
	}
}




