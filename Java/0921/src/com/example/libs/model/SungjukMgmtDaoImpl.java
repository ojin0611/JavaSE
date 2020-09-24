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
		// TODO Auto-generated method stub
		return null;
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
			
		}
		DBClose.close(conn);   //7
		return list;
	}

	@Override
	public int update(StudentVO student) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String hakbun) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
