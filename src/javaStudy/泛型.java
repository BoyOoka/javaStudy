package javaStudy;

import java.util.Vector;

public class 泛型 {
	public static void main(String[] args){
		/*
		 * 泛型保证添加到集合里的是同一类元素
		 */
		Vector<Studentf> v = new Vector<Studentf>();
		Studentf s1 = new Studentf(1);
		Studentf s2 = new Studentf(9);
		Studentf s3 = new Studentf(45);
		Studentf s4 = new Studentf(67);
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		for(Studentf i : v){
			System.out.println(i);
		}
	}
}
class Studentf{
	private int stuNum;
	public Studentf(int stuNum){
		this.stuNum = stuNum;
	}
	public String toString(){
		return " "+this.stuNum;
	}
}