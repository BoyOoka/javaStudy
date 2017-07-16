package javaStudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 输入输出_流 {

	public static void main(String[] args) throws IOException {
		/*
		 * 输入流
		 */
		File f =new File("/Users/gaya/Downloads/输入输出1.txt");
		FileInputStream fis = new FileInputStream(f);
		char ch=0;
		byte[] ch1 = new byte[(int) f.length()];
		fis.read(ch1);//1.会影响到2
		for(int i=0;i<f.length();i++){
			ch = (char)fis.read();//2
			System.out.print(ch);
			System.out.print((char)ch1[i]);
		}
		fis.close();
		/*
		 * 输出流
		 */
		File f1 = new File("/Users/gaya/Downloads/输入输出2.txt");
		FileOutputStream fos = new FileOutputStream(f1);
		for(int i='a';i<='z';i++){
			fos.write(i);
		}
		fos.close();
	}

}
