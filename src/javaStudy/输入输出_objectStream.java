package javaStudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class 输入输出_objectStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("/Users/gaya/Downloads/test/输入输出7.txt");
		/*
		 * 写入属性
		 */
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		studentO st = new studentO();
		st.name="小明";
		st.age = 19;
		st.sex = "男";
		st.address = "四川";
		oos.writeObject(st);
		oos.close();
		/*
		 * 读取属性
		 */
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		studentO st1 = new studentO();
		st1 = (studentO) ois.readObject();
		ois.close();
		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st1.sex);
		System.out.println(st1.address);
		
	}
}
class studentO implements Serializable{
	String name;
	int age;
	String sex;
	String address;
}