package com.mulcam.j0103;

public class ContinueTest {
  //���� 1���� 10���� ���� ���� ȭ�鿡 ����Ͻÿ�. (1+2+3+....+9+10)
	
	public static void main(String[] args) {
	   int sum=0,n=1;
	   boolean flag=true;
	   
	 /*
	            �����
	    1.break;
	      -switch�� �Ǵ� �ݺ��������� ���
	      -switch�� �Ǵ� �ݺ��� ���� ����� ����.
	      
	    2.continue;
	      -�ݺ���(for,while,do~while)������ ���
	      -�ݺ����� ��� �����Ű�� ����.
	        for�� ���: ���������ڷ� �б�
	        while,do~while�� ���: ���ǽ����� �б�         
	 */
	   
	   
	   while(flag) {
		 sum+=n;//0+1+...+10  
		  
		 n++;
		 if(n <= 10) continue;
		 //1.> 2.< 3.==  4. >=  5.<=
		 
		 flag=false;
	   }//while
	   
	   System.out.println("sum="+sum);
	   System.out.println("n="+n);
	}//main
}
