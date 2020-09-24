import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class JDBCDemo4 {
	public static void main(String[] args) {
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.getConnection();  //2,3 step
		//System.out.println(conn);
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();   //4. step
			String sql = "  SELECT ename, sal, TO_CHAR(comm, '$999,999'), " + 
					          "       TO_CHAR(sal * 12 + NVL(comm, 0), '$999,999')  " + 
					          "  FROM    emp  " + 
					          "  WHERE   TO_CHAR(hiredate, 'YYYY') = '1981'";
			rs = stmt.executeQuery(sql);     //5. step
			while(rs.next()) {   //6. step
				String ename = rs.getString("ename");
				//double sal = rs.getDouble("sal");
				double sal_double = rs.getDouble("sal");
				String sal = "$" + String.format("%,.0f", sal_double);
				String comm = rs.getString(3);
				String annual_salary = rs.getString(4);
				System.out.printf("%s, %s, %s, %s%n", ename, sal, comm, annual_salary);
			}
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		DBClose.close(conn, stmt, rs);  //7. step
	}
}
