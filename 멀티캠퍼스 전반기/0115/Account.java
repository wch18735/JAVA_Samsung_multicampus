package com.mulcam.j0115;

public class Account {//������, �������
   private int total; //�� ��ݾ�

   public int getTotal() {
		return total;
   }
   
   public void deposit(int amount) {//��ݱ��
	   total+=amount;  //total = total + amount;
   }

   
}
