package javaStudy;

public class testForf {
	public int i;
	public int j;
	public int testForf(int i,int j){
		this.i = i;
		this.j = j;
		return i+j;
	}
	public String toString(){
		return String.valueOf(testForf(i, j));
	}
}
