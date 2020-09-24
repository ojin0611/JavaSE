import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class InsertDemo1 {
	public static void main(String[] args) throws SQLException{
		Scanner scan = new Scanner(System.in);
		System.out.print("사원 번호 : ");        int empno = scan.nextInt();
		System.out.print("사원의 이름 : ");      String ename = scan.next();
		System.out.print("직무 : ");             String job = scan.next();
		
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.getConnection();   //2,3
		
		String sql = " INSERT INTO emp_copy(empno, ename, job, hiredate) " +
		                  " VALUES(?, ?, ?, SYSDATE)";   //불완전한 SQL 문장
		PreparedStatement pstmt = conn.prepareStatement(sql);   //4. 여전히 불완전한 SQL문장, 문법 검사, 개체검사가 일어난다.
		pstmt.setInt(1, empno);
		pstmt.setString(2, ename);
		pstmt.setString(3, job);     //여기서 비로소 완전한 SQL문장이 됐다.
		
		int count = pstmt.executeUpdate();    //5. 아주 주의하자. 파라미터에 sql을 넣지 말자.
		if(count == 1) System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		DBClose.close(conn, pstmt);    //6
	}
}
