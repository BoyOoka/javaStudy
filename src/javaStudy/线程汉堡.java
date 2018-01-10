package javaStudy;

public class 线程汉堡 {
	public static void main(String[] args){
		hmaker maker = new hmaker();
		hassistant assistant = new hassistant();
		maker.setName("甲");
		maker.start();
		assistant.start();
	}
}
 class ham{
	static Object box = new Object();
	static int totalmaterial = 10;
	static int sales = 0;
	static int production = 5;
}
class hmaker extends Thread{
//	汉堡生产
		public void make(){
			synchronized(ham.box){
				ham.production++;
				try{
					ham.box.notify();
					System.out.println("notify");
				}catch(Exception e){
					
				}
			}
		}
		@Override
		public void run(){
//			汉堡用完之前，不断产生汉堡
			while(ham.production<ham.totalmaterial){
				if(ham.production>0){
					System.out.println("厨师"+getName()+":"+
				"汉堡来了总共:"+(ham.production-ham.sales)+"个");
				}
			try{
				sleep(3000);
			}catch(Exception e){
			}
			make();
		}
	}
}
/*
 * 营业员的线程类
 */
class hassistant extends Thread{
	public void sell(){
		if(ham.production == 0){
			System.out.println("汉堡正在加工中，请稍等!");
		}try{
			ham.box.wait();
			System.out.println("wait");
		}catch(Exception e){}
		ham.sales++;
		System.out.println("营业员总共卖了："+ham.sales+"个");
	}
	@Override
	public void run(){
		while(ham.sales<ham.production){
			try{
				sleep(1000);
			}catch(Exception e){
			}
			sell();
		}
	}
}