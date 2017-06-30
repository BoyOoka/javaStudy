package Ftesting;

class A{
	int x;
	A(int x){
		this.x = x;
		System.out.println("A constructor");
	}	
	static{
		System.out.println("A static");
	}
}

class TestA{
	public static void main(String[] args){
		A a = new A(10);
		System.out.println(a.x);
	}
}