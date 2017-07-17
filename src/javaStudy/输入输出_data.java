package javaStudy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 输入输出_data {

	public static void main(String[] args) throws IOException {
		String st;
		File f = new File("/Users/gaya/Downloads/test/输入输出4.txt");
		if(!f.isDirectory()){
			f.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(f);
		FileInputStream fis = new FileInputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("明天要下雨吗？\n");
		dos.writeUTF("明天要下雨吗？");
		dos.writeUTF("明天要下雨吗？");
		dos.writeUTF("明天要下雨吗？");
		dos.close();
		DataInputStream dis = new DataInputStream(fis);
		String s = dis.readUTF();
		System.out.println(s);
	}

}
