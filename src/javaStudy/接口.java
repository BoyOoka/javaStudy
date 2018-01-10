package javaStudy;

public class 接口 implements school{
	String schoolname;
	String classname;
	String name, sex;
	@Override
	public String getschoolname(){
		return schoolname;
	}
	@Override
	public String getclassname() {
		return classname;
	}
	@Override
	public String getname() {
		return name;
	}
	@Override
	public String getsex() {
		// TODO Auto-generated method stub
		return sex;
	}
	 void set(String schoolname,String classname,String name,String sex){
		this.schoolname = schoolname;
		this.classname = classname;
		this.name = name;
		this.sex =sex;
	}
	@Override
	public String toString(){
		String info = "校名:"
				+ getschoolname()
				+" 班级:"+getclassname()+" 姓名:"+getname()+" 性别:"+getsex();
		return info;
	}
	public static void main(String[] args){
		接口 s = new 接口();
		s.set("一校","一班","小明","男");
		System.out.println(s.toString());
	}
}
