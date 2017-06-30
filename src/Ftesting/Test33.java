package Ftesting;

class Z{
	static int x=10;
	int y=1;
}

class X{
	public static void main(String arg[]){
		System.out.println(Z.x);
		Z a1 = new Z();
		System.out.println(a1.x);
		Z a2 = new Z();
		System.out.println(a2.x);
		a2.x=20;
		System.out.println(a1.x);
		System.out.println(Z.x);
		System.out.println("----------------------");
		System.out.println(a1.y);
		System.out.println(a2.y);
		a2.y=2;
		System.out.println(a1.y);
		System.out.println(a2.y);
	}
}