import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class JDBCDemo1 {
	private Scanner scan;
	private Connection conn;
	
	public JDBCDemo1() {  //������
		this.scan = new Scanner(System.in);
		DBConnection dbconn = new DBConnection();
		this.conn = dbconn.getConnection();  //2, 3
	}
	
	public static void main(String[] args) throws SQLException {
		JDBCDemo1 jd = new JDBCDemo1();
		int choice = jd.showMenu();
		jd.process(choice);
	}
	void process(int choice) throws SQLException {
		switch(choice) {
			case 9 :   System.out.println("Bye");  DBClose.close(this.conn);   System.exit(0);   break;
			case 1 :   selectAll() ;    break;
			case 2 :   
			case 3 :   
			case 4 :   selectWhere(choice);  break;
		}
	}
	void selectWhere(int choice) throws SQLException {   //���� �˻�
		String sql = "SELECT * FROM emp ";
		String where = null;  //���������� �ʱⰪ�� �ʿ��ϴ�.
		switch(choice) {   //2,3,4
			case 2 : 
				System.out.print("ã���� �Ͻô� ����� �̸� : ");
				String name = this.scan.next().toUpperCase();   //SMITH
				where = "  WHERE UPPER(ename) = '" + name + "' ";
				break;
			case 3 :
				System.out.print("ã���� �Ͻô� �μ���ȣ : ");
				int deptno = this.scan.nextInt();   //10
				where = "  WHERE deptno = " + deptno;
				break;
			case 4 :
				System.out.print("ã���� �Ͻô� ����� �Ի�⵵ : ");
				String hiredate = this.scan.next();    //"1987"
				where = "  WHERE TO_CHAR(hiredate, 'YYYY') = '" + hiredate + "' ";
				break;
		}
		sql += where;
		//System.out.println("sql = " + sql);
		Statement stmt = this.conn.createStatement();  //4
		ResultSet rs = stmt.executeQuery(sql);   //5
		while(rs.next()) {    //6
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			double sal = rs.getDouble("sal");
			Date hiredate = rs.getDate("hiredate");
			int deptno = rs.getInt("deptno");
			System.out.println(empno + "\t" + ename + "\t" + sal + "\t" + hiredate + "\t" + deptno);
		}
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
	}
	void selectAll() throws SQLException{    //��� ����
		Statement stmt = this.conn.createStatement();   //4. step
		String sql = "SELECT * FROM emp ORDER BY empno ASC";
		ResultSet rs = stmt.executeQuery(sql);   //5. 
		while(rs.next()) {
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			double sal = rs.getDouble("sal");
			Date hiredate = rs.getDate("hiredate");
			System.out.println(empno + "\t" + ename + "\t" + sal + "\t" + hiredate);
		}
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
	}
	int showMenu(){  //member method
		System.out.println("*****Menu*****");
		System.out.println("1. ��� ����");
		System.out.println("2. ����� �̸����� �˻��ϱ�");
		System.out.println("3. �μ� ��ȣ�� �˻��ϱ�");
		System.out.println("4. �Ի�⵵�� �˻��ϱ�");
		System.out.println("9. ����");
		System.out.print("���� >> ");
		return this.scan.nextInt();
	}
}
