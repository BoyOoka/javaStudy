package Ftesting;

class U{
	public int a1=1;
	protected int a2=2;
	int a3=3;
	private int a4=4;
	void show(){
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}
}

class TestU{
	public static void main(String[] args){
		U a = new U();
		System.out.println(a.a1);
		System.out.println(a.a2);
		System.out.println(a.a3);
//		System.out.println(a.a4);
//a4��private��ֻ����U���ڲ����ã������಻�ܵ���
		a.show();
	}
}