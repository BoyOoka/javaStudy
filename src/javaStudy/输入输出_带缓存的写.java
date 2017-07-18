package javaStudy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 输入输出_带缓存的写 {

	public static void main(String[] args) throws IOException {
		File f = new File("/Users/gaya/Downloads/test/输入输出5.txt");
		if(!f.isDirectory()){
			f.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write("一句话\n第二行的一句话\n");
		osw.flush();
		/*
		 * BufferedWriter
		 */
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("新的一句话");
		bw.newLine();
		bw.write("第二句话");
		bw.newLine();
		bw.write("第三句话");
		bw.flush();
		bw.close();
	}

}
