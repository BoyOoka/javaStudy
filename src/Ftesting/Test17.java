package Ftesting;

class BoxQ{
	int length,width,height;
	void setSize(int l,int w,int h){
		length = l;
		width = w;
		height = h;
	}
	int getVolumn(){
		return length*width*height;
	}
}

class TestBoxQ{
	public static void main(String[] args){
		BoxQ b1 = new BoxQ();
		b1.setSize(20,15,10);
/*
		b1.length=20;
		b1.width=15;
		b1.height=10;
*/
		System.out.println(b1.getVolumn());
		BoxQ b2 = new BoxQ();
		b2.setSize(15,15,15);
		System.out.println(b2.getVolumn());
	}
}