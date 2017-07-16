package javaStudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 输入输出 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("/Users/gaya/Downloads","/f1.txt");
		File f2 = new File("/Users/gaya/Downloads/test");
		System.out.println(f1.getName());
		System.out.println(f1.getParent());
		System.out.println(f1.getPath());
	}

}
