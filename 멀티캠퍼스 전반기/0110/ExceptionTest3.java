package com.mulcam.j0110;



class UserException extends Exception{
	              // is a
	
	public UserException(String msg) {
	  super(msg);//����Ŭ������ �����ڸ� ȣ���ؼ� ���ܰ�ü�� ����
	}
	
}



public class ExceptionTest3 {
  //����� ���� Exception �׽�Ʈ
	
	public static void main(String[] args) {
		int su=4;
		
		try {
			if(su%2==0) {
			   throw new UserException("¦�� ���ܰ� �߻�~!!");	
			}
		} catch (UserException e) {//e: �����޽��� ��ü
			e.printStackTrace();
		}
	}
	
}






