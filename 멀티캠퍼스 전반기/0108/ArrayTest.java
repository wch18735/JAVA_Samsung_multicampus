package com.mulcam.j0108;

class Person{
   String name;
   int age;
   String job;
   
  public Person(String name, int age, String job) {
	this.name = name;
	this.age = age;
	this.job = job;
  }

	@Override
	public String toString() {
		return "Person [�̸�=" + name + ", ����=" + age 
				+ ", ����=" + job + "]";
	}

  
	
}//Person


public class ArrayTest {
	
  public static void main(String[] args) {
	//1�����迭 (�����Ͱ��� �̹� ���ǵ� ���)
	
	 //int []su;
	 //      su= {11,22,33,44}; //�����߻�!! (����� �ʱ�ȭ�� ���� �ۼ�X)
	  
	 int[]su= {11,  22,   33,   44};
	   //    su[0]  su[1] su[2] su[3] 
	 //su�迭�� ��ü �����͸� ��� ---> ���� for���� ���
	 
	 System.out.println("�迭�� ũ��(��Ұ���):"+ su.length);
	 for(int i=0; i<su.length; i++) {//�迭�� �ε����� ǥ�� (0~3)
		 System.out.println("su["+i+"]����="+su[i]);
	 }
	 
	 //1�����迭 (�迭��ü����)- ���α׷� ���� �� �߻��ϴ� �����͸� �Է��� ��
	 //����) �ڷ���[]�迭�� = new �ڷ���[�迭ũ��];
	 //int []su2 = new int[5];//5���� ������ ���� �غ�(5���� �����)
	 int []su2;
	       su2 = new int[5];//---> �� �ڷ����� �⺻���� �Է�!!
	 System.out.println("-----------------------");      
     for (int i = 0; i < su2.length; i++) {//su2�迭�� �ε��� ǥ��(0~4)
    	 System.out.println("su2["+i+"]����="+su2[i]);
	 }
     
     //�� ���� �����͸� �Է�
     su2[0]=2;
     su2[1]=4;
     su2[2]=6;
     System.out.println("-----------------------");      
     for (int i = 0; i < su2.length; i++) {//su2�迭�� �ε��� ǥ��(0~4)
    	 System.out.println("su2["+i+"]����="+su2[i]);
	 }
	  
     System.out.println("-----------------------");      
     Person [] persons=new Person[3];
       Person p = new Person("ȫ�浿",13,"�л�");
       System.out.println(p);//p�� toString()�� ȣ��
       System.out.println(p.toString());
       
       persons[0]=p;
       persons[1]=new Person("�����",15,"�л�");
       persons[2]=new Person("���ֿ�",17,"�л�");

     
     for (int i = 0; i < persons.length; i++) {
    	 System.out.println("persons["+i+"]����="+persons[i]);
	 }      
     
     
     System.out.println("==============================");      
     //2�����迭�� �� ���
     int [][]su3 = {{1}, {1,2},  {1,2,3}};
     
     System.out.println("su3.length(su3�迭�� �� ����)="+ su3.length);
     
     for(int i=0; i<su3.length; i++) {//���� �ε��� (0~2)
    	 for(int j=0; j<su3[i].length; j++) {
    		 //���ึ���� �� �ε���(0��-1, 1��-2, 2��-3)
    		 // su3[1].length ---> 2
    		System.out.println("su3["+i+"]["+j+"]="+ su3[i][j]); 
    	 }
     }
     
     
  }//main

}






