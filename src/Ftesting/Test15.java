package Ftesting;

class Test15{
	public static void main(String are[]){
a1:	for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				if(j==6)
					break a1;
				System.out.print(i + "X" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
