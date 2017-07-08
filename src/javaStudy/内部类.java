package javaStudy;
//import javaStudy.student; 内部类在这个class里
public class 内部类 {
	public static void main(String[] args){
		student st = new student();
		st.setInfo("小小", "123456", "女", "0709", "篱笆路18号");
		String[] cour = {"语文","数学","生物","地理","音乐","体育","美术"};
//		System.out.println(st.tostring());
		st.setCourse(cour);
	}
}
