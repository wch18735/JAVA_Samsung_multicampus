package com.mulcam.j0103;

public class MethodCallTest {
	
	public static void main(String[] args) {
		//A obj = new A();
		
	   A a = new A();
	   //AŬ���� ����� �غ� ��������.
	   //AŬ������ ����鿡 ���� �޸� �Ҵ�.
	   //����!!
	   //a.���
	   //a.�Ӽ�������  a.�޼ҵ��();
	   //a.~  AŬ������ �ִ�~
	   
	   System.out.println(a.ȫ�浿);
       System.out.println(a.gildong2);
       
       //System.out.println(a.hello());
       a.hello();
       
       int no1=11;
       //m1()�޼ҵ� ȣ�� , no1���� ����
       
       a.m1(11);//�޼ҵ� ȣ��
       a.m1(no1);//�޼ҵ� ȣ��
       
       int no2=22;
       //m2()�޼ҵ� ȣ��, no1,no2���� ����
       
       a.m2( no1, no2 );
       
       String name="ȫ�浿";
       int age=13;
       String job="�л�";
       
       
       //m3()�޼ҵ� ȣ��,
       //name,age,job�����͸� ����
       
       a.m3(name,age,job);//�޼ҵ� ȣ��
System.out.println("=========");
       a.m3(job,age,name);//�޼ҵ� ȣ��
       
       
     //������ ���ǵ� �޼ҵ� ȣ��!!
       a.m11();
      
      int su = a.m11();
     //����void(��ȯ������ ����)���� ������
     //�޼ҵ�ȣ��տ� �ް��� �ϴ� �������� ���������� ��.
      System.out.println("su="+su); 
       
      String str = a.m12();
      
      System.out.println("str="+str);
      
      int [] arr =a.m13();
      //��ü �迭�� �ε����� ǥ���ϴ� for��
      for (int i = 0; i < arr.length; i++) {
		System.out.println("arr["+i+"]����="+arr[i]);
	  }
      
      Person pp= a.m14();
      System.out.println("�̸�:"+pp.name);
      System.out.println("����:"+pp.age);
      System.out.println("����:"+pp.job);
      
      
	}//main

}






