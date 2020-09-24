import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class PreparedStatementDemo1 {
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.print("찾으려는 사원의 이름 : ");
		String name = scan.next();  
		
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.getConnection();    //2,3
		
		//이름이 ~~~인 사원의 부서명을 출력하라.
		String sql = "   SELECT  ename, dname " + 
		                  "   FROM   emp  INNER JOIN  dept  ON  emp.deptno = dept.deptno " +
				          "   WHERE   ename = UPPER(?)";   //불완전한 SQL 문장
		
		PreparedStatement pstmt = conn.prepareStatement(sql);    //4. 아직까지 불완전한 SQL문장, But, 문법검사, 개체검사는 한다.
		pstmt.setString(1,  name);  //비로소 완전한 SQL문장이 됐다.
		
		ResultSet rs = pstmt.executeQuery();          //5. 주의하자.  파라미터에 sql을 넣지 말자.
		boolean flag = rs.next();   //6. 굳이 루프를 돌 필요가 없다. 왜나하면 현재 동일한 이름이 없으니까
		//찾았으면 flag는 true, 못찾았다면 false
		if(flag) {  //찾았다면
			String ename = rs.getString("ename");
			String dname = rs.getString("dname");
			System.out.println(ename + "\t" + dname);
		}else {  //못찾았다면
			System.out.println("찾으시는 사원을 못 찾았습니다. 다시 실행해 주세요. ");
		}
		
		DBClose.close(conn, pstmt, rs);                                     //7
	}
}
