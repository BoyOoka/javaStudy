package javaStudy;

import java.util.Calendar;
import java.util.Date;

public class apiTest {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		int max = Math.max(3, 5);
		double pi = Math.PI;
		double abs = Math.abs(-32.1);//绝对值
		double hypot = Math.hypot(3, 4);
		System.out.println(time+" "+max);
		System.out.println(pi);
		System.out.println(abs);
		System.out.println(hypot);
		System.out.println(new Date());
		Date d =new Date();
		System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
		Calendar c =Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.getTimeZone());
		System.out.println(c.getTime());
		System.out.println(c.getCalendarType());
		System.out.println(c.getFirstDayOfWeek());
		System.out.println(c.get(2));
		System.out.println(c.getTime().getHours());
	}

}
