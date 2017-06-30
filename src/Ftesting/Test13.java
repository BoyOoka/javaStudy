package Ftesting;

class Test13{
	public static void main(String[] args){
		int i=1;
		while(i<10){
			System.out.println("i="+i);
			i++;
		}
		System.out.println("-----------------------------------");
		i=10;
		do{
			System.out.println("i="+i);
			i++;
		}while(i<10);
		System.out.println("-----------------------------------");
		for(int a=0;a<10;a++)
			System.out.println("a="+a);
		int x[]={1,2,3,4,5};
		for(int a : x)
		  System.out.println(a);
	}
}