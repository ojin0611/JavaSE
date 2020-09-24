import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class InsertDemo {
	public static void main(String[] args) throws SQLException{
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.getConnection();   //2,3
		//System.out.println(conn);
		Statement stmt = conn.createStatement();   //4
		int empno = 2222;
		String ename = "YOUNGHEE";
		String job = "DESIGNER";
		//String sql = "   INSERT INTO emp_copy(empno, ename, job, hiredate)   " +
		//                  "   VALUES(1111, 'CHULSU', 'DEVELOPER', SYSDATE) ";
		String sql = "   INSERT INTO emp_copy(empno, ename, job, hiredate)  " +
		                  "      VALUES(" + empno + ", '" + ename + "', '" + job + "', SYSDATE)";
		//System.out.println("sql = " + sql);
		int count = stmt.executeUpdate(sql);           //5. �ſ� ��������.  SELECT(executeQuery())�� ������ ������ SQL�� executeUpdate()�� ����Ѵ�.
		//�̶� ��ȯ���� count�� �����ͺ��̽����� DML�� ���� ������ ���� row�� �����̴�. ���� 0�̸� INSERT�� �ȵƴٴ� ��, 1�̸� ���������� ó���ƴٴ� ��
		if(count == 1) System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		DBClose.close(conn);    //6
	}
}
