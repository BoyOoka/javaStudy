package Ftesting;

class P{
	int x,y=20,z;
	P(int X){
		x = X;
	}
	void show(){
		System.out.println("P.x="+x);
	}
}

class TestP{
	public static void main(String args[]){
		P a = new P(10);
		a.show();
		System.out.println(a.z);
		System.out.println(a.y);
	}
}