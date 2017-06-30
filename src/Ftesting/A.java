package Ftesting;

class S{
	int x;
	S(int x){
		this.x = x;
		System.out.println(this.x);
	}
	int plus(){
		return x+1;
	}
	void show(){
		System.out.println(this.plus());
	}
}

class TestS{
	public static void main(String[] args){
		S a = new S(10);
//		a.x = 5;
		a.show();
	}
}