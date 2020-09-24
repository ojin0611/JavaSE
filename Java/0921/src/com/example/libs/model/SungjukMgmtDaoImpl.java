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
	
	public SungjukMgmtDaoImpl() {  //생성자
		this.dbconn = new DBConnection();
	}
	
	@Override
	public int insert(StudentVO student) throws SQLException {
		Connection conn = this.dbconn.getConnection();  //2, 3
		String sql = "INSERT INTO Student VALUES(?,?,?,?,?,?,?,?)";  //불완전한 SQL문
		PreparedStatement pstmt = conn.prepareStatement(sql);    //4. 아직까지 불완전한 SQL문
		pstmt.setString(1, student.getHakbun());
		pstmt.setString(2, student.getName());
		pstmt.setInt(3, student.getKor());
		pstmt.setInt(4, student.getEng());
		pstmt.setInt(5, student.getMat());
		pstmt.setInt(6, student.getTot());
		pstmt.setDouble(7, student.getAvg());
		pstmt.setString(8, student.getGrade());  //비로소 완전한 SQL문장
		int row = pstmt.executeUpdate();   //아주 주의하자. 파라미터에 sql을 넣지 말자.
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
		//if(this.dbconn == null) System.out.println("Null 맞다.");
		//else System.out.println("NUll이 아니다.");
		Statement stmt = conn.createStatement();   //4
		String sql = "SELECT * FROM Student ORDER BY tot DESC";
		ResultSet rs = stmt.executeQuery(sql);        //5
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();  //10개의 방이 생성된다.
		if(!rs.next()) {  //학생이 한 명도 없다면
			list = null;
		}else {  //학생이 한 명이라도 있다면
			
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
