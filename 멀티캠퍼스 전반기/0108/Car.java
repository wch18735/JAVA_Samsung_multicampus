package com.mulcam.j0108;

public class Car {
   String carName;//null  ---> "�ҳ�Ÿ"
   int wheelNum;//0       ---> 4
   int velocity;//0       ---> 100
    
   public Car(String carName, int wheelNum, int velocity) {	
	 //������: ����ʱ�ȭ �ڵ�
	this.carName = carName;
	this.wheelNum = wheelNum;
	this.velocity = velocity;
   }

  public boolean equals(Car c) {//�� ��ü���� ���� ��
	 if(carName == c.carName &&
	    wheelNum == c.wheelNum &&
	    velocity == c.velocity)
	  {
		  return true;
	  }
	 else {
		 return false;
	 }
	 
   }//equals
   
   public String toString() {//���ڿ� ��ȯ��� �޼ҵ�, ��ü�� ���¸� ǥ���ϴ� �޼ҵ�
	  String str="�� ���� "+ this.carName+"�̰� �������� "+
                 wheelNum+"�̰� �ӵ��� "+velocity;
	  return str;
   }//toString
   
   public static void main(String[] args) {
	  //�ڵ��� Ŭ������ ���� ��ü ����
	   Car c1 = new Car("�ҳ�Ÿ",4,100);
	   Car c2 = c1;//new Car("�ҳ�Ÿ",4,100);
	   
	   Car c3;
	   
	       c3 = c1;
	   
	  System.out.println(c1.toString());
	                 // ----
	                 // this	   
	   
	  //�� c1�� c2�� �� (1.��ü�� ����(������)�� ��  2.�ּҸ� ��)
	 if(c1.equals(c2)){
     //---       ---- 
	 //this        c
	 
	    System.out.println("��ü���� ����!!");
	 }else {
		System.out.println("��ü���� �ٸ�!!");
	 }
	   
	 /*
	    int su1=10;   int su2=10;
	    �⺻�ڷ��� ������ ������ ���� �� ==>    su1 == su2    (O)
	      
	    String str1="�ڹ�";   String str2="�ڹ�";
	  Ŭ�����ڷ��� ������ ������ ���� �� ==>    str1 == str2   
	                                 ---------------
	                                                                  �޸� �ּҺ�!! 
	                                   
	                                   
	 �ڡ�                                                                        str1.equals(str2)  (O)                 
	                              ------------------
	                                                              ���ڿ� ���� ��!!
	    
	 */
	 
	 
	 if(c1  == c2) {
		System.out.println("��ü�ּ� ����!!(���� ���۷���)");
		//                 ----> �� ���� �޸� �Ҵ��� ���� �ٸ� ������ ����!!
	 }else {
		System.out.println("��ü�ּ� �ٸ�!!(�ٸ� ���۷���)");
	 }
	 
	   
   }//main
   
}





