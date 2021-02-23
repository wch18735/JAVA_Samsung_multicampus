package com.mulcam.j0111;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.awt.*;

class B{
	
	public void dataPrint(Vector<String> v) {
		System.out.println("==================");
	   	for(String str :v) {
	   		System.out.println(str);
	   	}
	}
	
	public void dataPrint2(List<String> v) {
		System.out.println("--------------------");
		for(String str :v) {
			System.out.println(str);
		}
	}
	
}


public class ListTest {
  public static void main(String[] args) {
	//ArrayList - Vector�� ��빮���� ����!!
	//          - ������: ArrayList�� ó�� �ӵ��� ������
	//                  (����: Vector���� ����ȭ �ڵ尡 �߰��Ǿ�����)
	
	ArrayList<String> list = new ArrayList<>();
	
	List<String> list2 = new ArrayList<>();
	//�ڷῡ ���� �߰�, �˻�, ����, ����
	
	List<String> list3 = new Vector<>();
	List<String> list4 = new LinkedList<>();
	
	
	Vector<String> v = new Vector<>();
	  v.add("�浿");
	  v.add("����");
	  v.add("�ֿ�");
	 
	 //���� toString() �������̵��� �����ؼ� ����� �����͸� ������!!
	 System.out.println("v="+ v); 
	  
	 B b = new B();
	   b.dataPrint(v);
	   
	 ArrayList<String> alist = new ArrayList<String>();
	   alist.add("ȫ");
	   alist.add("��");
	   alist.add("��");
	   
	 LinkedList<String> linkList = new LinkedList<String>();
	   linkList.add("a");
	   linkList.add("b");
	   linkList.add("c");
	   
	   //b.dataPrint(alist);
	   b.dataPrint2(v);
	   b.dataPrint2(alist);
	   b.dataPrint2(linkList);
	   
	 //ArrayList�� LinkedList �ӵ� �׽�Ʈ
	   
	 ArrayList<Person>  list10 = new ArrayList<>();   
	 LinkedList<Person>  list20 = new LinkedList<>();
	 
	 //ù��°: �������� �Է�!! �����͸� �ڷ� �߰�
	 long start,end;
	 
	 start = System.currentTimeMillis();
	 for(int i=0; i<10000000; i++) {
		 list20.add(new Person()); 
	 }
	 end = System.currentTimeMillis();
	 System.out.println("LinkedList �������Է½ð�(����): "+ (end-start));
	 
	 
	 start = System.currentTimeMillis();
	 for(int i=0; i<10000000; i++) {
		list10.add(new Person()); 
	 }
	 end = System.currentTimeMillis();
	 System.out.println("ArrayList �������Է½ð�(����): "+ (end-start));
	 
	 ///////////////////////////////////////////////////////
	 System.out.println("===========================");
	 //�ι�°: �߰� �Է�(ArrayList�� �ε����� ���� ��迭)!! �����͸� �տ� �߰�
	 	 
	 start = System.currentTimeMillis();
	 for(int i=0; i<100000; i++) {
		 //list20.add(int index,Person element); 
		 list20.add(0, new Person()); 
	 }
	 end = System.currentTimeMillis();
	 System.out.println("LinkedList �������Է½ð�(�߰��Է�): "+ (end-start));
	 
	 
	 start = System.currentTimeMillis();
	 for(int i=0; i<100000; i++) {
		 list10.add(0,new Person()); 
	 }
	 end = System.currentTimeMillis();
	 System.out.println("ArrayList �������Է½ð�(�߰��Է�): "+ (end-start));
	 
	
  }//mai
}









