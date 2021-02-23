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
  //스크롤바가 붙은 패널(JList, JTextArea, JTable등에서 함께 많이 사용)
  
  
  public ItemMoveTest() {
	  
	  
	 v1 = new Vector<String>(); 
	 v2 = new Vector<String>(); 
	  
	 //컴포넌트에 기능부여!! -----> 이벤트 처리
	 //이벤트 소스? tf 2, bt 2  : DataType ---> JButton, JTextField
	 // ---> 메소드 add~Listener() 찾기
	 //           addActionListener()  : HINT 
	  
	  
	 leftList = new JList<String>();
	 rightList = new JList<String>();
	 
	 scroll1 = new JScrollPane(leftList);//스크롤바가 지원되는 JList !!
	 scroll2 = new JScrollPane(rightList);//스크롤바가 지원되는 JList !!
	
	 leftTf = new JTextField();
	 rightTf = new JTextField();
	 
	 //bt_r = new JButton(">");
	 bt_r = new JButton("▷");
	 //bt_r_all = new JButton(">>");
	 bt_r_all = new JButton("▶");
	 bt_l = new JButton("◁");
	 bt_l_all = new JButton("◀");
	 
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
	  //Null레이아웃  : 컨테이너에 x,y좌표를 통해 컴포넌트를 붙일 때 사용.
	  //주의) 각 컴포넌트는 좌표(x,y)와 함께 가로세로 길이도 가져야 함.
	  
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
	        //  x   y   가로  세로
	 setVisible(true);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	 
	 eventUp();
  }//생성자
  
  private void eventUp() {//사용자 정의 메소드 : 이벤트 소스 등록!!
	 //소스명.add~Listener(핸들러 위치);
	  
	  //텍스트필드에서 엔터가 입력되었을때 actionPerformed()호출
	  leftTf.addActionListener(this);
	  rightTf.addActionListener(this);
	  
	  //버튼을 눌렀을때 actionPerformed()호출
	  bt_r.addActionListener(this); 
	  bt_r_all.addActionListener(this); 
	  bt_l.addActionListener(this); 
	  bt_l_all.addActionListener(this);
	  
	  
  }
  
/*
 java.awt.List  list    list.add("홍");list.add("길");list.add("김");
    "홍길동"  0
    "길라임"  1
    "김주원"  2
        
 list.remove(1);  또는 list.remove("길라임");
 --------------------------------------------------------------
    
 javax.swing.JList  list   ===>나는 뷰!!
 Vector v = new Vector();  v.add("홍");v.add("길");v.add("김");
       ===> 나는 모델(데이터 또는 기능)!!
 
 list.setListData(v);  ----> 스윙 컴포넌트는 MVC로 설계됨!!
    "홍길동"  0
    "길라임"  1
    "김주원"  2
        
 v.remove(1);  또는 v.remove("길라임");
 list.setListData(v);  ----> 삭제된 데이터를 가진 Vector를 JList에 재반영. 
 
*/
  
  
  @Override
  public void actionPerformed(ActionEvent e) {//이벤트 핸들러
      System.out.println("action!!");
      //ActionEvent e : 이벤트 소스의 정보를 얻어올 수 있다!!
      Object ob = e.getSource(); 
      
      if(ob==leftTf) {//actionPerformed()메소드를 호출한 소스가 leftTf라면
    	//1. 데이터 얻기     2. 데이터 복사   3. 원본데이터 삭제
    	 String str = leftTf.getText().trim();//1.
    	                             //------
    	                        //문자열 양쪽에 연속된 공백을 제거 
    	 
    	 if(str.length()==0) {//str이 공백이라면  str.equals("")
           JOptionPane.showMessageDialog(this, "아이템을 입력!!");    		 
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
    	 //leftList.getSelectedValue();//"홍길동" "길라임" "김주원"
    	 //만약 JList에 선택된 아이템이 없다면 idx=-1
    	 
    	 if(idx==-1) {
    		//JOptionPane.showMessageDialog(Component parentComponent,
    		//		                      String message);
    		 JOptionPane.showMessageDialog(this, "아이템을 선택!!");
    		 return;
    	 }
    	 
    	 String str = v1.get(idx);
    	 
    	 v2.add(str);    
    	 v1.remove(idx);
    	 
    	 //오른쪽 벡터에 추가, 왼쪽 벡터에 삭제된  내용을 각각의 JList에 반영
    	 leftList.setListData(v1);
    	 rightList.setListData(v2);
    	  
      }else if(ob==bt_r_all) {
    	//왼쪽(Vector)의 모든 데이터를 오른쪽(Vector)에 이동
    	  
    	 for( String str : v1) {
    		v2.add(str); 
    	 }
    	 
    	 v1.clear();
    	  
    	//오른쪽 벡터, 왼쪽 벡터에 변경된  내용을 각각의 JList에 반영
    	 leftList.setListData(v1);
    	 rightList.setListData(v2);
    	 
    	 
      }else if(ob==bt_l) {
    	 int idx = rightList.getSelectedIndex();//0 1 2
     	 //leftList.getSelectedValue();//"홍길동" "길라임" "김주원"
     	 String str = v2.get(idx);
     	 
     	 v1.add(str);    
     	 v2.remove(idx);
     	 
     	 //오른쪽 벡터에 추가, 왼쪽 벡터에 삭제된  내용을 각각의 JList에 반영
     	 leftList.setListData(v1);
     	 rightList.setListData(v2); 
    	  
      }else if(ob==bt_l_all) {
    	 for( String str : v2) {
      		v1.add(str); 
      	 }
      	 
      	 v2.clear();
      	  
      	//오른쪽 벡터, 왼쪽 벡터에 변경된  내용을 각각의 JList에 반영
      	 leftList.setListData(v1);
      	 rightList.setListData(v2);
      }
      
	  
  }
  
  
  public static void main(String[] args) {
	new ItemMoveTest();
  }

}






