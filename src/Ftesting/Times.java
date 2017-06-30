package Ftesting;

class Times{
	public static void main(String are[]){
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				System.out.print(i + "X" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		for(int i=1;i<10;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j + "X" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				
				if(j<i)
					System.out.print("\t");
				else
					System.out.print(j + "X" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
