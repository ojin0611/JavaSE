import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.example.libs.DBClose;
import com.example.libs.DBConnection;

public class SungjukMgmt {
	private Scanner scan;
	private Connection conn;
	
	public SungjukMgmt() { //Constructor
		this.scan = new Scanner(System.in);
		DBConnection dbconn = new DBConnection();
		this.conn = dbconn.getConnection();
		//System.out.println("��� ��ü�� �����ƽ��ϴ�.");
	}
	
	@Override
	protected void finalize() {  //�Ҹ���
		System.out.println("���α׷��� �̿��� �ּż� �����մϴ�.");
		DBClose.close(this.conn);
	}
	
	public static void main(String[] args) throws SQLException{
		SungjukMgmt sm = new SungjukMgmt(); //������ ȣ��
		while(true) {
			int choice = sm.showMenu();
			if(choice == 9) break;
			if(choice >= 1 && choice <= 5) 	sm.process(choice);
		}
		sm = null;
		System.gc();	
	}
	
	private int showMenu() {
		System.out.println("\n9. �����ϱ�           1. ��� ����            2. �˻��ϱ�                3. �߰��ϱ�                4. �����ϱ�                 5. �����ϱ�");
		System.out.print("���� >> ");
		return this.scan.nextInt();
	}
	
	private void process(int choice) throws SQLException {//1���� 5������
		switch(choice) {
			case 1 :  selectAll();   break;
			case 2 :  break;
			case 3 :  insert();       break;
			case 4 :  update();     break;
			case 5 :  break;
		}
	}
	
	private void update() throws SQLException {
		System.out.print("������ �л��� �й� : ");                 String hakbun = this.scan.next();
		String sql = "SELECT kor, eng, mat  FROM  Student   WHERE hakbun = ?";    //�ҿ����� SQL����
		PreparedStatement pstmt = this.conn.prepareStatement(sql);         //4. �������� �ҿ����� SQL����
		pstmt.setString(1, hakbun);  //��μ� ������ SQL����.
		ResultSet rs = pstmt.executeQuery();            //5. ���� �߿��ϴ�. �Ķ���Ϳ� sql�� ���� ����.
		rs.next();   //6. ResultSet�� ����ִ� ���ڵ� �Ѱ� �о���.
		int kor = rs.getInt("kor");                 int eng = rs.getInt("eng");             int mat = rs.getInt("mat");
		
		int tot = kor + eng + mat;
		double avg = tot / 3.;
		String grade = (avg >= 90) ? "A" : 
			                           (avg >= 80) ? "B" :
			                        	    (avg >= 70) ? "C" :
			                        	    	(avg >= 60) ? "D" : "F";
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		
		sql = "UPDATE Student SET tot = ?, avg = ?, grade = ? WHERE hakbun = ?";  //�ҿ����� SQL����
		pstmt = this.conn.prepareStatement(sql);            //�������� �ҿ����� SQL����
		pstmt.setInt(1, tot);          pstmt.setDouble(2, avg);           
		pstmt.setString(3, grade);       pstmt.setString(4, hakbun);   //��μ� ������ SQL����
		
		int row = pstmt.executeUpdate();   //���� ���� ��������. �Ķ���Ϳ� sql ���� ����.
		if(row == 1) System.out.println("Update Success");
		else System.out.println("Update Failure");
		
		if(pstmt != null) pstmt.close();
	}
	
	private void insert() throws SQLException {
		System.out.print("�й� : ");    String hakbun = this.scan.next();
		System.out.print("�̸� : ");    String name = this.scan.next();
		System.out.print("���� : ");    int kor = this.scan.nextInt();
		System.out.print("���� : ");    int eng = this.scan.nextInt();
		System.out.print("���� : ");    int mat = this.scan.nextInt();
		
		//�ҿ����� SQL�� �����
		String sql = "INSERT INTO Student(hakbun, name, kor, eng, mat) VALUES(?, ?, ?, ?, ?)";
		PreparedStatement pstmt = this.conn.prepareStatement(sql);   //4. �������� �ҿ����� SQL����
		pstmt.setString(1, hakbun);        pstmt.setString(2, name);
		pstmt.setInt(3, kor);                pstmt.setInt(4, eng);                 pstmt.setInt(5, mat);   //��μ� ���⼭ ������ SQL����
		int row = pstmt.executeUpdate();     //5. ���� ��������....�Ķ���Ϳ� sql ���� ����.
		if(row == 1)  System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		
		if(pstmt != null) pstmt.close();
	}
	
	private void selectAll() throws SQLException {
		Statement stmt = this.conn.createStatement();   //4.
		String sql = "SELECT * FROM Student  ORDER BY tot DESC";
		ResultSet rs = stmt.executeQuery(sql);                //5
		
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("------------------------------------------------------");
		while(rs.next()) {                                              //6
			String hakbun = rs.getString("hakbun");
			String name = rs.getString("name");
			int kor = rs.getInt("kor");
			int eng = rs.getInt("eng");
			int mat = rs.getInt("mat");
			int tot = rs.getInt("tot");
			double avg = rs.getDouble("avg");
			String grade = rs.getString("grade");
			System.out.println(hakbun + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg + "\t" + grade);
		}
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
	}
	
	
	
	
}
