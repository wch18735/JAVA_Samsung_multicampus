package com.mulcam.j0114;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class Abc extends WindowAdapter{
   @Override
  public void windowClosing(WindowEvent e) {//�̺�Ʈ �ڵ鷯
	System.out.println("���α׷��� �����ϰڽ��ϴ�3~!!");
  }
}


public class WindowCloseTest3 extends Frame{
//������ ���� ��� X��ư�� Ŭ�������� �ݱ�(���α׷� ����)
//���� Ŭ����(�������̽�) - WindowListener !!	
  
  public WindowCloseTest3() {
	setTitle("â�ݱ��׽�Ʈ3");
	  
	setSize(300,300);
	setVisible(true);
	
	//�̺�Ʈ�ҽ�: Frame  

    Abc a = new Abc();
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("���α׷��� �����ϰڽ��ϴ�3~!!");
			System.exit(0);
		}
	});
  }//������
    
  
  
  public static void main(String[] args) {
	 new WindowCloseTest3();
  }


}
