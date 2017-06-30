package Ftesting;

class Y{
	B b;
	int x;
}

class B{
	int y=10;
}

class TestYB{
	public static void main(String[] args){
		Y a = new Y();
		B b = new B();
		a.b = b;
		System.out.println(a.b.y);
	}
}