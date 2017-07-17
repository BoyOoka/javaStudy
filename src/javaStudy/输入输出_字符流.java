package javaStudy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class 输入输出_字符流 {

	public static void main(String[] args) throws IOException {
		File f = new File("/Users/gaya/Downloads/test/输入输出3.txt");
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis);
		char[] a = {'q','e','r','t'};
		char st1 = (char)fis.read();
		char st = (char)isr.read();
		System.out.println(st1);
		System.out.println(st);
		/*
		 * bufferReader
		 */
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
	}

}
