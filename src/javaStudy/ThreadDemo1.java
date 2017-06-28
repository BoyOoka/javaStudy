package javaStudy;

	public class ThreadDemo1 {
	     public static void main(String[] args){
	         Demo d = new Demo();
	         d.start();
	      //  Thread t = new Thread();
	       // t.start();
	         for(int i=0;i<60;i++){
	             System.out.println(Thread.currentThread().getName()+i);
	         }

	     }
	 }
	 class Demo extends Thread{
	     public void run(){
	         for(int i=0;i<60;i++){
	             System.out.println(Thread.currentThread().getName()+i);
	         }
	     }
	 }

