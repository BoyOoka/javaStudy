package Ftesting;

class O{
  void ab(){
    System.out.println("O class");
  }
  void ab(int x){
    System.out.println(x);
  }
	void ab(String x){
		System.out.println(x);
	}
/*	void ab(String y){
		System.out.println("O "+y);
	}*/
	void ab(int x, String y){
		System.out.println(x+y);
	}
	void ab(String x, int y){
		System.out.println(x+y);
	}
/*	void ab(String y, int x){
		System.out.println(x+y);
	}*/
}

class TestO{
	public static void main(String[] args){
		O a = new O();
		a.ab("abc");
		a.ab(10,"abc");
		a.ab();
		a.ab(20);
	}
}