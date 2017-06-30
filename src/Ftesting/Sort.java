package Ftesting;
class Sort{
	public static void main(String args[]){
		int x[]={10,15,2,8,3,7,1};
		for(int i=1;i<x.length;i++){
			for(int j=1;j<=x.length-i;j++){
				if(x[j-1]>x[j]){
					int temp=x[j-1];
					x[j-1]=x[j];
					x[j]=temp;
				}
			}
		}
		for(int i:x)
			System.out.print(i+"\t");
	}
}