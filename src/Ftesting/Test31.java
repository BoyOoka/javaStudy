package Ftesting;

class N{
	int x=10;
	static int y=20;
	void ab(){
		System.out.println("ab");
	}
	static void cd(){
		System.out.println("cd");
	}
}

class TestN{
	public static void main(String[] srg){
/*
		N a = new N();
		System.out.println(a.x);
		System.out.println(a.y);
		a.ab();
		a.cd();
*/
//		System.out.println(N.x);
		System.out.println(N.y);
//		N.ab();
		N.cd();
	}
}