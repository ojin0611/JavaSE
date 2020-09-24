import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class PreparedStatementDemo {
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.print("�μ���ȣ : ");
		int department_num = scan.nextInt();
		System.out.print("���� : ");
		double salary = scan.nextDouble();
		
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.getConnection();    //2,3
		String sql = "  SELECT  ename, deptno, sal,   dname  " + 
		                  "  FROM     emp  INNER JOIN dept  USING(deptno)  " + 
				          "  WHERE  deptno = ? AND sal >= ?";  //�ҿ����� SQL ����.
		PreparedStatement pstmt = conn.prepareStatement(sql);   //�������� �ҿ����� SQL ����, �����˻�, ��ü�˻縦 �Ѵ�.  //4
		pstmt.setInt(1, department_num);
		pstmt.setDouble(2, salary);                //������ SQL����
		ResultSet rs = pstmt.executeQuery();                       //5. �ſ� ��������....�Ķ���ͷ� sql�� �������� ����.
		while(rs.next()) {    //6
			String ename = rs.getString("ename");
			int deptno = rs.getInt("deptno");
			double sal = rs.getDouble("sal");
			String dname = rs.getString("dname");
			System.out.println(ename + "\t" + deptno + "\t" + sal + "\t" + dname);
		}
		DBClose.close(conn);                                     //7
	}
}
