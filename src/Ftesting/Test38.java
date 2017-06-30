package Ftesting;

class W{
	private int x=1;
	int y=2;
	void ab(){
		System.out.println("W.x="+x);
	}
}

class E extends W{
	void ab(){
		System.out.println("E.y="+y);
	}
}

class TestWE{
	public static void main(String args[]){
		W a = new E();
		a.ab();
	}
}