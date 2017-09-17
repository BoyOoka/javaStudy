package jianai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class mysqlConect {
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/study?useSSL=true";
	String user = "root";
	String password = "8623116";
	List<String> list1 = new ArrayList<String>();
	List<String> list2_1 = new ArrayList<String>();
	List<String> list2_2 = new ArrayList<String>();
	List<String> list2_3 = new ArrayList<String>();
	List<String> list_url = new ArrayList<String>();
	public  mysqlConect(){
		try {
			Class.forName(driver);//加载JDBC驱动
			Connection conn = DriverManager.getConnection(url,user,password);
			Statement st = conn.createStatement();
			ResultSet rs1 = st.executeQuery("select * from classify");
			while(rs1.next()){
			list1.add(rs1.getString(2));
			}
			rs1.close();
			ResultSet rs2_shopId1 = st.executeQuery("select * from calssifys where id = '1'");
			while(rs2_shopId1.next()){
				list2_1.add(rs2_shopId1.getString(3));
			}
			rs2_shopId1.close();
			ResultSet rs2_shopId2 = st.executeQuery("select * from calssifys where id = '2'");
			while(rs2_shopId2.next()){
				list2_2.add(rs2_shopId2.getString(3));
			}
			rs2_shopId2.close();
			ResultSet rs2_shopId3 = st.executeQuery("select * from calssifys where id = '3'");
			while(rs2_shopId3.next()){
				list2_3.add(rs2_shopId3.getString(3));
			}
			ResultSet url = st.executeQuery("select * from shop_url");
			while(url.next()){
				list_url.add(url.getString(3));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println(list1);
//		System.out.println(list2_1);
//		System.out.println(list2_2);
//		System.out.println(list2_3);
	}
}
