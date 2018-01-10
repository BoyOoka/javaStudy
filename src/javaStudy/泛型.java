package javaStudy;

import java.lang.reflect.InvocationTargetException;
import java.util.Vector;

public class 泛型 {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		/*
		 * 泛型保证添加到集合里的是同一类元素
		 */
		Vector<Studentf> v = new Vector<Studentf>();
		Studentf s1 = new Studentf(1);
		Studentf s2 = new Studentf(9);
		Studentf s3 = new Studentf(45);
		Studentf s4 = new Studentf(67);
		Integer t = new Integer(10);
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		/*
		 * 通过反射可以往集合添加其他元素
		 */
		v.getClass().getMethod("add", Object.class).invoke(v, "abc");
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
//		v.add(t);无法添加
//		for(Studentf i : v){
//			System.out.println(i);
//		}
	
	}
}


class Studentf{
	private int stuNum;
	public Studentf(int stuNum){
		this.stuNum = stuNum;
	}
	@Override
	public String toString(){
		return " "+this.stuNum;
	}
}
