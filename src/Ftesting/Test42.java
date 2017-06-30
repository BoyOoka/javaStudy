package Ftesting;

class Calc{
	void devide(int x, int y){
		try{
			isZero(y);
			System.out.println("��ʼ����");
			System.out.println(x + "/" + y + "=" + (x/y));
		}
		catch(Exception e){
			System.out.println("��������������");
		}
	}
	void isZero(int x) throws Exception{
		if(x==0)
			throw new Exception();
	}
}

class TestCalc{
	public static void main(String args[]){
		if(args.length<2){
			System.out.println("������2������");
			return;
		}
		int x=0,y=0;
		try{
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
		}
		catch(Exception e){
			System.out.println("�����2������������������");
			return;
		}
		Calc c = new Calc();
		c.devide(x,y);
	}
}