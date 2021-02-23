package com.mulcam.j0115;

public class Customer extends Thread{//모금자 클래스
   
	Account account;
	
	public Customer(Account account) {
	    this.account=account;
	}
	
	
	@Override
	public void run() {
		
	   try {
		for(int i=1; i<201; i++) {
			   account.deposit(1000);
			   System.out.println("성금자:"+ getName() + ":"+i+"번째");
			   sleep(20);
			   
			  if(account.getTotal() >= 500000)break;//최대목표치 50만원 
		   }
	   } catch (InterruptedException e) {
		e.printStackTrace();
	   }
		
	}//run
}



