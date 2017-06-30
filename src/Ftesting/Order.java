package Ftesting;

class Order{
	public static void main(String args[]){
		int[] x={10,8,9,3,5,2,1};
		for(int i=0;i<x.length-1;i++){
			for(int j=i+1;j<x.length;j++){
				if(x[i]>x[j]){
					int tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}
			}
		}
		for(int i: x)
			System.out.print(i+"\t");
	}
}