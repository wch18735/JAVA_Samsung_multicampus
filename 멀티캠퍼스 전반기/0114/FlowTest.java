package com.mulcam.j0114;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest {
  //�����̳�, ������Ʈ ����	
  Button bt1,bt2,bt3,bt4,bt5;
  Frame f;
	
  public FlowTest() {
	//�����̳�, ������Ʈ ��ü����!!(NullPointer���� �߻� ����)
	//new Button(String label)
	bt1 = new Button("ù��°��ư");
	bt2 = new Button("�ι�°��ư");
	bt3 = new Button("����°��ư");
	bt4 = new Button("�׹�°��ư");
	bt5 = new Button("�ټ���°��ư");
	
	//new Frame(String title)
	f = new Frame("Flow�׽�Ʈ");
	  
	//FlowLayout fl = new FlowLayout();
	//f.setLayout(fl);  
	f.setLayout(new FlowLayout());//��� ����  
	f.add(bt1);//�����ӿ� ��ư�� �ٿ���
	f.add(bt2);//�����ӿ� ��ư�� �ٿ���
	f.add(bt3);//�����ӿ� ��ư�� �ٿ���
	f.add(bt4);//�����ӿ� ��ư�� �ٿ���
	f.add(bt5);//�����ӿ� ��ư�� �ٿ���
	//�����̳�.add(���� ������Ʈ)
	  
	
	//������(�����̳� ������, ���̱�)
	//f.setSize(int width, int height);
	f.setSize(300, 300);
	f.setVisible(true);
	
  }//������
  
  public static void main(String[] args) {
	//FlowTest ft = new FlowTest();
	   new FlowTest();
  }
}
