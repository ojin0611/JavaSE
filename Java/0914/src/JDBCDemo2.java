import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo2 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Failure");
		}
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
			stmt = conn.createStatement();   //4. step
			String sql = "  SELECT  empno, ename, sal, TRUNC(sal / 20) " + 
					          "  FROM    emp  " + 
					          "  WHERE    deptno = 10";
			//System.out.println("sql = " + sql);
			rs = stmt.executeQuery(sql);   //5. step
			System.out.println("사원번호, 사원명, 봉급, 일급");
			System.out.println("----------------------------------");
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				double sal = rs.getDouble("sal");
				int sal_day = rs.getInt(4);
				System.out.println(empno + ", " + ename + ", " + sal + ", " + sal_day);
			}
		} catch (SQLException e) {
			System.out.println("Connection Failure");
		}
		//7. step
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
}
