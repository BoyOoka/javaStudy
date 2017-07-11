package javaStudy;

import java.util.Vector;

public class 泛型2 {
	public static void main(String[] args){
		Vector<Object> v = new Vector<Object>();
		radomMeth r = new radomMeth(v);
	}

	
}

class radomMeth{
	/*
	 * 任何对象的基本类都是object类型
	 */
	public radomMeth(Vector<Object> vector){
		vector.add(124);
		vector.add("24afgb");
		for(Object v : vector){
			System.out.println(v);
		}
	}
}