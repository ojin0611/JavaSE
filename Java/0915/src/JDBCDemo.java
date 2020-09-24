import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class JDBCDemo {
	public static void main(String[] args) throws SQLException{
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.getConnection();  //2, 3
		Statement stmt = conn.createStatement();   //4
		String sql = "  SELECT deptno, job, TO_CHAR(TRUNC(AVG(sal)), '$999,999'),   " + 
				          "                    TO_CHAR(MAX(sal), '$999,999'),  " + 
				          "                    TO_CHAR(MIN(sal), '$999,999'), COUNT(*)  " + 
			 	          "  FROM   emp " + 
				          "  GROUP BY deptno, job   " + 
				          "  ORDER BY deptno, job";
		ResultSet rs = stmt.executeQuery(sql);     //5
		while(rs.next()) {
			int deptno = rs.getInt(1);
			String job = rs.getString(2);
			String avg_sal = rs.getString(3);
			String avg_max = rs.getString(4);
			String avg_min = rs.getString(5);
			int count = rs.getInt(6);
			System.out.printf("%d\t%s\t%s\t%s\t%s\t%d%n", 
										deptno, job, avg_sal, avg_max, avg_min, count);
		}
		DBClose.close(conn, stmt, rs);  //7
	}
}
