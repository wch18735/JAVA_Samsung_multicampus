package com.mulcam.j0110;

public class ExceptionTest2 {
	
  public static void main(String[] args) {
	//String [] args={"10", "5"};
	/*
	      a     b
	     ---------
	     10     5   
	     10     0                      ArithmeticException
	     ab     cd                     NumberFormatException
	     10     X    args[]={"10"}     ArrayIndexOutOfBoundsException
	     
	     
	 */
   try{	  
		System.out.println("<(main�޼ҵ�)�Ű������� ���� �Է�>");
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("a="+a+", b="+b);
		System.out.println("a�� b�� ���� ��="+ (a/b));
		System.out.println("�������� ��Ȱ�� �����Ͽ����ϴ�^O^");
		
	  }catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("## �ΰ��� ���� �ݵ�� �Է��ϼ���!!"+ ae.getMessage());
		
		return;
	  }catch(Exception e) {//Exception e = new ArithmeticException()
		  System.out.println("��� ���� ó��!!"+ e);
	  }finally {
		System.out.println("���� �߻��� ������� ����!!(�ڿ��� ��ȯ �ڵ�)");
	  }
   
      System.out.println("������ ����~!!");
   
//    catch(ArithmeticException ae) {
//		System.out.println("## 0���� ������ �����ϴ�!!"+ ae.getMessage());  
//	  }catch(NumberFormatException ne) {
//		System.out.println("## ���ڸ� �Է��ϼ���!!"+ ne.getMessage());  
//	  }
      
	
  }//main
  
}



