import java.sql.*;  //1. step

public class JDBCDemo {
	public static void main(String[] args) {
		//2. step
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Success");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Failure");
		}
		//3. step
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			System.out.println("Connection Success");
			stmt = conn.createStatement();   //4. step
			String sql = " SELECT empno, ename, LPAD(ename, 10, '*')  " +
			                  " FROM  emp  " +
					          " WHERE deptno = 30";
			rs = stmt.executeQuery(sql);              //5. step
			//6. step
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String lpad = rs.getString(3);
				System.out.printf("%d, %s, %s%n", empno, ename, lpad);
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
