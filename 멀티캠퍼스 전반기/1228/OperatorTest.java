package com.mulcam.j1228;

//class A{  }   ---> �ڹ� Ŭ����
//class A{ main(){} }   ---> �ڹ� Application(�ڹ��������α׷�)
//                      ---> ���������� ������ �� �ִ� ���α׷�!!


public class OperatorTest {
   public static void main(String[] args) {
	  int su1=10;
	  int su2=3;//5;
	  
	  
	  //1+2+"3"    3+"3"  "33"
	  //"1"+2+3    "12"+3   "123"
	  System.out.println(1+2+"3");
	  System.out.println("1"+2+3);
	  
	  //su1�� su2�� ��Ģ����
	  System.out.println("su1+su2 =" + (su1+su2) );
	                     // ���ڿ�        +  ���Ѱ����
	  System.out.println(su1+ "-" + su2 +"="+ (su1-su2) );
	  System.out.println(su1+ "*" + su2 +"="+ (su1*su2) );
	  System.out.println(su1+ "/" + su2 +"="+ (su1/su2) );
	  System.out.println(su1+ "%" + su2 +"="+ (su1%su2) );
	  
	  System.out.println("===========================");
	  
	  int su3=10;
	  int su4=10;
	  
	  int sum3=0;
	  int sum4=0;
	  
	  //su3�� 1������ ���� sum3�� ����
	     sum3 = su3++;
	  System.out.println("sum3="+ sum3 +", su3="+ su3);
	     
	  //su4�� 1������ ���� sum4�� ����
	     sum4 = ++su4;
      System.out.println("sum4="+ sum4 +", su4="+ su4);
	  
	  int su5=10;
	  int su6=10;
	  //su5�� ���� 2�����Ͻÿ�
	    //su5= su5+2;
	     su5 += 2;
	  System.out.println("su5="+ su5);
	  //su6�� ���� 4�����Ͻÿ�
	    su6 += 4;
	  System.out.println("su6="+ su6);
	    
	    //���� su6���� 3���?   su6 = su6*3;
	    su6 *= 3;
      System.out.println("su6="+ su6);
	   
   }//main
}//class



