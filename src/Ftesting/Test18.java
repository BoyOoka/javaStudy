package Ftesting;

class SquareQ{
	int x,y;
	int area(){
		return x*y;
	}
}

class Volumn{
	int z;
	SquareQ s;
	int volumn(){
		return s.area()*z;
	}
}

class TestVolumn{
	public static void main(String[] args){
		SquareQ ss = new SquareQ();
		ss.x = 10;
		ss.y = 20;
		Volumn v = new Volumn();
		v.s = ss;
		v.z = 30;
		System.out.println(v.volumn());
	}
}