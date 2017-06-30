package Ftesting;

class R{
	int x;
	R(int x){
		this.x = x;
		System.out.println("R constructor");
	}
	void ab(){
		System.out.println("R.x="+this.x);
	}
}

class T extends R{
	int x;
	T(int x, int y){
		super(x);
		this.x = y;
		System.out.println("T constructor");
	}
	void ab(){
		System.out.println("T.x="+this.x);
	}
	void superx(){
		System.out.println("R.x="+super.x);
	}
}

class TestRT{
	public static void main(String[] args){
//		R a = new R();
//		a.ab();
		T b = new T(10,20);
		b.ab();
		b.superx();
	}
}