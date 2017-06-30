package Ftesting;

class Test09{
	public static void main(String arg[]){
		int x=1,y=2;
		int a=456,b=789,c=-123;
		System.out.println(x+y);
		System.out.println(a%c);
		System.out.println(3.14%1.23);
		System.out.println(x+","+y);
		System.out.println("1==2 is "+(1==2));
		System.out.println("1!=2 is "+(1!=2));
		System.out.println("1>2 is "+(1>2));
		System.out.println("1>=2 is "+(1>=2));
		System.out.println("1<2 is "+(1<2));
		System.out.println("1<=2 is "+(1<=2));
		System.out.println("! true is "+(!true));
		System.out.println("! (1>2) is "+(!(1>2)));
		System.out.println("true & true is "+(true & true));
		System.out.println("true & false is "+(true & false));
		System.out.println("false & true is "+(false & true));
		System.out.println("false & false is "+(false & false));
		System.out.println("true | true is "+(true | true));
		System.out.println("true | false is "+(true | false));
		System.out.println("false | true is "+(false | true));
		System.out.println("false | false is "+(false | false));
		System.out.println("true ^ true is "+(true ^ true));
		System.out.println("true ^ false is "+(true ^ false));
		System.out.println("false ^ true is "+(false ^ true));
		System.out.println("false ^ false is "+(false ^ false));
		int i=1;
		System.out.println(i>0);
		System.out.println(10/i>0);
		System.out.println((i>0)&(10/i>0));
		i=i-1;
		System.out.println((i>0)&&(10/i>0));
		System.out.println(~a);
		System.out.println(~c);
		System.out.println(a&b);
		System.out.println(a&c);
		System.out.println(a|b);
		System.out.println(a|c);
		System.out.println(a^b);
		System.out.println(a^c);
		System.out.println(a<<3);
		System.out.println(c<<2);
		System.out.println(a<<22);
		System.out.println(a<<23);
		System.out.println(a>>4);
		System.out.println(c>>2);
		System.out.println(c>>>2);
	}
}