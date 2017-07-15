package javaStudy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendar {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		char[] day_of_week = {'日','一','二','三','四','五','六'};
		for(int i=2017;i<=2030;i++){
			gc.set(i,Calendar.JULY, 20);
			int d = gc.get(Calendar.DAY_OF_WEEK);
			System.out.println(i+"年的星期"+day_of_week[d-1]);
		}
		
		
		
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH));
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.HOUR_OF_DAY));
	}

}
