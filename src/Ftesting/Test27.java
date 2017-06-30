package Ftesting;

class BoxR{
	private int length,width,height;
	BoxR(int l, int w, int h){
		length = l;
		width = w;
		height = h;
	}
	int getVolumn(){
		return length*width*height;
	}
}

class TestBoxR{
	public static void main(String args[]){
		BoxR b1 = new BoxR(20,15,10);
		System.out.println(b1.getVolumn());
		BoxR b2 = new BoxR(15,15,15);
		System.out.println(b2.getVolumn());
	}
}