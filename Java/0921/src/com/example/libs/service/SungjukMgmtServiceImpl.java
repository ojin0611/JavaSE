package com.example.libs.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.example.libs.model.SungjukMgmtDao;
import com.example.libs.model.SungjukMgmtDaoImpl;
import com.example.libs.vo.StudentVO;

public class SungjukMgmtServiceImpl implements SungjukMgmtService {
	private SungjukMgmtDao dao; //interface
	
	public SungjukMgmtServiceImpl() {  //생성자
		this.dao = new SungjukMgmtDaoImpl();
	}
	
	@Override
	public int create(StudentVO student) {  //입력서비스
		int row = 0;
		try {
			row = this.dao.insert(student);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return row;
	}

	@Override
	public StudentVO read(String hakbun) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<StudentVO> readAll() {  //나 서비스는 Model을 부른다.
		//모든 학생 가져오기
		ArrayList<StudentVO> list = null;   //지역변수는 반드시 초기화해야 한다.
		try {
			list = this.dao.selectAll();
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return list;
	}

	@Override
	public int update(StudentVO student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String hakbun) {
		// TODO Auto-generated method stub
		return 0;
	}

}
