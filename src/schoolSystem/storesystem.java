package schoolSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class storesystem {
	public Vector<student> getstudent(Connection con,String sql){
		Vector<student> v = new Vector<student>();
		try{
			Statement st = con.createStatement();//会话对象
			ResultSet rs = st.executeQuery(sql);//结果集
			while(rs.next()){
				String name = rs.getString(1);
				String code = rs.getString(2);
				String sexy = rs.getString(3);
				String age = rs.getString(4);
				String address = rs.getString(5);
				String birthday = rs.getString(6);
				String grade = rs.getString(7);
				String major = rs.getString(8);
				student ss = new student(name,code);
				ss.setsexy(sexy);
				ss.setmajor(major);
				ss.setbirthdy(birthday);
				ss.setaddress(address);
				ss.setage(age);
				ss.setgrade(grade);
				v.add(ss);
			}
			rs.close();
		}catch(Exception e){
			
		}
		return v;
	}
	//查找名为stname的对象
	public student getobject(Connection con,String stname,String major1){
		student sst = null;
		try{
			//获取会话对象st
			Statement st = con.createStatement();
			String sql = "select * from studentinfo where major='"+major1+"' and stname='"+stname+"'";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				String code = rs.getString(2);
				String sexy = rs.getString(3);
				String age = rs.getString(4);
				String address = rs.getString(5);
				String birthday = rs.getString(6);
				String grade = rs.getString(7);
				String major = rs.getString(8);
				sst = new student(stname,code);
				sst.setsexy(sexy);
				sst.setmajor(major);
				sst.setbirthdy(birthday);
				sst.setaddress(address);
				sst.setage(age);
				sst.setgrade(grade);
			}
			rs.close();
		}catch(Exception e){
	}
		return sst;
	}
	//设置数据库URL密码等
	public Connection getConnection(){
		Connection con = null;
		String url =  "jdbc:mysql://localhost:3306/study?useSSL=true";
		String user = "root";
		String password = "8623116";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
