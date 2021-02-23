package com.mulcam.j0114;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest extends Frame implements ActionListener{
   int cnt;
   Button bt;	
   //�̺�Ʈ(���): ��ư�� ��������, üũ�ڽ��� üũ������, ���콺�� ����������
   //           Ű���带 ��������, ��ũ�� �����ٸ� ����������
   
   //==> bt�� �������� (�̺�Ʈ!!)
        //==> �̺�Ʈ�� �߻���Ų ������Ʈ : Event Source ��
        //==> �м�: ActionEvent
                  //==> ActionListener (�������̽�)
   
   //==> ȭ�� �ֿܼ� '�ȳ�'�� ���.   
        //==> ��� �߰� : Event Handler ��
   
   
   public EventTest() {
	  setTitle("�̺�Ʈ�׽�Ʈ");
      bt = new Button("����ư");
      
      setLayout(new FlowLayout());
      add(bt);
      
      setSize(300, 300);
      setVisible(true);
      
      //�ҽ�.add�����ʸ�(�ڵ鷯��ġ);
      bt.addActionListener(this);
   }//������
   
   @Override
   public void actionPerformed(ActionEvent e) {//�̺�Ʈ �ڵ鷯(ó����)
	  cnt++;
     //�߰����� ��� ����!!
	  System.out.println("�ȳ�~!!");
	  setTitle("�̺�Ʈ�׽�Ʈ-"+cnt);
	  
	  //���α׷�����
	  System.exit(0);//����:   �ý��ۿ��� ���������� ���Ḧ �ϰڴٰ� �˸�   
	                 //0,���:  �ý��ۿ��� �������� ���Ḧ �ϰڴٰ� �˸�
	   
   }
   
   
   public static void main(String[] args) {
	  new EventTest();
   }

}
