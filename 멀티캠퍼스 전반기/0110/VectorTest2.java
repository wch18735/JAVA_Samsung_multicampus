package com.mulcam.j0110;

import java.util.Vector;

public class VectorTest2 {//��
	
  public static void main(String[] args) {
	 /*
	  Vector�� �����͸� ��� Ŭ���� 
	  //(�������̹迭: �ԷµǴ� �����ͼ��� �������� ���� �� ���)
	 
	  <> : ���׸�Ÿ��(�ڷ����� ���)     -----> ��Ἲ�� ���̱� ���� ���(JDK5����)
	  
	  <E> element�� ���� �ڷ����� ���
	  <K> key�� ���� �ڷ����� ���
	  <V> value�� ���� �ڷ����� ���
	  <T> type 
	  */
	 //Vector<String> v = new Vector<String>();
	 Vector<String> v = new Vector<>();
	 //������ �Է�
	 //v.add(Stirng e)
	 v.add("���浿");//�ε��� 0
	 v.add("ȫ����");//�ε��� 1
	 //v.add(new Integer(100)); //�����߻� : ���׸� ����� �ڷ����� �Է� ����
	 v.add("���ֿ�");//�ε��� 2
	 
	 
	 //��� ����!! ("ȫ����"----> "�����" ����)
	 //v.set(int index,String element)
	 //index�� �ش��ϴ� ��Ҹ� element�� �����ض�
	 v.set(1, "�����");
	 
	 
	 //��� ����!!  ("���浿" ����)
	 //v.remove("���浿");//ù��° �߰ߵǴ� "���浿"�� ����
	 v.remove(0); 
	 
	 
//��ü ������ ��� (���ʹ� �ԷµǴ� ��ҵ鿡 ���ؼ� ù��° ��Һ��� 0,1,2,3...�� �ο�)
	 for(int i=0; i< v.size();  i++) {
		System.out.println(i +":"+ v.get(i)); 
	 }
	 
	 
	 
  }//main	

}







