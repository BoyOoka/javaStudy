package javaStudy;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class 随机文件访问_randomAccessFile {

	public static void main(String[] args) throws IOException {
		File f = new File("/Users/gaya/Downloads/test/输入输出3");
		RandomAccessFile raf = new RandomAccessFile(f,"rw");
		//创建一些变量
		int x = 13;
		char c ='a';
		long l = 123;
		float f1 = 3.79F;
		double d = 32.792384D;
		String s = "一段话，就这样。";
		//写入
		raf.writeInt(x);
		raf.writeChar(c);
		raf.writeLong(l);
		raf.writeFloat(f1);
		raf.writeDouble(d);
		raf.writeUTF(s);
		//访问
		System.out.println(raf.readInt());
		System.out.println(raf.readChar());
		System.out.println(raf.readLong());
		System.out.println(raf.readFloat());
		System.out.println(raf.readDouble());
		System.out.println(raf.readUTF());
	}

}
