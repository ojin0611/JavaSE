import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class UpdateDemo {
	public static void main(String[] args) throws SQLException{
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.getConnection();   //2, 3
		Statement stmt = conn.createStatement();    //4
		
		String sql = " UPDATE emp_copy  " +
		                  " SET mgr = 2222, sal = 1500, comm = 100 " +
				          " WHERE empno = 5555";
		
		int rows = stmt.executeUpdate(sql);   //5. 반드시 executeUpdate()를 사용해야 한다.
		if(rows == 1) System.out.println("Update Success");
		else System.out.println("Update Failure");
		
		DBClose.close(conn, stmt);               //6.
	}
}
