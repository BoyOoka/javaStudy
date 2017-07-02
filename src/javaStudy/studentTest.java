package javaStudy;

public class studentTest {
	String name = "";
	double grade;
	String sex = "";
	int age;
	public studentTest(String name){
		this.name = name;
	}
	public void set(String name,double grade,String sex,int age){
		this.name  = name;
		this.grade = grade;
		this.sex = sex;
		this.age = age;
	}
	public String print(){
		String info = "姓名："+name+",成绩:"+grade;
		return info;
	}
	
	public static void main(String[] args) {
		studentTest str1 = new studentTest("王一");
		studentTest str2 = new studentTest("王二");
		studentTest str3 = new studentTest("王三");
		studentTest str4 = new studentTest("王四");
		studentTest str5 = new studentTest("王五");
		studentTest str6 = new studentTest("王六");
		str1.set("王一", 58.3, "男", 21);
		str2.set("王二", 91.3, "女", 21);
		str3.set("王三", 91, "男", 21);
		str4.set("王四", 58.25, "女", 21);
		str5.set("王五", 99, "男", 21);
		str6.set("王六", 86.2, "女", 21);
		studentTest[] student ={str1,str2,str3,str4,str5,str6};
		for(studentTest s : student){
			System.out.println(s.print());
		}
		for(int i=0;i<student.length;i++){
			for(int j=i+1;j<student.length;j++){
				if(student[i].grade>student[j].grade){
					studentTest temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
			}
		}
		/*
		for(int i=0;i<student.length;i++){
			for(int j=0;j<student.length;j++){
				if(student[i].grade==student[j].grade){
					student[i].name = student[i].name+","+student[j].name;
				}
			}
		}*/
		System.out.println("最高分数"+student[5].print());
		System.out.println("最低分数"+student[0].print());
	}

}
