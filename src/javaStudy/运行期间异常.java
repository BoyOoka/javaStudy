package javaStudy;

public class 运行期间异常 {

	public static void main(String[] args) {
		threeMethod();
	}
	static void oneMethod(){
		System.out.println(1);
		throw new RuntimeException("from oneMethod");
	}
	static void twoMethod(){
		oneMethod();
	}
	static void threeMethod(){
		twoMethod();
	}

}
