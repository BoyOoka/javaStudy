package jianai;
import java.util.Random;

import jianai.postRequest;
public class classifyAdd {

	public static void main(String[] args) {
		String urlF = "http://123.206.84.43:8080/api/admin/insertShopOneClass";
		String urlS = "http://123.206.84.43:8080/api/admin/insetShopTweClass?shopClassId=";
		String urlG = "http://123.206.84.43/api/admin/insetShop";
		String name1 = "testPL";
		String name2 = "test2";
		String urlImg = "http://sharebox-1253910309.file.myqcloud.com/photo/u%3D2734426178%2C1534917874%26fm%3D11%26gp%3D0.jpg";
		postRequest p = new postRequest();
		mysqlConect mysql = new mysqlConect();
		for(int i=0;i<mysql.list1.size();i++){
			p.postFirst(urlF, (mysql.list1.get(i)));
		}
		for(int j=0,id=34;j<mysql.list2_1.size();j++){
			int re = (int)(Math.random()*30);
			p.postSecond(urlS+id, mysql.list2_1.get(j), mysql.list_url.get(re));
		}
		for(int j=0,id=35;j<mysql.list2_2.size();j++){
			int re = (int)(Math.random()*30);
			p.postSecond(urlS+id, mysql.list2_2.get(j), mysql.list_url.get(re));
		}
		for(int j=0,id=36;j<mysql.list2_3.size();j++){
			int re = (int)(Math.random()*30);
			p.postSecond(urlS+id, mysql.list2_3.get(j), mysql.list_url.get(re));
		}
	}

}
