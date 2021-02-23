package com.mulcam.j0107;

import java.util.Calendar;

public class CurrentTimeTest {
	
	public static void main(String[] args) {
		//화면출력)  2019년 1월 7일 15시 28분 32초
		
		Calendar cal = Calendar.getInstance() ;
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//1월~12월 : 0~11
		int date = cal.get(Calendar.DATE);
		//int h = cal.get(Calendar.HOUR);//12시간표현
		int h = cal.get(Calendar.HOUR_OF_DAY );//24시간표현
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		int day = cal.get(Calendar.DAY_OF_WEEK);//요일
		System.out.println("요일:"+day);//일요일~토요일(1~7)
		System.out.println(year+"년 "+month+"월 "+date+"일 "+
				         h+"시 "+m+"분 "+s+"초");
		
		
	}//main

}



