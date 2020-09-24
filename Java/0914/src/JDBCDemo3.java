import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class JDBCDemo3 {
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
//			StringBuffer sb = new StringBuffer();
//			sb.append("  SELECT ename, hiredate, NEXT_DAY(ADD_MONTHS(hiredate, 6), '월요일') ");
//			sb.append("  FROM emp ");
//			sb.append("  WHERE deptno = 20");
//			//System.out.println("sql = " + sb.toString());
//			rs = stmt.executeQuery(sb.toString());   //5. step
//			System.out.println("이름, 입사일, 입사일로부터 6개월이 지난 월요일");
//			System.out.println("-------------------------------------------");
//			while(rs.next()) {                                 //6. step
//				String ename = rs.getString(1);
//				Date hiredate = rs.getDate(2);
//				Date next_monday = rs.getDate(3);
//				System.out.println(ename + ", " + hiredate + ", " + next_monday);
//			}
			String sql = "   SELECT  TO_CHAR(SYSDATE, 'CC YYYY.MM.DD DAY PM HH:MI:SS')" + 
					          "   FROM    dual";
			rs = stmt.executeQuery(sql);
			rs.next();
			String now = rs.getString(1);
			System.out.println(now);
		} catch (SQLException e) {
			System.out.println(e);
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
