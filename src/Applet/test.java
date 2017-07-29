package Applet;

import java.applet.Applet;
import java.net.URL;

public class test extends Applet{
	URL u;
	public void innit(){
	}
	public void start(){
		u = getCodeBase();
		System.out.println(u+"1");
	}
	public void stop(){
		System.out.println("结束");
	}
}
