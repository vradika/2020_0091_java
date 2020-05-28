package com.ict.java03;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		// Calender 는 new로 객체 새엇응ㄹ 하지 않는다.
		Calendar cal = Calendar.getInstance();
		
		System.out.print(cal.get(Calendar.YEAR) + "\t");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "\t");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH)+ "\t");
		System.out.print(cal.get(Calendar.HOUR_OF_DAY));
		/*System.out.println(cal.get(Calendar.HOUR)+ "\t");
		int res = cal.get(Calendar.AM_PM);
		if (res == 0) {
			System.out.println("오전: " + cal.get(Calendar.HOUR));
		} else if (res == 1) {
			System.out.println("오후: " + cal.get(Calendar.HOUR));
		}*/
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		// 요일 : 주일(1) ~ 토요일(7)
		int result = cal.get(Calendar.DAY_OF_WEEK);
		switch (result) {
		case 1 : System.out.println("주일"); break;
		case 2 : System.out.println("월요일"); break;
		case 3 : System.out.println("화요일"); break;
		case 4 : System.out.println("수요일"); break;
		case 5 : System.out.println("목요일"); break;
		case 6 : System.out.println("금요일"); break;
		case 7 : System.out.println("토요일"); break;
 
		default:
			break;
		}
	}
}
		
