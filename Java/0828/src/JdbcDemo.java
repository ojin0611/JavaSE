// 1. import ����
import java.sql.*;
public class JdbcDemo {
	public static void main(String[] args) {
		
	
		//2. Oracle Driver�� �޸𸮿� �ε�����
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Class Loading Success");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}
		// 3. Oracle Driver�� ���� Oracle DB�� Connect ����
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			System.out.println("Connection Success");
		} catch (SQLException e) {
			System.out.println("Connection Failure");
		}
		// 4. Statement ��ü�� ��������
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			
			// 5. SQL �� �ۼ��ؼ� ��������
			String sql = "SELECT empno, ename, sal FROM emp";
			stmt.executeQuery(sql);
			rs = stmt.executeQuery(sql);
			
			// 6. SELECT�� ��� ResultSet ó������.
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString("ename");
				double sal = rs.getDouble("sal");
				System.out.printf("%d\t%s\t%7.2f\n", empno, ename, sal);
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		// 7. DB Close
		try {
			if(rs != null) rs.close();
			if(stmt!= null) stmt.close();
			if(conn!= null) conn.close();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
}