package Ftesting;

class C{
	void ab(){
		System.out.println("C");
	}
}

class D extends C{
	@Override
	void ab(){
		System.out.println("D");
	}
//	@Override
	void ab(int x){
		System.out.println(x);
	}
}