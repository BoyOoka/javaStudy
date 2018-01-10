package javaStudy;
/*
 * 创建一个父学生类，再创建一个继承的子学生类。
 * 创建一个父学生类的对象句柄，用其指向子学生类的对象。
 * 最后将使用这个对象句柄来引用父类中没有的方法。
 */
public class 多态 {

	public static void main(String[] args) {
		studentclass sc = new studentclass();
		studentmen sm = new studentmen();
		studentclass sc1 = new studentmen();//只能操作父类中有而被子类覆盖的方法
		sc.set("王浩", "1", "男");
		sc.set(90);
		sm.set("张杰", "2", "男");
		sm.set(99.1);
		sm.set("班长");
		System.out.println(sc.toString());
		System.out.println(sm.toString());
		sc1.set("赵丽", "3", "女");
		sc1.set(99.7);
		System.out.println(sc1.toString());
	}

}
class studentclass{
//	创建成员变量
	String name;
	String code;
	String sexy;
	double achievement;
	public void set(String name,String code,String sexy){
		this.name = name;
		this.code = code;
		this.sexy = sexy;
	}
//	关于set的多态
	public void set(double achivement){
		this.achievement = achivement;
	}
	public String getname(){
		return name;
	}
	public String getcode(){
		return code;
	}
	public String getsexy(){
		return sexy;
	}
	public double getachi(){
		return achievement;
	}
	@Override
	public String toString(){
		String info = "学生姓名:"+name
				+ " "
				+ "学号："+code
				+ " "
				+ "性别："+sexy
				+ " "
				+ "成绩："+ achievement;
		return info;
				
	}
}
class studentmen extends studentclass{
	String a;
	public void set(String a){
		this.a = a;
	}
	@Override
	public String toString(){
		String info = "学生姓名:"+name
				+ " "
				+ "学号："+code
				+ " "
				+ "性别："+sexy
				+ " "
				+ "成绩："+ achievement
				+"职位："+a;
		return info;
	}
}
