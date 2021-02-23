package com.mulcam.j0115;

public class Account {//저금통, 누적기능
   private int total; //총 모금액

   public int getTotal() {
		return total;
   }
   
   public void deposit(int amount) {//모금기능
	   total+=amount;  //total = total + amount;
   }

   
}
