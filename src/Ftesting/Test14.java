package Ftesting;

class Test14{
	public static void main(String[] args){
		System.out.println("Go!");
		for(int i=1;i<10;i++){
			if(i==7)
//				continue;
//				break;
				return;
			System.out.println("i=" + i);
		}
		System.out.println("Game Over!");
	}
}