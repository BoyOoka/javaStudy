package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqlConnect {

	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.jdbc.Driver";
		// URL指向要访问的数据库名mydata
		String url = "jdbc:mysql://localhost:3306/study?useSSL=true";
		// MySQL配置时的用户名
		String user = "root";
		// MySQL配置时的密码
		String password = "8623117";
		ResultSet rs = null;
		try {
			Class.forName(driver);// 加载JDBC驱动
			Connection conn = DriverManager.getConnection(url);
			Statement st = conn.createStatement();
			rs = st.executeQuery("select * from studentinfo");
			while (rs.next()) {
				// System.out.print(rs.getString(1)+"\t");
				// System.out.print(rs.getString(2)+"\t");
				// System.out.print(rs.getString(3)+"\n");
			}
			rs.close();
			st.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(rs);
		System.out.println(2);
	}

}
