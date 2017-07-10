package javaStudy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class 反射 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException{
		String s1 = "1234";
		/*
		 * 获取关于s1和String类的字节码
		 */
		Class c1 = s1.getClass();
		Class c2 = String.class;
		Class c3 = Class.forName("java.lang.String");
		System.out.println(c2);
		System.out.println(c1);
		System.out.println(c3);
//		-----------------------------------
		Constructor cs1 = testForf.class.getConstructor();
		testForf t = new testForf();
		t.testForf(3, 4);
		System.out.println(t.toString());
		Field f = t.getClass().getField("j");
		System.out.println(f.get(t));
	}
}
