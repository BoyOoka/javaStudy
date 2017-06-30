package javaStudy;

import java.io.File;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class threadOpen  {
	public static void main(String[] args){

		for(int id=101,count=1;id<=106;id++,count++){
			String s = String.valueOf(id);
			myThread o = new myThread(s);
			switch(count) 
			{ 
			case 1:
				o.setPriority(1); 
				break;
			case 2:
				o.setPriority(2);
				break;
			case 3:
				o.setPriority(3);
				break;
			case 4:
				o.setPriority(4);
				break;
			case 5:
				o.setPriority(5);
				break;
			case 6:
				o.setPriority(6);
				break;
			case 7:
				o.setPriority(7);
				break;
			case 8:
				o.setPriority(8);
				break;
			case 9:
				o.setPriority(9);
				break;
			case 10:
				o.setPriority(10);
				break;
			default:
				break;
			}
			o.start();
		}
	}
}

class myThread extends Thread{
	int x=0,z=0;	
	myThread(String s){
		super(s);
	}
	public void run(){
		File file = new File("");
		String path = file.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", path+"/lib/selenium-java-3.0.0-beta4/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.xjshift.com:81/dev/login?id="+getName()+"&key=blue");
		driver.get("http://dev.xjshift.com:81/");
		driver.manage().window().setSize(new Dimension(400,680));
		if(getPriority()<=5){
			x=370*(getPriority()-1);
			System.out.println(x+","+z+" "+getPriority());
			driver.manage().window().setPosition(new Point(x,z));
			}else if(getPriority()>5){
				x=370*(getPriority()-6);
				z=300;
				System.out.println(x+","+z+" "+getPriority());
				driver.manage().window().setSize(new Dimension(400,450));
				driver.manage().window().setPosition(new Point(x,z));
   	 }
	 
	}
}








