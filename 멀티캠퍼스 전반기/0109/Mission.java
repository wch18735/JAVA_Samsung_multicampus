package com.mulcam.j0109;

public class Mission {
  public static void main(String[] args) {
	  int k=5;
	  
	  int []su={  1,  2,  3,   4,   k};
	  //                          su[4]
	  
	System.out.println("����1)");
	for (int i = 0; i < su.length; i++) {//0~4
	  System.out.println(su[i]);	
	}
	
	System.out.println("================");
	System.out.println("����2)");
	for (int i = 4; i >= 0; i--) {//4~0
		System.out.println(su[i]);	
	}
	      //��         0��      1��          2��
	int su2[][]={ {1}, {1,2}, {1,2,3}  };
	      //��          0    0 1    0 1 2
	
	//su2:2�����迭   su2.length: ���� ����
	//su2[1] : su2�� �ι�°������(1�� �迭 ������)
	//su2[1].length : �迭�� ũ��(��Ұ���)
	
	System.out.println("================");
	System.out.println("����3)2�����迭 ��ü ������ ���");
	
	for(int i=0; i<su2.length; i++) {
		//����: �� ---> ���� �ε���
	  for(int j=0; j<su2[i].length; j++) {
		  //����(�迭)�� �� �ε���
	  System.out.println("su2["+i+"]["+j+"]����="
		        +su2[i][j]); 
	  }
	}
	System.out.println("================");
	System.out.println("����4)�迭��������(��������)");
	
	
	
	int []su3;
	   
	     //su3 = su;//�ּ� ����
	
	     su3= new int[su.length];
	
	for(int i=0; i<su.length; i++) {
		su3[i] = su[i];//���� ����
	}
	     
	     su3[2]=33;
	     
	System.out.println("======su3�迭======");
    for (int i = 0; i < su3.length; i++) {
	  System.out.println(su3[i]);	
	}	     
    
    System.out.println("======su�迭======");
    for (int i = 0; i < su.length; i++) {
    	System.out.println(su[i]);	
    }	
    
    System.out.println("================");
	System.out.println("����5)");
	
	//int []su={  1,  2,  3,   4,   5};
	int temp;
	int endIdx= su.length-1;
	
	//int loopCnt = su.length/2;//    5/2
	
	for (int i = 0; i < su.length/2; i++) {
		temp = su[i];
		su[i]= su[endIdx];
		su[endIdx]= temp;
		
		endIdx--;
	} 		
	
	
	for (int i = 0; i < su.length; i++) {
    	System.out.println(su[i]);
    }
	
  }
}










