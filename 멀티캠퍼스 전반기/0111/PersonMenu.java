package com.mulcam.j0111;

import java.util.Vector;

public class PersonMenu {//'���'�����͸� Vector�� �߰�,����,����,�˻�(��ȸ)

   Vector<Person> persons;
   
   public PersonMenu() {
	 persons = new Vector<Person>();
   }
	
	
   public void insert(Person p) {//String name,int age, String job){
	   persons.add(p);
   }
   
   public void delete(int delNo){
//	 for(int i=0; i<persons.size(); i++) {
//	   Person p=persons.get(i);
//	   if(p.getAge() == delNo) {
//		   persons.remove(i);
//		   return true;
//	   }
//	 }
	   for(Person p: persons) {
		   if(p.getNo() == delNo) persons.remove(p);
	   }
   }	
   
   public void update(Person newP){
	   //persons.set(0, p);
	   
	  //��ȣ ��ġ�ϴ� Person�� ã�Ƽ� '���� ����(age,job)'
	  for(Person oldP:persons) {
		  //oldP: ����Person�� �޸� �ּ�
		  if(oldP.getNo()  ==  newP.getNo()) {
			  oldP.setAge(  newP.getAge()  );
			  oldP.setJob(  newP.getJob()  );
			  break;//��ȣ�� ������ ���� �����Ƿ� �ݺ���(��ȸ) Ż��
		  }
	  }
   }//update	
   
   public void select(){
    //���ͳ��� ��� ������� ���
	/*
	    #������
   1: [ȫ�浿,13,�л�]
   2: [���ֿ�,14,�л�]   
	 */
	  System.out.println("#������"); 
//	  for(int i=0; i<persons.size(); i++) {//���� �ε���
////		persons.get(0).getNo()  
////		persons.get(0).getName()  
////		persons.get(0).getAge()  
////		persons.get(0).getJob()
//		Person p = persons.get(i);
//		
//		System.out.println(p.getNo()+": ["+p.getName()+","
//			+p.getAge()+","+p.getJob()+"]");  
//	  }
	  for(Person p :persons) {
		  System.out.println(p);//���������� p.toString()�޼ҵ带 ȣ��
	  }
	   
   }//select	
	
}








