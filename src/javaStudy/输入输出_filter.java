package javaStudy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class 输入输出_filter {
	public static void main(String[] args)throws IOException  {
		File f = new File("/Users/gaya/Downloads/test/输入输出3.txt");
		FileOutputStream fis = new FileOutputStream(f);
//		FilterInputStream filter = new FilterInputStream(fis);
		FilterOutputStream filter = new FilterOutputStream(fis);
		for(int i='a';i<='z';i++){
			filter.write(i);
		}
		filter.close();
	}

}
