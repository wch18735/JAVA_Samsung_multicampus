package com.mulcam.j0115;

import javax.swing.JFrame;

class MyThread extends Thread{
             //is a : �ڽ��� �θ��!! MyThread�� ThreadŬ������!!
	
	public MyThread(String name) {
		super(name);
	}
	
	
  //������ Ư�� �޼ҵ� �߰�
    @Override
   public void run() {
      //���� ������ ����!!
    
    try {
    	 
		for(int i=0; i<10; i++) {
			//Thread.sleep(long millis);
			Thread.sleep(500);//0.5
			System.out.println(getName()+":"+i);			
		 }
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    	
   }//run
    
}//MyThread

class MyThread2  //extends JFrame  
                 implements Runnable{

	@Override
	public void run() {
		//���� ������ ����!!
	    
	    try {
	    	 
			for(int i=0; i<10; i++) {
				//Thread.sleep(long millis);
				Thread.sleep(500);//0.5
				System.out.println("���ӽ�����:"+i);			
			 }
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
	}//run
	
}//MyThread2



public class ThreadTest {
   public static void main(String[] args) {
       //������ ��ü ����(Thread)
	   //new Thread(String name); //name: ������ �̸�
	   MyThread t1 = new MyThread("�浿������");
	   
	   //������ �޼ҵ� run() ȣ��  : start()�޼ҵ带 ���� run()����!!
	   //                     -----------
	   //                      �����ٷ�!!	   
	   t1.start();
	   //--------------------------------------------------
	   
	   //������ ��ü ����(Runnable)
	   MyThread2 r = new MyThread2();// Runnable��ü
	   //����) r�� ������ ��ü�ϱ��? -----> Runnable��ü�Դϴ�!!
	   
	   //new Thread(Runnable target) target: run()�޼ҵ��� ��ġ
	   Thread t2 = new Thread(r);  //t2: ������ ��ü
	   t2.start();  //�ι����� �ٿ�  new Thread(r).start()
	   
	   
	   
   }//main
}










