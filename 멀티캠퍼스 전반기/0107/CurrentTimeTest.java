package com.mulcam.j0107;

import java.util.Calendar;

public class CurrentTimeTest {
	
	public static void main(String[] args) {
		//ȭ�����)  2019�� 1�� 7�� 15�� 28�� 32��
		
		Calendar cal = Calendar.getInstance() ;
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//1��~12�� : 0~11
		int date = cal.get(Calendar.DATE);
		//int h = cal.get(Calendar.HOUR);//12�ð�ǥ��
		int h = cal.get(Calendar.HOUR_OF_DAY );//24�ð�ǥ��
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		int day = cal.get(Calendar.DAY_OF_WEEK);//����
		System.out.println("����:"+day);//�Ͽ���~�����(1~7)
		System.out.println(year+"�� "+month+"�� "+date+"�� "+
				         h+"�� "+m+"�� "+s+"��");
		
		
	}//main

}



