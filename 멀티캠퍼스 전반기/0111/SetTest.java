package com.mulcam.j0111;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
   //Set : �ߺ� ������ ����, ������ ����ġ �ʴ�.   null���? O
	
   public static void main(String[] args) {
	
   	
   //Set<String> set = new HashSet<>();	
   HashSet<String> set = new HashSet<>();	
       set.add("ȫ�浿");
       set.add("�����");
       set.add("���ֿ�");
       set.add("ȫ�浿");
       set.add("�̼���");
       set.add(null);
       set.add(null);
       
     System.out.println("Set�� ����� ��� ����: "+  set.size());
     
     //��� ��� ��� 
     Iterator<String>  it = set.iterator();
     //������ �������̽�
     
     while(it.hasNext()) {
    	System.out.println(it.next()); 
     }
     
     Object []ob = set.toArray();
     for (int i = 0; i < ob.length; i++) {
		System.out.println("ob["+i+"]="+ob[i]);
	 }
     
     
     
   }//main	
}







