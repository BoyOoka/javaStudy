package Ftesting;

class Zhi{
	public static void main(String[] args){
		int x=1000;
		for(int i=2;i<=x;i++){
			boolean isZhi=true;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					isZhi=false;
				}
			}
			if(isZhi)
				System.out.print(i+"\t");
		}
	}
}