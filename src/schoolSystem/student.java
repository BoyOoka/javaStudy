package schoolSystem;

public class student {
	//创建学生属性
	private String name;
	private String code;
	private String sexy;
	private String birthday;
	private String address;
	private String age;
	private String grade;
	private String major;
	//构造函数
	student(String name,String code){
		this.name = name;
		this.code = code;
	}
	//设置属性getter和setter方法
	public String getname(){
		return name;
	}
	public String getcode(){
		return code;
	}
	public String sexy(){
		return sexy;
	}
	public String getbirthday(){
		return birthday;
	}
	public String getage(){
		return age;
	}
	
	public String getaddress(){
		return address;
	}
	public String getgrade(){
		return grade;
	}
	public String getmajor(){
		return major;
	}
	public String getsexy(){
		return sexy;
	}
	public void setsexy(String sexy){
		this.sexy = sexy;
	}
	public void setbirthdy(String birthday){
		this.birthday = birthday;
	}
	public void setaddress(String address){
		this.address = address;
	}
	public void setmajor(String major){
		this.major = major;
	}
	public void setage(String age) {
		this.age = age;
	}
	public void setgrade(String grade) {
		this.grade= grade;
	}
	public String toString(){
		String information = "学生姓名："+name+"学号："+code+"年龄："+age+"出生年月："+birthday+"家庭住址："+address
				+"班级："+grade+"专业："+major;
		return information;		
	}

}
