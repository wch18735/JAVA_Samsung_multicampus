package com.mulcam.j0102;

public class HakjumTest2 {
	//if~else if~else����� ���� ���ϱ�
	public static void main(String[] args) {
	   int jumsu=100;//0~100
	   
	   //if(90<=jumsu<=100) { ==> �����߻�: jumsu�� ���Ͽ� ���� ���ؾ� ��
	   if(jumsu<0 ||  jumsu>100) {//�������� ���� �����Ͱ� �ԷµǾ�����
		   System.out.println("#����(0~100)���� ������ �Է�!!");
	   }else
	   if(jumsu>=90) {//if(jumsu>=90  && jumsu<=100)
		 System.out.println("A����");  
	   }else //jumsu<90
		   if(jumsu>=80) {
			   System.out.println("B����");
		   }else if(jumsu>=70) {
			   System.out.println("C����");
		   }else if(jumsu>=60) {
			   System.out.println("D����");
		   }else {//���� �װ�if�� ������ ���
			   System.out.println("F����");
		   }
	   
	}

}
