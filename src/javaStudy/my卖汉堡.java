package javaStudy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class my卖汉堡 {
	public static void main(String[] args) {
		maker m = new maker();
		clerk c = new clerk();
//		new Thread(m).start();
		new Thread(m).start();
		new Thread(c).start();
		new Thread(c).start();
		new Thread(c).start();
		new Thread(c).start();
	}

}
class myHam{
	static Object box = new Object();
	static int total = 10;
	static int sales = 0;
	static int production = 0;
}
class maker extends Thread{
	public void make(){
		synchronized(myHam.box){
		GregorianCalendar t = new GregorianCalendar();
		while(t.get(Calendar.HOUR_OF_DAY)<20){
		myHam.production++;
		myHam.total++;
		System.out.println(Thread.currentThread().getName()+":"+"总共做了"+myHam.production+"个汉堡");
		System.out.println("现在有"+myHam.total+"个汉堡");
		try{
			sleep(3000);
		}catch(Exception e){
				}
			}
		}
	}
	
	@Override
	public void run(){
		make();
	}
}
class clerk extends Thread{
	GregorianCalendar t = new GregorianCalendar();
	public synchronized void sales(){
	a1:	while(myHam.total>0 && (t.get(Calendar.HOUR_OF_DAY))<20){
			String s = String.valueOf(t.get(Calendar.MINUTE));
//			Thread.currentThread().setName(s);
			System.out.println(Thread.currentThread().getName()+"店员：营业中！");
			myHam.sales++;
			myHam.total--;
			System.out.println("卖出"+myHam.sales+"个汉堡");
			try{
				sleep(1000);
			}catch(Exception e){
			}
			if(myHam.total==0){
				System.out.println("店员：加工中请稍等！");
				try{
					sleep(4000);
				}catch(Exception e){
				}
			}else if(myHam.total>0){
				continue a1;
			}else{
				System.out.println("出问题了"+myHam.total);
			}
		}
		
	}
	@Override
	public void run(){
		sales();
	}
}