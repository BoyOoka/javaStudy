package javaStudy;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 输入输出_文件目录 {
	public void print(File f){
			if(f.isDirectory()){
				System.out.println("这是一个目录");
			}else {
				System.out.println("这不是一个目录");
			}
			if(f.exists()){
				System.out.println("这个文件存在");
			}else{
				System.out.println("这个文件不存在");
			}try{
				f.createNewFile();
			}catch(Exception e){
				System.out.println("create异常");
			}
	}
	public void print1(File f){
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
	}
	public void print2(File f){
		if(f.isFile()){
			System.out.println(transferLongToDate(f.lastModified()));
			System.out.println(f.length());
		}
	}
	/*
	 * 格式化时间
	 */
	public String transferLongToDate(long millSec){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日' 'HH:mm:ss"); 
        Date date= new Date(millSec); 
        return sdf.format(date);  
	}
	public static void main(String[] args) {
		输入输出_文件目录 f1 = new 输入输出_文件目录();
		File f = new File("/Users/gaya/Downloads","输入输出1.txt");
		f1.print(f);
		f1.print1(f);
		f1.print2(f);
	}

}
