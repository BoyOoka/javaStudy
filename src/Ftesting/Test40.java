package Ftesting;

interface IBox{
	void setSize(int l, int w, int h);
	int volumn();
}

class Boxe implements IBox{
	private int length,width,height;
	public void setSize(int l, int w, int h){
		length=l;
		width=w;
		height=h;
	}
	public int volumn(){
		return length*width*height;
	}
}