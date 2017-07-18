package javaStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 输入输出综合 {
	static public void read1(BufferedReader br){
		try{
			System.out.println(br.readLine());
		}catch(Exception e){
			System.out.println("read1异常");
		}
	}
	static public void write1(String str,BufferedWriter bw){
		if(str.length()>5){
			try{
				bw.write(str);
				bw.newLine();
				bw.flush();
			}catch(Exception e){
				System.out.println("write1_1异常");
			}
		}else if(str.length()<5){
			try{
				bw.write("输入有误！");
				bw.newLine();
				bw.close();
			}catch(Exception e){
				System.out.println("write1_2异常");
			}
		}
	}
	public static void main(String[] args) throws IOException {
		File f = new File("/Users/gaya/Downloads/test/输入输出6.txt");
		if(!f.isDirectory()){
			f.createNewFile();
		}
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f);
		OutputStreamWriter fw = new OutputStreamWriter(fos);
		InputStreamReader fr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		write1("这是第一行字",bw);
		write1("这是第二行字",bw);
		write1("这是第三行字",bw);
		write1("这是第",bw);
		read1(br);
		read1(br);
		read1(br);
		read1(br);
		bw.close();
		br.close();
	}
}
