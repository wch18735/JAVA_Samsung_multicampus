package com.mulcam.j0104;

public class InheritanceTest {
  public static void main(String[] args) {
	//1.�θ�Ŭ���� ��ü����
	Parent p=new Parent();
	/*
	   <�޸� �Ҵ�>
	    Object
	    Parent <---- p
	 */
	System.out.println("su="+ p.su);
	p.hello();
	//p.goodBye();//�����߻�
	//�θ� ���۷����� ���� �ڽ� ȣ�� �Ұ�!!	
	
	System.out.println("================");
	
	//2.�ڽ�Ŭ���� ��ü����
	Child c=new Child();
	  
	/*
		   <�޸� �Ҵ�>
		    Object
		    Parent 
		    Child  <---- c
	*/
	c.goodBye();
	c.hello();
	//�ڽ� ���۷����� ���� �θ� ȣ�� ����!!
		
	System.out.println("================");

	//3. �θ�Ŭ���� = �ڽ�Ŭ������
	Parent p2;
	       p2= new Child();
	//�Ǵ�  Parent p2 = c;
    /*
       <�޸� �Ҵ�>
	     Object
		 Parent  <---- p2
		 Child  
	 */
    p2.hello();
    //p2.goodBye();//�����߻�
    //�θ� ���۷����� ���� �ڽ� ȣ�� �Ұ�!!	
    //�ڴ�, �������̵��޼ҵ尡 �����Ѵٸ� 
 //�θ�޼ҵ�� ����(����)�ǰ� �ڽĸ޼ҵ�� ��ü�� �Ǿ�����!!
    
    
    
    
    System.out.println("================");
			
	//4. �ڽ�Ŭ���� = �θ�Ŭ���� : �����߻�
    
	//Child c21 = new Parent();
	//Child c22 = p;
	//Child c23 = p2;
    
    //5. �ڽ�Ŭ���� = (�ڽ�Ŭ����)�θ�Ŭ����
  	Child c2;
  	     c2=(Child)p2;//����  	     
  	     //c2=(Child)p; //����
  	//�ڽ� ������ ���� �θ�Ŭ������ �ڽ����� ����ȯ �Ұ�
	
	 
		
	
  }
}




