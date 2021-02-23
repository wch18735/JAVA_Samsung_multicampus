package com.mulcam.j0108;

import java.io.IOException;

public class GugudanTest2 {
  public static void main(String[] args) throws IOException {
	System.out.println("<<구구단2>>");

  String yn;	
  Gugudan2 g = new Gugudan2();
  do{	
	 g.printDan(g.inputDan());
	 yn=g.continueDan();
	 System.out.println();
	}while(yn.equals("y"));//while(반복조건식);

	System.out.println("-- END --");
  }
}





