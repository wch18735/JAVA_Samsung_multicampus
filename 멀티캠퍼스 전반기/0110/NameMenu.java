package com.mulcam.j0110;

public class NameMenu {
   String []names;
   
   public NameMenu() {
	 names = new String[5];
	 //      {null, null, null, null, null}
	 //names  [0]    [1]   [2]   [3]   [4]
   }
	
   public void insert(String name){
	  //�Ű������� ���� ���� ���� �̸��� �迭�� ����!!
	  //���(������ ���� null)�� ã�Ƽ� �迭�� ����!!
	  for (int i = 0; i < names.length; i++) {//��ü �迭���� ��� ã��
		 if(names[i] == null) {//���(null)�� ã�Ҵٸ�
		   names[i] = name;
		   break;
		 }
	  } 
   }//insert
    
   public void search(){//�迭���� ��ü ��� �����͸� ���
	  System.out.println("#�̸����");
	  
	  for(int i=0; i<names.length; i++) {//5�� �ݺ�
		 if(names[i] != null)//����� �ƴϿ����� 
		  System.out.println(" "+names[i]);  
	  }
   }//search  
  
   public void update(String oldName, String newName){
	  //��ü �迭���� �����̸��� ã��!!
	  for (int i = 0; i < names.length; i++) {
		 if(oldName.equals(names[i])) {//��ġ�ϴ� �̸��� ã�Ҵٸ�
			names[i]=newName;   //���ο� �̸����� ����!!
			break;
		 }
	  }  
   }//update
    
   public void delete(String delName){
     //��ü �迭���� ������ �̸��� ã��!!
	 for (int i = 0; i < names.length; i++) {
	   //if(names[i] != null) {//null üũ!! (null�� �ƴҶ�)	 
		 if(names[i] != null && names[i].equals(delName)) {
			names[i]=null; //���� ���� ---> null�� ä���
			break;
		 }
	   //}
	 }
	 /* 
	          �� ����    
          if( A���ǽ� && B���ǽ�   ):   A ���ǽ��� false�̸� B���ǽ� ����X
          if( A���ǽ� || B���ǽ�   ):   A ���ǽ��� true�̸� B���ǽ� ����X
	   */
   }//delete
}


   
   

