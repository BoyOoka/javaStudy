package jianai;

import java.util.Random;

public class testSql {

	public static void main(String[] args) {
		mysqlConect test = new mysqlConect();
		Random rand=new Random();
		for(int i=0;i<10;i++){
			int re = (int) (Math.random()*30);
//			System.out.println(re);
			System.out.println(test.list_url.get(re));
		}
	}

}
