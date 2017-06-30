package Ftesting;

class Point{
	int x;
	int y;
	void locate(int X, int Y){
		x = X;
		y = Y;
	}
	double distance(Point p){
		return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
	}
}
class Square{
	public static void main(String[] args){
		Point a1 = new Point(), a2 = new Point();
		a1.locate(10,20);
		a2.locate(30,30);
		System.out.println(a1.distance(a2));
		System.out.println(a2.distance(a1));
	}
}