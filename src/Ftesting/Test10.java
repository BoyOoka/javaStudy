package Ftesting;

class Test10{
	public static void main(String[] args){
		int i=5,j=5,p1,p2;
		p1=(i++)+(i++);
		p2=(++j)+(++j);
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("p1="+p1);
		System.out.println("p2="+p2);
	}
}