package com.mulcam.j0114;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloseTest2 extends WindowAdapter{
//������ ���� ��� X��ư�� Ŭ�������� �ݱ�(���α׷� ����)
//���� Ŭ����(�������̽�) - WindowListener !!	
  Frame f;	
	
  
  public WindowCloseTest2() {
	f = new Frame();
	
	f.setTitle("â�ݱ��׽�Ʈ2");
	  
	f.setSize(300,300);
	f.setVisible(true);
	
	//�̺�Ʈ�ҽ�: Frame  

	f.addWindowListener(this);
  }//������
    
  public void windowClosing(WindowEvent e) {//�̺�Ʈ �ڵ鷯
	 System.out.println("���α׷��� �����ϰڽ��ϴ�2~!!"); 
	 System.exit(0); 
  }  
  
  public static void main(String[] args) {
	 new WindowCloseTest2();
  }


}
