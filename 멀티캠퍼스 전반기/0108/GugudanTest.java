package com.mulcam.j0108;

import java.io.IOException;

public class GugudanTest {
  public static void main(String[] args) throws IOException {
	System.out.println("<<������>>");
//	A a = new A();
//	a.hello();
//	---> new A().hello();
	
	//for(;;) {}//���ѷ��� --> while(true){}
	//for(int i=0,j=0; i<10; i++,j--)
  char yn;	
  Gugudan g = new Gugudan();
  
  do{		
	 //int dan = g.inputDan();	
	 //g.printDan(dan);
	 g.printDan(g.inputDan());
	 yn=g.continueDan();
	 System.out.println();
	}while(yn=='y');//while(�ݺ����ǽ�);

	System.out.println("-- END --");
  }
}





