package Ftesting;

enum WeekDay{
	Monday(1),Sunday(0),Thursday(4);
	private String name;
	WeekDay(int index){
		switch(index){
			case 1:
				name="����һ";
			case 0:
				name="������";
			case 4:
				name="������";
		}
	}
	void dayname(){
		System.out.println(name);
	}
}

public class Today{
	public static void main(String args[]){
		WeekDay today = WeekDay.Thursday;
		today.dayname();
	}
}