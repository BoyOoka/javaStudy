package javaStudy;

public class 带构造函数的Enum {
	public static void main(String[] args){
	WeekDay3 today = WeekDay3.SUN;
	System.out.println(WeekDay3.FRI);
	}
}
enum WeekDay3{
	SUN,MON,WED,THU,TUE,FRI("星期五"),SAT();
	private WeekDay3(){
		System.out.println("无参数的构造函数");
	}
	private WeekDay3(String s){
		System.out.println("有参数的构造函数");
		System.out.println(s);
	}
}