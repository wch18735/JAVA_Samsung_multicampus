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
		System.out.println("<(main메소드)매개변수를 통한 입력>");
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("a="+a+", b="+b);
		System.out.println("a를 b로 나눈 몫="+ (a/b));
		System.out.println("나눗셈을 원활히 수행하였습니다^O^");
		
	  }catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("## 두개의 수를 반드시 입력하세요!!"+ ae.getMessage());
		
		return;
	  }catch(Exception e) {//Exception e = new ArithmeticException()
		  System.out.println("모든 예외 처리!!"+ e);
	  }finally {
		System.out.println("예외 발생과 상관없이 실행!!(자원의 반환 코드)");
	  }
   
      System.out.println("마지막 문장~!!");
   
//    catch(ArithmeticException ae) {
//		System.out.println("## 0으로 나눌수 없습니다!!"+ ae.getMessage());  
//	  }catch(NumberFormatException ne) {
//		System.out.println("## 숫자만 입력하세요!!"+ ne.getMessage());  
//	  }
      
	
  }//main
  
}



