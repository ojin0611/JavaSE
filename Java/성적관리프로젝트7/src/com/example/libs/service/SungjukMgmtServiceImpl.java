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
		//나는 UI에서 찾을 학생의 학번을 넘겨받아서, 내 뒤의 dao에게  넘겨주면, dao가 null 또는 찾은 학생을 넘겨주면 그 학생을 내 앞의 UI에게 반환하면 끝.
		StudentVO student = null;  //지역변수니까 초기화
		try {
			student = this.dao.select(hakbun);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return student;
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
		return list;//null을 리턴하거나 한명이라도 들어있는 list를 리턴하거나
	}

	@Override
	public int update(StudentVO student) {
		//나는 UI에서 수정한 학생을 넘겨받고, 내 뒤의 DAO에게 넘겨주면, dao는 나에게 수정한 열 갯수를 넘겨주고 나는 그것을 다시 UI에게 넘겨주면 끝.
		int row = 0 ;  //지역변수니까 초기화
		try {
			row = this.dao.update(student);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return row;  //수정에 성공했다면 1, 실패했다면 0
	}

	@Override
	public int delete(String hakbun) {  //UI에서 넘어온 학번을 내 뒤의 dao에게 넘겨주고 삭제된 행 갯수를 넘겨받아서 다시 앞에 있는 UI에게 넘겨주면 끝.
		int row = 0;   //지역변수니까 초기화
		try {
			row = this.dao.delete(hakbun);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return row;
	}

}
