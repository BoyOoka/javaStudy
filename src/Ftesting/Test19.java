package Ftesting;

class SquareW{
	int x,y;
	int area(){
		return x*y;
	}
}

class VolumnW{
	int z;
	SquareW s=new SquareW();
	int volumn(){
		return s.area()*z;
	}
}

class TestVolumnW{
	public static void main(String[] args){
		Volumn v = new Volumn();
		v.s.x = 10;
		v.s.y = 20;
		v.z = 30;
		System.out.println(v.volumn());
	}
}