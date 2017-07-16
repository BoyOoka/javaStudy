package javaStudy;

public class finally的使用 {
	static Switch sw = new Switch();
	static void f() throws openShutException1{
		throw new openShutException1();
	}
	public static void main(String[] args) throws openShutException2{
		try{
			sw.open();
			f();
//			throw new openShutException2();
//			sw.shut();
		}catch(openShutException1 e1){
			System.err.println("openShutException1");
//			sw.shut();
		}finally{//最终都会被执行
			sw.shut();
//			sw.open();
		}
		System.out.println(sw.state);
		
	}
}
class Switch{
	boolean state = false;
	boolean read(){return state;}
	void open(){state = true;}
	void shut(){state = false;}
}
class openShutException1 extends Exception{}
class openShutException2 extends Exception{}
