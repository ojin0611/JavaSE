//1. import 하자.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class JDBCDemo {
	public static void main(String[] args) {
		//2. Driver Loading
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("Oracle Driver Loading Success");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Oracle Driver Loading Failure");
//		}
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Oracle Driver Loading Success");
		} catch (SQLException e) {
			System.out.println("Oracle Driver Loading Failure");
		}
		
		//3. Connection
		Properties info = new Properties();
		info.setProperty("user", "scott");
		info.setProperty("password", "tiger");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, info);
			System.out.println(conn);
		} catch (SQLException e) {
			System.out.println("Connection Failure");
		}
		
		//4. Making a Statement object
//		Statement stmt = null;
//		ResultSet rs = null;
//		try {
//			stmt = conn.createStatement();
//			String name = "SCOTT";
//			//사원의 이름을 입력받아서 그 사원의 사번, 이름, 소속 부서이름, 위치, 부서번호 출력하기
//			String sql = "   SELECT empno, ename, dname, loc, deptno  " + 
//			                  "    FROM  emp  NATURAL JOIN dept  " + 
//					          "    WHERE ename = '" + name + "' ";
//			rs = stmt.executeQuery(sql);   //5. 
//			while(rs.next()) {                  //6.
//				int empno = rs.getInt("empno");
//				String ename = rs.getString("ename");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
//				int deptno = rs.getInt("deptno");
//				System.out.println(empno + "\t" + ename + "\t" + dname + "\t" + loc + "\t" + deptno);
//			}
		//4. Making a PreparedStatement object
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String name = "SCOTT";
			//사원의 이름을 입력받아서 그 사원의 사번, 이름, 소속 부서이름, 위치, 부서번호 출력하기
			String sql = "   SELECT empno, ename, dname, loc, deptno  " + 
			                  "    FROM  emp  NATURAL JOIN dept  " + 
					          "    WHERE ename = ?";  //불완전한 SQL문장
			pstmt = conn.prepareStatement(sql);  //아직까지 불완전한 SQL 문장. 문법검사, 개체검사
			pstmt.setString(1, name);      //비로소 완전한 SQL 문장이 된다.
			rs = pstmt.executeQuery();    //주의할 점, sql을 파라미터에 넣으면 안된다.
			while(rs.next()) {                  //6.
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				int deptno = rs.getInt("deptno");
				System.out.println(empno + "\t" + ename + "\t" + dname + "\t" + loc + "\t" + deptno);
			}
		}catch (SQLException e) {
			System.out.println(e.toString());
		}
	}
}
