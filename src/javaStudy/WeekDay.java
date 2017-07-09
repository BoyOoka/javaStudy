package javaStudy;

public class WeekDay{
	private void WeekDay(){
	}
	/*
	 * 定义静态常量
	 */
	public final static WeekDay SUN = new WeekDay();
	public final static WeekDay MON = new WeekDay();
	public final static WeekDay TUE = new WeekDay();
	public final static WeekDay WED = new WeekDay();
	public final static WeekDay THU = new WeekDay();
	public final static WeekDay FN = new WeekDay();
	public final static WeekDay SAT = new WeekDay();
	public WeekDay nextDay(){
		if(this == SUN){return MON;}
		else if(this == MON){return TUE;}
		else if(this == TUE){return WED;}
		else if(this == WED){return THU;}
		else if(this == THU){return FN;}
		else if(this == FN){return SAT;}
		else return SUN;
	}
	public String toString(){
		if(this == SUN){return "星期日";}
		else if(this == MON){return "星期一";}
		else if(this == TUE){return "星期二";}
		else if(this == WED){return "星期三";}
		else if(this == THU){return "星期四";}
		else if(this == FN){return "星期五";}
		else return "星期六";
	}
	
//	public enum WeekDay1{
//		SUN,MON,WED,THU,TUE,FN,SAT
//	}
//	public WeekDay1 nextDay(WeekDay1 i){
//		switch(i){
//			case SUN: return WeekDay1.MON; 
//			case MON: return WeekDay1.TUE; 
//			case TUE: return WeekDay1.WED; 
//			case WED: return WeekDay1.THU; 
//			case THU: return WeekDay1.FN; 
//			case SAT: return WeekDay1.SUN; 
//			default : return null;
//		}
//	}
	public static void main(String[] args){
//		WeekDay w = new WeekDay();
//		System.out.println(w.nextDay(WeekDay1.MON));
		WeekDay today = WeekDay.MON;
		System.out.println(today.nextDay());
		System.out.println(today.toString());
	}
}
