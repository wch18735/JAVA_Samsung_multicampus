package com.mulcam.j0104;//���� Ŭ������ ��ġ�� ǥ�� package ��Ű����;

import com.mulcam.j0103.A;
//�ٸ���Ű���� �ִ� Ŭ������ ���� Ŭ������ �����ͼ� ����ϰ���!!
//���������� �ϴ� Ŭ������ ��ġ�� ǥ��!!
// import ��Ű����.Ŭ������;

//import com.mulcam.j0103.A;

class Abc{
   String str;
   
   Abc(){//�⺻������
     this("�ڹ�");//�� �ٸ� �����ڸ� ȣ��
	 System.out.println("�⺻������!!");
	 //str="�ڹ�";
	 
   }
   
   Abc(String str){
	 System.out.println("�����ε�������!!");
	 //str=str;//�����Ű�����=�����Ű�����
	 this.str=str;//�������=�����Ű�����
   }
}


public class ThisTest {
   public static void main(String[] args) {
	  Abc a =    new           Abc();
	  //     (����)�޸��Ҵ�         ������ȣ��!!
	  
	  System.out.println("str="+ a.str);
	  System.out.println("=========================");
	  Abc a2 = new Abc("���̽�");
	  System.out.println("str="+ a2.str);
	  
	  A a3 = new A();
	  
   }
}





