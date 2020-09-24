import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

//사원번호, 이름, 급여, 근무 부서를 함께 출력하되 급여가 3000 이상인 데이터만 출력하시오.
public class EquiJoinDemo {
	public static void main(String[] args) throws SQLException{
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.getConnection();    //2, 3
		//System.out.println(conn);
		//String sql = "  SELECT e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc" + 
		//                  "  FROM    emp  e,  dept  d " +
		//		          "  WHERE  e.deptno = d.deptno AND e.sal >= 3000  ";  //비표준 Equi Join, Inner Join, Simple Join
		//String sql = "  SELECT e.empno, e.ename, e.sal, deptno, d.dname, d.loc" +
		//                   "   FROM   emp e  NATURAL JOIN   dept d  " + 
		//		           "   WHERE e.sal >= 3000";   //표준 NATURAL JOIN
		//NATURAL JOIN 사용시 공통된 칼럼(조인 조건)에는 식별자 즉, 테이블 이름이나 테이블 별칭을 사용할 수 없다.
		String sql = "  SELECT e.empno, e.ename, e.sal, deptno, d.dname, d.loc" +
		                  "  FROM emp e INNER JOIN dept d  USING(deptno)  " + 
		                  "   WHERE e.sal >= 3000";   //표준 JOIN ~ USING
		Statement stmt = conn.createStatement();    //4
		ResultSet rs = stmt.executeQuery(sql);         //5
		int count = 0;
		while(rs.next()) {                                       //6
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			double sal = rs.getDouble(3);
			int deptno = rs.getInt(4);
			String dname = rs.getString(5);
			String loc = rs.getString(6);
			System.out.println(++count + " : " + empno + "\t" + ename + "\t" + sal + "\t" + deptno + "\t" + dname + "\t" + loc);
		}
		DBClose.close(conn);                                     //7
	}
}
