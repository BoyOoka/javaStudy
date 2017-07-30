package schoolSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqltest {
	private Connection con;
	public sqltest(Connection con){
		try{
			con = this.getConnection();
			System.out.println("应该连接成功了");
		}catch(Exception e){
			System.out.println("连接失败");
		}
	}
	public Connection getConnection(){
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
//	public static void main(String[] args){
//		Connection con = null;
//		sqltest s = new sqltest(con);
//	}
}
