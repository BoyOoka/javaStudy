package javaStudy;

public class 带抽象方法的enum {
	public static void main(String[] args){
		WeekDay4 today = WeekDay4.FRT;
		System.out.println(today.nextDay());
		System.out.println(WeekDay4.MON.nextDay());
		System.out.println(today);
	}
}
enum WeekDay4{
	
	SUN{
		@Override
		public WeekDay4 nextDay() {
			return MON;
		}
	},
	MON{
			@Override
			public WeekDay4 nextDay(){
				return TUE;
			}
		},
	TUE{
		@Override
		public WeekDay4 nextDay() {
			return WED;
		}
		},
	WED{
		@Override
		public WeekDay4 nextDay() {
			return THU;
			}
		},
	THU{
		@Override
		public WeekDay4 nextDay() {
			// TODO Auto-generated method stub
			return FRT;
		}
		},
	FRT{

		@Override
		public WeekDay4 nextDay() {
			return SAT;
		}
			
		},
	SAT{
		@Override
		public WeekDay4 nextDay() {
			return SUN;
		}
		};
	
	public abstract WeekDay4 nextDay();
	}
