package javaStudy;

public class enumTest{
	public static void main(String[] args){
		WeekDay2 today = WeekDay2.星期一;
		WeekDay2[] day = WeekDay2.values();
		System.out.println(today);
		System.out.println(today.ordinal());
		System.out.println(day.length);
		for(WeekDay2 d : day){
			System.out.print(d+" ");
		}
	}
}
 enum WeekDay2{
	星期一,星期二,星期三,星期四,星期五,星期六,星期日
}