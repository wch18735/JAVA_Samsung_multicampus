package com.mulcam.j0110;

import java.util.Vector;

public class NameMenu2 {
   Vector<String> names;
   
   public NameMenu2() {
	 names = new Vector<>();
   }
	
   public void insert(String name){
	 if(existName(name)) {
		System.out.println("#�ߺ��Ǵ� �̸��� �����մϴ�!!");
		return;
	 }  
	   
	 if(names.size() < 5)  
	  names.add(name);
	 else// names.size() >= 5
	  System.out.println("#�� �̻� �Է��� �� �����ϴ�!!\r\n" + 
	  		          " �Է��� ���� �� ���� �̸��� ���� �����ϼ���!!");	 
   }//insert
    
   public void search(){//�迭���� ��ü ��� �����͸� ���
	  System.out.println("#�̸����");
	  
	  for(int i=0; i<names.size(); i++) {//�Է� ����� ����ŭ
		 System.out.println(" "+ names.get(i));  
	  }
   }//search  
  
   public void update(String oldName, String newName){
	  //��ü �迭���� �����̸��� ã��!!
	  if(!existName(oldName)) {
		  System.out.println("#�������� �ʴ� �̸��Դϴ�!!");
		  return;
	  }
	   
	   
	  for (int i = 0; i < names.size(); i++) {
		 if(names.get(i).equals(oldName)) {//��ġ�ϴ� �̸��� ã�Ҵٸ�
			names.set(i, newName);   //���ο� �̸����� ����!!
			break;
		 }
	  }  
   }//update
    
   public void delete(String delName){
     //��ü �迭���� ������ �̸��� ã��!!
//	 for (int i = 0; i < names.size(); i++) {
//	   if(names.get(i).equals(delName)) {//��ġ�ϴ� �̸��� ã�Ҵٸ�
//			names.remove(i);  
//			break;
//	   }
//	 }
	   if(!existName(delName)) {
			  System.out.println("#�������� �ʴ� �̸��Դϴ�!!");
			  return;
	   }
	   names.remove(delName);
	 
   }//delete
   
   public boolean existName(String name) {//�����ϴ� �̸� �߽߰� true����
	   return names.contains(name);
   }
   
   
}


   
   

