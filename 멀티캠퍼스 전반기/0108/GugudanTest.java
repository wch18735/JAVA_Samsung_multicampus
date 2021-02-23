package com.mulcam.j0108;

import java.io.IOException;

public class GugudanTest {
  public static void main(String[] args) throws IOException {
	System.out.println("<<구구단>>");
//	A a = new A();
//	a.hello();
//	---> new A().hello();
	
	//for(;;) {}//무한루프 --> while(true){}
	//for(int i=0,j=0; i<10; i++,j--)
  char yn;	
  Gugudan g = new Gugudan();
  
  do{		
	 //int dan = g.inputDan();	
	 //g.printDan(dan);
	 g.printDan(g.inputDan());
	 yn=g.continueDan();
	 System.out.println();
	}while(yn=='y');//while(반복조건식);

	System.out.println("-- END --");
  }
}





