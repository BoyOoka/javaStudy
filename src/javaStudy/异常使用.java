package javaStudy;

public class 异常使用 {
	static int counter = 0;
	static int i = 0;
	public static void main(String[] args) {
		while(true){
			try{
				if(counter++<2){
					throw new myNewException();
					}
				else {
					System.out.println(i);
					i++;
				}
			}catch(myNewException e){
				System.err.println("myNewException happened");
			}
			finally{
				System.err.println("finally is called");
				if(counter>2){
					System.out.println("循环了"+counter+"次"+"i="+i);
					break;
				}
			}
		}
		System.out.println("退出while循环");
	}
	
}
class myNewException extends Exception{}