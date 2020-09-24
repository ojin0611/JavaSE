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
		int count = stmt.executeUpdate(sql);           //5. 매우 주의하자.  SELECT(executeQuery())를 제외한 나머지 SQL는 executeUpdate()를 사용한다.
		//이때 반환받은 count는 데이터베이스에서 DML에 의해 영향을 받은 row의 갯수이다. 만일 0이면 INSERT가 안됐다는 뜻, 1이면 정상적으로 처리됐다는 뜻
		if(count == 1) System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		DBClose.close(conn);    //6
	}
}
