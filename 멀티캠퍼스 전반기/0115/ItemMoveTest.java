package com.mulcam.j0115;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ItemMoveTest extends JFrame implements ActionListener{
  JList<String> leftList, rightList;
  JTextField leftTf, rightTf;
  JButton bt_r, bt_r_all, bt_l, bt_l_all;
	
  JPanel leftp,centerp,rightp;
  
  Vector<String> v1,v2;
  JScrollPane scroll1,scroll2; 
  //��ũ�ѹٰ� ���� �г�(JList, JTextArea, JTable��� �Բ� ���� ���)
  
  
  public ItemMoveTest() {
	  
	  
	 v1 = new Vector<String>(); 
	 v2 = new Vector<String>(); 
	  
	 //������Ʈ�� ��ɺο�!! -----> �̺�Ʈ ó��
	 //�̺�Ʈ �ҽ�? tf 2, bt 2  : DataType ---> JButton, JTextField
	 // ---> �޼ҵ� add~Listener() ã��
	 //           addActionListener()  : HINT 
	  
	  
	 leftList = new JList<String>();
	 rightList = new JList<String>();
	 
	 scroll1 = new JScrollPane(leftList);//��ũ�ѹٰ� �����Ǵ� JList !!
	 scroll2 = new JScrollPane(rightList);//��ũ�ѹٰ� �����Ǵ� JList !!
	
	 leftTf = new JTextField();
	 rightTf = new JTextField();
	 
	 //bt_r = new JButton(">");
	 bt_r = new JButton("��");
	 //bt_r_all = new JButton(">>");
	 bt_r_all = new JButton("��");
	 bt_l = new JButton("��");
	 bt_l_all = new JButton("��");
	 
	 leftp = new JPanel();
	  leftp.setLayout(new BorderLayout());
	  leftp.add("Center", scroll1);//leftList);
	  leftp.add("South", leftTf );
	 
	 rightp = new JPanel();
	  rightp.setLayout(new BorderLayout());
	  rightp.add("Center", scroll2);//rightList);
	  rightp.add("South", rightTf );
	  
	 centerp = new JPanel();
	  centerp.setBackground(Color.orange);
	  centerp.setLayout(null);//new GridLayout(6,3,0,10));
	  //Null���̾ƿ�  : �����̳ʿ� x,y��ǥ�� ���� ������Ʈ�� ���� �� ���.
	  //����) �� ������Ʈ�� ��ǥ(x,y)�� �Բ� ���μ��� ���̵� ������ ��.
	  
	  //bt_r.setLocation(int x, int y);
	  //bt_r.setSize(int width, int height);
	  
	  //bt_r.setBounds(x, y, width, height);
	  bt_r.setBounds    (55,50,50,30);
	  bt_r_all.setBounds(55,100,50,30);
	  bt_l.setBounds    (55,150,50,30);
	  bt_l_all.setBounds(55,200,50,30);
	  
	  centerp.add(bt_r);
	  centerp.add(bt_r_all);
	  centerp.add(bt_l);
	  centerp.add(bt_l_all);
	  
//	  centerp.add(new JLabel());centerp.add(new JLabel());centerp.add(new JLabel());
//	  centerp.add(new JLabel());centerp.add(bt_r);centerp.add(new JLabel());
//	  centerp.add(new JLabel());centerp.add(bt_r_all);centerp.add(new JLabel());
//	  centerp.add(new JLabel());centerp.add(bt_l);centerp.add(new JLabel());
//	  centerp.add(new JLabel());centerp.add(bt_l_all);centerp.add(new JLabel());
//	  //centerp.add(new JLabel());centerp.add(new JLabel());centerp.add(new JLabel());
	 
	 setTitle("ItemMove");
	 setLayout(new GridLayout(1,3));
	 add(leftp);
	 add(centerp);
	 add(rightp);
	 
	 //setSize(500,300);
	 setBounds(200,300, 500,300);
	        //  x   y   ����  ����
	 setVisible(true);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	 
	 eventUp();
  }//������
  
  private void eventUp() {//����� ���� �޼ҵ� : �̺�Ʈ �ҽ� ���!!
	 //�ҽ���.add~Listener(�ڵ鷯 ��ġ);
	  
	  //�ؽ�Ʈ�ʵ忡�� ���Ͱ� �ԷµǾ����� actionPerformed()ȣ��
	  leftTf.addActionListener(this);
	  rightTf.addActionListener(this);
	  
	  //��ư�� �������� actionPerformed()ȣ��
	  bt_r.addActionListener(this); 
	  bt_r_all.addActionListener(this); 
	  bt_l.addActionListener(this); 
	  bt_l_all.addActionListener(this);
	  
	  
  }
  
/*
 java.awt.List  list    list.add("ȫ");list.add("��");list.add("��");
    "ȫ�浿"  0
    "�����"  1
    "���ֿ�"  2
        
 list.remove(1);  �Ǵ� list.remove("�����");
 --------------------------------------------------------------
    
 javax.swing.JList  list   ===>���� ��!!
 Vector v = new Vector();  v.add("ȫ");v.add("��");v.add("��");
       ===> ���� ��(������ �Ǵ� ���)!!
 
 list.setListData(v);  ----> ���� ������Ʈ�� MVC�� �����!!
    "ȫ�浿"  0
    "�����"  1
    "���ֿ�"  2
        
 v.remove(1);  �Ǵ� v.remove("�����");
 list.setListData(v);  ----> ������ �����͸� ���� Vector�� JList�� ��ݿ�. 
 
*/
  
  
  @Override
  public void actionPerformed(ActionEvent e) {//�̺�Ʈ �ڵ鷯
      System.out.println("action!!");
      //ActionEvent e : �̺�Ʈ �ҽ��� ������ ���� �� �ִ�!!
      Object ob = e.getSource(); 
      
      if(ob==leftTf) {//actionPerformed()�޼ҵ带 ȣ���� �ҽ��� leftTf���
    	//1. ������ ���     2. ������ ����   3. ���������� ����
    	 String str = leftTf.getText().trim();//1.
    	                             //------
    	                        //���ڿ� ���ʿ� ���ӵ� ������ ���� 
    	 
    	 if(str.length()==0) {//str�� �����̶��  str.equals("")
           JOptionPane.showMessageDialog(this, "�������� �Է�!!");    		 
    		 return;
    	 }
    	 
    	 v1.add(str);
    	 leftList.setListData(v1);//2.
    	 
    	 leftTf.setText("");
    	  
      }else if(ob==rightTf) {
    	 String str = rightTf.getText();//1.
     	 v2.add(str);
     	 rightList.setListData(v2);//2.
     	 
     	 rightTf.setText(""); //3.
    	  
    	  
      }else if(ob==bt_r) {
    	 int idx = leftList.getSelectedIndex();//0 1 2
    	 //leftList.getSelectedValue();//"ȫ�浿" "�����" "���ֿ�"
    	 //���� JList�� ���õ� �������� ���ٸ� idx=-1
    	 
    	 if(idx==-1) {
    		//JOptionPane.showMessageDialog(Component parentComponent,
    		//		                      String message);
    		 JOptionPane.showMessageDialog(this, "�������� ����!!");
    		 return;
    	 }
    	 
    	 String str = v1.get(idx);
    	 
    	 v2.add(str);    
    	 v1.remove(idx);
    	 
    	 //������ ���Ϳ� �߰�, ���� ���Ϳ� ������  ������ ������ JList�� �ݿ�
    	 leftList.setListData(v1);
    	 rightList.setListData(v2);
    	  
      }else if(ob==bt_r_all) {
    	//����(Vector)�� ��� �����͸� ������(Vector)�� �̵�
    	  
    	 for( String str : v1) {
    		v2.add(str); 
    	 }
    	 
    	 v1.clear();
    	  
    	//������ ����, ���� ���Ϳ� �����  ������ ������ JList�� �ݿ�
    	 leftList.setListData(v1);
    	 rightList.setListData(v2);
    	 
    	 
      }else if(ob==bt_l) {
    	 int idx = rightList.getSelectedIndex();//0 1 2
     	 //leftList.getSelectedValue();//"ȫ�浿" "�����" "���ֿ�"
     	 String str = v2.get(idx);
     	 
     	 v1.add(str);    
     	 v2.remove(idx);
     	 
     	 //������ ���Ϳ� �߰�, ���� ���Ϳ� ������  ������ ������ JList�� �ݿ�
     	 leftList.setListData(v1);
     	 rightList.setListData(v2); 
    	  
      }else if(ob==bt_l_all) {
    	 for( String str : v2) {
      		v1.add(str); 
      	 }
      	 
      	 v2.clear();
      	  
      	//������ ����, ���� ���Ϳ� �����  ������ ������ JList�� �ݿ�
      	 leftList.setListData(v1);
      	 rightList.setListData(v2);
      }
      
	  
  }
  
  
  public static void main(String[] args) {
	new ItemMoveTest();
  }

}






