package com.example.libs.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.example.libs.vo.StudentVO;

public class SungjukMgmtDaoImpl implements SungjukMgmtDao {
	private DBConnection dbconn;
	
	public SungjukMgmtDaoImpl() {  //������
		this.dbconn = new DBConnection();
	}
	
	@Override
	public int insert(StudentVO student) throws SQLException {
		Connection conn = this.dbconn.getConnection();  //2, 3
		String sql = "INSERT INTO Student VALUES(?,?,?,?,?,?,?,?)";  //�ҿ����� SQL��
		PreparedStatement pstmt = conn.prepareStatement(sql);    //4. �������� �ҿ����� SQL��
		pstmt.setString(1, student.getHakbun());
		pstmt.setString(2, student.getName());
		pstmt.setInt(3, student.getKor());
		pstmt.setInt(4, student.getEng());
		pstmt.setInt(5, student.getMat());
		pstmt.setInt(6, student.getTot());
		pstmt.setDouble(7, student.getAvg());
		pstmt.setString(8, student.getGrade());  //��μ� ������ SQL����
		int row = pstmt.executeUpdate();   //���� ��������. �Ķ���Ϳ� sql�� ���� ����.
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);   //6.
		return row;
	}

	@Override
	public StudentVO select(String hakbun) throws SQLException {
		Connection conn = this.dbconn.getConnection();  //2, 3
		String sql = "SELECT * FROM Student WHERE hakbun = ?";  //�ҿ����� SQL��
		PreparedStatement pstmt = conn.prepareStatement(sql);  //4. �������� �ҿ����� SQL��
		pstmt.setString(1, hakbun);  //��μ� ������ SQL����
		ResultSet rs = pstmt.executeQuery();  //5. ���� ���� ����. �Ķ���Ϳ� sql�� �ѱ��� ����.
		//�⺻Ű�� �˻��߱� ������ ã������ �� ��, ��ã���� NULL
		StudentVO student = null;
		if(rs.next()) {  //6. ResultSet�� ���ڵ尡 �Ѱ� �ִٸ�, ã�Ҵ�
			String name = rs.getString("name");
			int kor = rs.getInt("kor");
			int eng = rs.getInt("eng");
			int mat = rs.getInt("mat");
			int tot = rs.getInt("tot");
			double avg = rs.getDouble("avg");
			String grade = rs.getString("grade");
			student = new StudentVO(hakbun, name, kor, eng, mat);
			student.setTot(tot);  student.setAvg(avg);   student.setGrade(grade);
		}else { //ResultSet�� ����� �ִٸ�, ��ã�Ҵ�.
			student = null;
		}
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);   //7
		return student;
	}

	@Override
	public ArrayList<StudentVO> selectAll() throws SQLException {
		Connection conn = this.dbconn.getConnection();  //2, 3
		//if(this.dbconn == null) System.out.println("Null �´�.");
		//else System.out.println("NUll�� �ƴϴ�.");
		Statement stmt = conn.createStatement();   //4
		String sql = "SELECT * FROM Student ORDER BY tot DESC";
		ResultSet rs = stmt.executeQuery(sql);        //5
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();  //10���� ���� �����ȴ�.
		if(!rs.next()) {  //�л��� �� �� ���ٸ�
			list = null;
		}else {  //�л��� �� ���̶� �ִٸ�
			//�߿��� ���� �̹� �ѹ� next()�� �ߴٴ� ���̴�. �� ù��° �л��� �о��ٴ� ���̴�.
			do {//�̹� �ѹ� next()�� �����ϱ�, 6��
				String hakbun = rs.getString("hakbun");
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int mat = rs.getInt("mat");
				int tot = rs.getInt("tot");
				double avg = rs.getDouble("avg");
				String grade = rs.getString("grade");
				StudentVO student = new StudentVO(hakbun, name, kor, eng, mat);
				student.setTot(tot);   student.setAvg(avg);    student.setGrade(grade);
				list.add(student); //�����ξ� list�� �����. �ι�° �������� �����. ���������� �����ξ� �����.
			}while(rs.next());  //�ٸ� �л��� �ִٸ� �ٽ� ���� ����.
		}
		DBClose.close(conn);   //7
		return list;  //3���� �л��� ����ִ�.
	}

	@Override
	public int update(StudentVO student) throws SQLException {
		Connection conn = this.dbconn.getConnection();   //2, 3
		String sql = "UPDATE Student SET kor = ?, eng = ?, mat = ?, tot = ?, avg = ?, grade = ? WHERE hakbun = ?";
		//�ҿ����� SQL ����
		PreparedStatement pstmt = conn.prepareStatement(sql);   //4. �������� �ҿ����� SQL����
		pstmt.setInt(1, student.getKor());
		pstmt.setInt(2, student.getEng());
		pstmt.setInt(3, student.getMat());
		pstmt.setInt(4, student.getTot());
		pstmt.setDouble(5, student.getAvg());
		pstmt.setString(6, student.getGrade());
		pstmt.setString(7, student.getHakbun());  //��μ� ������ SQL����
		int row = pstmt.executeUpdate();   //5. ���� ���� ��������. �Ķ���ͷ� sql�� �ѱ��� ����.
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);    //6
		return row;
	}

	@Override
	public int delete(String hakbun) throws SQLException {  //������ DB�� �پ �����ϴ� �޼ҵ�
		Connection conn = this.dbconn.getConnection();   //2, 3
		String sql = "DELETE FROM Student WHERE hakbun = ?";   //�ҿ����� SQL��
		PreparedStatement pstmt = conn.prepareStatement(sql);   //4. �������� �ҿ����� SQL��
		pstmt.setString(1, hakbun);  //��μ� ������ SQL����
		int row = pstmt.executeUpdate();   //5. �ſ� ��������. �Ķ���Ϳ� sql�� �ѱ��� ����.
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);    //6
		return row;
	}

}
