package com.mulcam.j0115;

import javax.swing.JFrame;

class MyThread extends Thread{
             //is a : 자식은 부모다!! MyThread는 Thread클래스다!!
	
	public MyThread(String name) {
		super(name);
	}
	
	
  //스레드 특성 메소드 추가
    @Override
   public void run() {
      //동시 실행할 문장!!
    
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
		//동시 실행할 문장!!
	    
	    try {
	    	 
			for(int i=0; i<10; i++) {
				//Thread.sleep(long millis);
				Thread.sleep(500);//0.5
				System.out.println("라임스레드:"+i);			
			 }
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
	}//run
	
}//MyThread2



public class ThreadTest {
   public static void main(String[] args) {
       //스레드 객체 생성(Thread)
	   //new Thread(String name); //name: 스레드 이름
	   MyThread t1 = new MyThread("길동스레드");
	   
	   //스레드 메소드 run() 호출  : start()메소드를 통한 run()실행!!
	   //                     -----------
	   //                      스케줄러!!	   
	   t1.start();
	   //--------------------------------------------------
	   
	   //스레드 객체 생성(Runnable)
	   MyThread2 r = new MyThread2();// Runnable객체
	   //질문) r은 스레드 객체일까요? -----> Runnable객체입니다!!
	   
	   //new Thread(Runnable target) target: run()메소드의 위치
	   Thread t2 = new Thread(r);  //t2: 스레드 객체
	   t2.start();  //두문장을 줄여  new Thread(r).start()
	   
	   
	   
   }//main
}










