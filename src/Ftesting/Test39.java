package Ftesting;

class Test39{
	public static void main(String args[]){
		if(args.length<1){
			System.out.println("������һ������");
			return;
		}
		int x=Integer.parseInt(args[0]);
		if(x>0)
			System.out.println(x+"������");
		else
			if(x<0)
				System.out.println(x+"�Ǹ���");
			else
				System.out.println("����");
	}
}