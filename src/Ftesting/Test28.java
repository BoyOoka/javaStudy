package Ftesting;

class Box{
	private int length,width,height;
	Box(int l, int w, int h){
		length=l;
		width=w;
		height=h;
	}
	Box(int l, int w){
		this(l,w,l);
	}
	Box(int l){
		this(l,l);
	}
	Box(){
		this(10);
	}
	int volume(){
		return length*width*height;
	}
}

class TestBox{
	public static void main(String[] args){
		Box b1 = new Box(20,15,10);
		System.out.println("b1.volume=" + b1.volume());
		Box b2 = new Box(20,15);
		System.out.println("b2.volume=" + b2.volume());
		Box b3 = new Box(15);
		System.out.println("b3.volume=" + b3.volume());
		Box b4 = new Box();
		System.out.println("b4.volume=" + b4.volume());
	}
}