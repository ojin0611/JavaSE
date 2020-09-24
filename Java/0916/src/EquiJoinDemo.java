import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

//�����ȣ, �̸�, �޿�, �ٹ� �μ��� �Բ� ����ϵ� �޿��� 3000 �̻��� �����͸� ����Ͻÿ�.
public class EquiJoinDemo {
	public static void main(String[] args) throws SQLException{
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.getConnection();    //2, 3
		//System.out.println(conn);
		//String sql = "  SELECT e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc" + 
		//                  "  FROM    emp  e,  dept  d " +
		//		          "  WHERE  e.deptno = d.deptno AND e.sal >= 3000  ";  //��ǥ�� Equi Join, Inner Join, Simple Join
		//String sql = "  SELECT e.empno, e.ename, e.sal, deptno, d.dname, d.loc" +
		//                   "   FROM   emp e  NATURAL JOIN   dept d  " + 
		//		           "   WHERE e.sal >= 3000";   //ǥ�� NATURAL JOIN
		//NATURAL JOIN ���� ����� Į��(���� ����)���� �ĺ��� ��, ���̺� �̸��̳� ���̺� ��Ī�� ����� �� ����.
		String sql = "  SELECT e.empno, e.ename, e.sal, deptno, d.dname, d.loc" +
		                  "  FROM emp e INNER JOIN dept d  USING(deptno)  " + 
		                  "   WHERE e.sal >= 3000";   //ǥ�� JOIN ~ USING
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
