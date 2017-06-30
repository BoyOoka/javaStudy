package Ftesting;

class Test41{
	public static void main(String args[]){
		if(args.length<1){
			System.out.println("������һ������");
			return;
		}
		int x;
		try{
			x=Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e){
			System.out.println("����ı���������");
			return;
		}
		if(x>0)
			System.out.println(x+"������");
		else
			if(x<0)
				System.out.println(x+"�Ǹ���");
			else
				System.out.println("����");
	}
}