package Ftesting;

//final class H{
class H{
	final int x=10;
	final int y;
	int z;
	H(int a){
//		x=a;
		y=a;
		z=a;
	}
	final void plus(){
//		y++;
		z++;
	}
}

class J extends H{
	J(int b){
		super(b);
	}
/*
	final void plus(){
		z+=2;
	}
*/
}

class TestHJ{
	public static void main(String[] args){
		J b = new J(20);
		b.plus();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
	}
}