package com.mulcam.j0114;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowCloseTest extends Frame 
                             implements WindowListener{
//������ ���� ��� X��ư�� Ŭ�������� �ݱ�(���α׷� ����)
//���� Ŭ����(�������̽�) - WindowListener !!	
  
  public WindowCloseTest() {
	setTitle("â�ݱ��׽�Ʈ1");
	  
	setSize(300,300);
	setVisible(true);
	
	//�̺�Ʈ�ҽ�: Frame  
	
	//this.addWindowListener(this);
	addWindowListener(this);
  }//������
    
  public void windowOpened(WindowEvent e) {}    
  public void windowClosing(WindowEvent e) {//�̺�Ʈ �ڵ鷯
	 System.out.println("���α׷��� �����ϰڽ��ϴ�~!!"); 
	 System.exit(0); 
  }  
  public void windowClosed(WindowEvent e) {}  
  public void windowIconified(WindowEvent e) {}  
  public void windowDeiconified(WindowEvent e) {}  
  public void windowActivated(WindowEvent e) {}
  public void windowDeactivated(WindowEvent e) {}
  
  public static void main(String[] args) {
	 new WindowCloseTest();
  }


}
