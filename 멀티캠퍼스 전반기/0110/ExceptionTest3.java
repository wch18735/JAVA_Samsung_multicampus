package com.mulcam.j0110;



class UserException extends Exception{
	              // is a
	
	public UserException(String msg) {
	  super(msg);//상위클래스의 생성자를 호출해서 예외객체를 생성
	}
	
}



public class ExceptionTest3 {
  //사용자 정의 Exception 테스트
	
	public static void main(String[] args) {
		int su=4;
		
		try {
			if(su%2==0) {
			   throw new UserException("짝수 예외가 발생~!!");	
			}
		} catch (UserException e) {//e: 에러메시지 객체
			e.printStackTrace();
		}
	}
	
}






