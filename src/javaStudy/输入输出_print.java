package javaStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class 输入输出_print {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		PrintWriter pw = new PrintWriter(System.out,true);
		pw.println("请输入字符");
		String s;
		while(!(s = br.readLine()).equals("")){
			pw.println(s);
		}
		br.close();
		pw.close();
	}

}
