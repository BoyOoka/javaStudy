package javaStudy;

public class student {
//	创建成员变量
	 public String name;
	 public String code;
	 public String sex;
	 public String birthday;
	 public String address;
	public void setInfo(String name,String code, String sex,String birthday, String address){
		this.name = name;
		this.code = code;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		}
	 public String tostring(){
		String info = name+" "+code+" "+sex+" "+birthday+" "+address;
		return info;
	}
	 public void setCourse(String[] course){
		 new course(course);
	 }
	 private class course{	//内部类
			private String[] courses;
			private int courseNum;
			public course(String[] course){
				courses = course;
				courseNum = courses.length;
				getinfo();
			}
			private void get(){
				for(int i=0;i<courses.length;i++){
					System.out.print(courses[i]+" ");
				}
			}
			public void getinfo(){
				System.out.println("姓名:"+student.this.name+" 学号:"+student.this.code+" 选择了:"
			+courseNum+"门课"
			+"分别是：");
				get();
			}
	 }
}