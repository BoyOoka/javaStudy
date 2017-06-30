package Ftesting;

class K{
	int x;
	K(int x){
		this.x = x;
		System.out.println("K constructor");
	}	
	static{
		System.out.println("K static");
	}
	void show(){
		System.out.println("my x="+this.x);
	}
}

class L extends K{
	int x;
	L(int x1, int x2){
		super(x1);
		this.x = x2;
		System.out.println("L constructor");
	}	
	static{
		System.out.println("L static");
	}
	void show(){
		System.out.println("my x="+this.x+", my father's x="+super.x);
	}
}

class TestKL{
	public static void main(String[] args){
		L y1 = new L(10,20);
		y1.show();
		K y2 = new L(30,40);
		y2.show();
	}
}