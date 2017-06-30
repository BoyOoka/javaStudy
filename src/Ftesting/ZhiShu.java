package Ftesting;

class ZhiShu{
	public static void main(String[] args){
		int x=1000;
a1:	for(int i=2;i<=x;i++){
			for(int j=2;j<=i/2;j++){
				if(i%j==0)
					continue a1;
			}
			System.out.print(i+"\t");
		}
	}
}