package javaStudy;

import javax.print.DocFlavor.INPUT_STREAM;

public class controlTest {
	public static void main(String[] args){
		int Chinese = 90;
		int English = 75;
		int math = 90;
		int art = 85;
		float avg = (Chinese+English+math+art)/4;
		System.out.println(avg);
		if(avg>=90){//条件语句
			System.out.println("成绩为A");
		}
		else if((avg<90)&&(avg>=80)){
			System.out.println("成绩为B");
		}
		else if((avg>=70)&&(avg<80)){
			System.out.println("成绩为C");
		}
		else if((avg>=60)&&(avg<70)){
			System.out.println("成绩为D");
		}
		else {
			System.out.println("成绩为E");
		}
		reTest();//for循环
		reTestP();//集合for循环
		conti();//中断当次循环
		cas();//分支语句
	}
	public static void reTest(){//for循环
		int x = 1;
		int y = 1;
		int z;
		for(x=01;x<10;x++){
	/*		if(x>1){
				System.out.println("\n");
			}
		*/
			for(y=01;y<10;y++){
				z = x * y;
				System.out.print(x+"*"+y+"="+z+"\t");
			}
			System.out.println("\n");
		}
	}
	public static void reTestP(){//集合循环
		int[] xs = {1,4,5,6,7};
			for(int x : xs){
				System.out.print(x+" ");
			}System.out.println("");
		}
	/*
	 * 循环还有while和do...while
	 */
	public static void conti(){
		for(int i=0;i<=10;i++){
			if(i%2==0){
				continue;//中断当次循环
			}
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void cas(){
		int i = 10 ;
		switch(i){
		case 1 : System.out.println("一月份"); break;
		case 2 : System.out.println("二月份"); break;
		case 3 : System.out.println("三月份"); break;
		case 4 : System.out.println("四月份"); break;
		case 5 : System.out.println("五月份"); break;
		case 6 : System.out.println("六月份"); break;
		case 7 : System.out.println("七月份"); break;
		case 8 : System.out.println("八月份"); break;
		case 9 : System.out.println("九月份"); break;
		case 10 : System.out.println("十月份"); break;
		case 11 : System.out.println("十一月份"); break;
		case 12 : System.out.println("十二份"); break;
		default: System.out.println("default");
		}
	}
}
