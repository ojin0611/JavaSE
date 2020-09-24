//1. import ����.
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
//			//����� �̸��� �Է¹޾Ƽ� �� ����� ���, �̸�, �Ҽ� �μ��̸�, ��ġ, �μ���ȣ ����ϱ�
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
			//����� �̸��� �Է¹޾Ƽ� �� ����� ���, �̸�, �Ҽ� �μ��̸�, ��ġ, �μ���ȣ ����ϱ�
			String sql = "   SELECT empno, ename, dname, loc, deptno  " + 
			                  "    FROM  emp  NATURAL JOIN dept  " + 
					          "    WHERE ename = ?";  //�ҿ����� SQL����
			pstmt = conn.prepareStatement(sql);  //�������� �ҿ����� SQL ����. �����˻�, ��ü�˻�
			pstmt.setString(1, name);      //��μ� ������ SQL ������ �ȴ�.
			rs = pstmt.executeQuery();    //������ ��, sql�� �Ķ���Ϳ� ������ �ȵȴ�.
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
