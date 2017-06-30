package Ftesting;

class Test06{
	public static void main(String arg[]){
		int[] x = new int[3];
		x[0]=1;
		x[1]=10;
		x[2]=30;
//		x[3]=500;
//x[3]������x����ķ�Χ��
		int y[]={1,2,3,4,5};
		System.out.println(y.length);
		System.out.println(y[3]);
		int a[][] = new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
//		a[2][0]=7;
		int[][] b=new int[2][];
		b[0]=new int[3];
		b[1]=new int[4];
		b[0][0]=1;
		b[0][1]=2;
		b[0][2]=3;
//		b[0][3]=10;
		b[1][0]=4;
		b[1][1]=5;
		b[1][2]=6;
		b[1][3]=7;
		int[][] c = {{1,2,3},{4,5,6}};
		System.out.println(c.length);
		System.out.println(c.length*c[1].length);
		System.out.println(c[0][0]);
		System.out.println(c[0][1]);
		System.out.println(c[1][0]);
//		System.out.println(c[2][2]);
		int d[][][]={{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		System.out.println(d[0][0][0]);
		System.out.println(d[0][0][1]);
		System.out.println(d[0][0][2]);
		System.out.println(d[0][1][0]);
		System.out.println(d[0][1][1]);
		System.out.println(d[0][1][2]);
		System.out.println(d[1][0][0]);
		System.out.println(d[1][0][1]);
		System.out.println(d[1][0][2]);
		System.out.println(d[1][1][0]);
		System.out.println(d[1][1][1]);
		System.out.println(d[1][1][2]);
		int[][] e = {{1},{2,3},{4,5,6}};
		System.out.println(e[0].length+e[1].length+e[2].length);
	}
}