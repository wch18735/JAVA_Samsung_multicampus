package com.mulcam.j0115;

public class Customer extends Thread{//����� Ŭ����
   
	Account account;
	
	public Customer(Account account) {
	    this.account=account;
	}
	
	
	@Override
	public void run() {
		
	   try {
		for(int i=1; i<201; i++) {
			   account.deposit(1000);
			   System.out.println("������:"+ getName() + ":"+i+"��°");
			   sleep(20);
			   
			  if(account.getTotal() >= 500000)break;//�ִ��ǥġ 50���� 
		   }
	   } catch (InterruptedException e) {
		e.printStackTrace();
	   }
		
	}//run
}



