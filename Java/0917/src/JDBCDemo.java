import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class JDBCDemo {
	public static void main(String[] args) throws SQLException {
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.getConnection();    //2,3
		//System.out.println(conn);
		String sql = "   SELECT employee_id, first_name, hire_date, e.department_id, department_name, city, state_province, country_name   " + 
			              "   FROM employees e INNER JOIN departments d ON e.department_id = d.department_id " +
				          "   INNER JOIN locations lo ON d.location_id = lo.location_id " + 
			              "   INNER JOIN countries co ON lo.country_id = co.country_id  " + 
			              "   WHERE e.department_id IN (?, ?, ?, ?)";   //�ҿ����� SQL����
		PreparedStatement pstmt = conn.prepareStatement(sql);    //4. ������ �ҿ����� SQL����, ������ ���⼭ �����˻�, ��ü�˻縦 �����Ѵ�.
		pstmt.setInt(1, 10);            pstmt.setInt(2,  20);      pstmt.setInt(3,  30);     pstmt.setInt(4,  40);  //��μ� ������ SQL������ �ƴ�.
		ResultSet rs = pstmt.executeQuery();    //5. ��������. �Ķ���ͷ� sql�� ���� ����.
		int count = 0;
		while(rs.next()) {     //6. 
			int employee_id = rs.getInt("employee_id");
			String department_name = rs.getString("department_name");
			String city = rs.getString("city");
			String country_name = rs.getString("country_name");
			System.out.println(++count + " : " + employee_id + "\t" + department_name + "\t" + city + "\t" + country_name);
		}
		DBClose.close(conn, pstmt, rs);                                     //7
	}
}
