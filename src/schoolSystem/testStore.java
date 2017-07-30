package schoolSystem;

import java.sql.Connection;

public class testStore {

	public static void main(String[] args) {
		storesystem st =new storesystem();
		Connection con = st.getConnection();
		student s = st.getobject(con, "岳靓","机械系");
		System.out.println(s.getage()+s.getbirthday()+" "+s.getcode()+s.getaddress());
	}

}
