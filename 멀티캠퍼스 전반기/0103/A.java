package com.mulcam.j0103;

public class A {
   //������ ==> ȫ�浿   100   3.14   true
    String ȫ�浿="ABC";
	String gildong1=ȫ�浿;
	String gildong2="ȫ�浿";
	
	int num1=100;
	String num2="100";
   
	float num3=3.14f;
	double num4=3.14;
	
	boolean a = true;
	
	void hello() {
      System.out.println("AŬ���� �ȳ�~!!"); 		
	}//hello
	
	//�Ű����� �޼ҵ� ȣ��!!
	void m1(int no1) {
	  System.out.println("m1():"+
	              no1);
	}
	
	void m2(int no1,int no2) {
      System.out.println("m2():"+
	    no1+","+no2);		
	}
	
	void m3(String name,
			int age,
			String job) {
	  System.out.println("m3()");
	  System.out.println("�̸�:"+name);
	  System.out.println("����:"+age);
	  System.out.println("����:"+job);
	  
	  
	}//�޼ҵ� ����ȣ�� return;�� �����
	//���� return ������; �϶��� �����Ұ�

	//������ ���ǵ� �޼ҵ� ȣ��!!
    int plus(int su1, int su2) {
    	int result = su1+su2;
    	
    	return result;
    }
	
	
	int m11() {
    //������: �޼ҵ带 ������ �� �����
	   int su=20000;
	   
	   return su;
	} 
	
	String m12() {
	   String name="���ֿ�";
	   
	   return name;	
	}
	
	//int,int,int m13() { �����߻�!!
	//�޼ҵ�� �տ� �������� �Ѱ��� �ڷ����� ����!!
	int[] m13() {
	   int a=10;
	   int b=20;
	   int c=30;
	   
	  //�������� ���� a,b,c�� ����
	   
	   //return  a,b,c; �����߻�
	  //return �������� �Ѱ��� �����͸� ����. 
	   int []array= {a,b,c};
	   
	   return array;
	}
	
	Person m14() {
	  String name="���ֿ�";
	  int age=15;
	  String job="�л�";
	  
	  Person p = new Person();
	   p.name=name;
	   p.age=age;
	   p.job=job;
	   
	  return p; 		
	}
	
	Person[] m15() {
		String name="���ֿ�";
		int age=15;
		String job="�л�";
		
		String name2="ȫ�浿";
		int age2=16;
		String job2="�л�";
		
		Person p = new Person();
		p.name=name;
		p.age=age;
		p.job=job;
		
		Person p2 = new Person();
		p2.name=name2;
		p2.age=age2;
		p2.job=job2;
		
		
		//int []su={};
		Person []persons= {p,p2};
		
		
		return persons; 		
	}
	
	
}//A class










