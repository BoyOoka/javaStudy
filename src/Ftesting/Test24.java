package Ftesting;

class Ball{
	void play(){
		System.out.println("������������");
	}
	void play(int x){
		System.out.println("������������");
	}
	void play(int x, int y){
		System.out.println("������������");
	}
}

class TestBall{
	public static void main(String[] args){
		Ball b = new Ball();
		b.play();
		b.play(1);
		b.play(1,1);
	}
}