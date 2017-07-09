package javaStudy;

public class 抽象类 {
	public static void main(String[] args){
		flower1 f1 = new flower1();
		f1.setColor("蓝色");
		f1.setName("牡丹");
		f1.setCountry("日本");
		f1.setCity("东京");
		System.out.println(f1.getinfo());
	}
}
/*
 * 花的接口
 */
interface flower{
	public void setColor(String color);
	public void setName(String Name);
	public String getColor();
	public String getName();
	
}
/*
 * 接口实现
 */
class flowers implements flower{ 
	String Color1;
	String Name1;
	@Override
	public void setColor(String color) {
		this.Color1 = color;
	}

	@Override
	public void setName(String Name) {
		this.Name1 = Name;
	}

	@Override
	public String getColor() {
		return Color1;
	}

	@Override
	public String getName() {
		return Name1;
	}
	String getinfo(){
		String info = "花的姓名："+Name1+" 画的颜色："+Color1;
		return info;
	}
}
/*
 * 新花的继承
 */
	class flower1 extends flowers{
		String Country;
		String City;
		public void setCountry(String Country){
			this.Country = Country;
		}
		public void setCity(String City){
			this.City = City;
		}
		public String getCountry(){
			return Country;
		}
		public String getCity(){
			return City;
		}
		String getinfo(){
			String info = super.getinfo()+" 花的国家："+Country+" 花的城市："+City;
			return info;
		}
	}
	
