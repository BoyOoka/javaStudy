package javaStudy;

public class 线程同步 {
	public static void main(String[] args){
		computex t = new computex();
		computex1 t1 = new computex1();
//		new Thread(t).start();
//		new Thread(t).start();
//		new Thread(t).start();
		new Thread(t1).start();
		new Thread(t1).start();
		new Thread(t1).start();
	}
}
/*
 * 同步化块
 */
class computex extends Thread{
	int i = 10;
	static Object obj = new Object();
	public void print(){
		System.out.println(Thread.currentThread().getName()+":"+i);
		i--;
	}
	public void run(){
		while(i>0){
			synchronized(obj){//同步化块
				print();
			}
			try{
				sleep(1000);
			}catch(Exception e){
				
			}
		}
	}
}
/*
 * 同步化方法
 */
class computex1 extends Thread{
	int i = 10;
//	static Object obj = new Object();
	public synchronized void print(){
		System.out.println(Thread.currentThread().getName()+":"+i);
		i--;
	}
	 public void run(){
		while(i>0){
			print();
			try{
				sleep(1000);
			}catch(Exception e){
				
			}
		}
	}
}