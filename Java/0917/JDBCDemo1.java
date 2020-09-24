import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCDemo1 {
	public static void main(String[] args) throws SQLException {
		//2. Driver Loading
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//3. Connection
		final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		Properties info = new Properties();
		info.setProperty("user", "hr");
		info.setProperty("password", "hr");
		Connection conn = DriverManager.getConnection(URL, info);
		
		//4. Statement 
		Statement stmt = conn.createStatement();
		
		//5. Query를 실행
		String sql = "   SELECT  employee_id, first_name, e.department_id, d.department_id, department_name     " + 
				          "   FROM    employees e FULL OUTER JOIN departments d ON e.department_id = d.department_id";
		ResultSet rs = stmt.executeQuery(sql);
		
		//6. ResultSet 뽑아내자.
		System.out.println("카운트\t사원번호\t사원이름\t사원쪽 부서번호\t부서쪽 부서번호\t부서이름");
		int count = 0;
		while(rs.next()) {
			int employee_id = rs.getInt("employee_id");
			String first_name = rs.getString("first_name");
			int department_id1 = rs.getInt(3);
			int department_id2 = rs.getInt(4);
			String department_name = rs.getString("department_name");
			System.out.println(++count + " : " + employee_id + "\t" + first_name + "\t" + department_id1 + "\t" + department_id2 + "\t" + department_name);
		}
		
		//7. Close하자.
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
}
