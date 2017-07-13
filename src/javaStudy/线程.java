package javaStudy;

public class 线程 {
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		compute t = new compute("6");
		compute1 t1 = new compute1();
		interrupt i =new interrupt();
		interrupt1 i1 =new interrupt1();
		Thread t3 = new Thread(i);
		t.setName("设置名字");
		t.setPriority(Thread.MAX_PRIORITY);//线程设置优先级
		t1.setPriority(Thread.MIN_PRIORITY);
		t3.start();
		t.start();
		t1.start();
		i1.start();
		t3.interrupted();//打断线程无效
		i1.interrupt();//打断线程3
	}
}
class compute extends Thread{
	compute(String s){
		super(s);
	}
	int i = 0;
	public void run(){//实现run方法
		for(;i<10;i++){
			System.out.println(getName()+" "+i);
		}
	}
}
class compute1 extends Thread{
	int i = 0;
	public void run(){
		for(;i<10;i++){
			System.out.println(Thread.currentThread().getName()+i+" ");
		}
	}
}
class interrupt implements Runnable{

	@Override
	public void run() {
		System.out.println("busy");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
class interrupt1 extends Thread{
	public void run(){
		System.out.println("busy");
		try {
			Thread.sleep(10000);//休眠很久
		} catch (InterruptedException e) {
			System.out.println("--------free--------");
		}
	}
}