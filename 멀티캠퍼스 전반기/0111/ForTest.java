package com.mulcam.j0111;

import java.util.Vector;

class A{
    @Override
    public String toString() {
    	return "A�ȳ�";
    }	
}

public class ForTest {
   public static void main(String[] args) {
	  int []arr = {11,22,33};
	  for(int  su:arr) {
		 System.out.println(su); 
	  }
	  
	  Vector<String> v = new Vector<String>();
	     v.add("�浿");
	     v.add("����");
	     v.add("�ֿ�");
	  
	  for(String name  : v) {
         System.out.println(name);		  
	  }
	  
	  Vector<A>  v2 = new Vector<A>();
	     v2.add(new A());
	     v2.add(new A());
	     v2.add(new A());
	     
       for(A a: v2) {
    	  System.out.println(a.toString()); 
       }
	  
   }
}





