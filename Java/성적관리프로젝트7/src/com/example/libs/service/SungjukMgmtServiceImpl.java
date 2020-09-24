package com.example.libs.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.example.libs.model.SungjukMgmtDao;
import com.example.libs.model.SungjukMgmtDaoImpl;
import com.example.libs.vo.StudentVO;

public class SungjukMgmtServiceImpl implements SungjukMgmtService {
	private SungjukMgmtDao dao; //interface
	
	public SungjukMgmtServiceImpl() {  //������
		this.dao = new SungjukMgmtDaoImpl();
	}
	
	@Override
	public int create(StudentVO student) {  //�Է¼���
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
		//���� UI���� ã�� �л��� �й��� �Ѱܹ޾Ƽ�, �� ���� dao����  �Ѱ��ָ�, dao�� null �Ǵ� ã�� �л��� �Ѱ��ָ� �� �л��� �� ���� UI���� ��ȯ�ϸ� ��.
		StudentVO student = null;  //���������ϱ� �ʱ�ȭ
		try {
			student = this.dao.select(hakbun);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return student;
	}

	@Override
	public ArrayList<StudentVO> readAll() {  //�� ���񽺴� Model�� �θ���.
		//��� �л� ��������
		ArrayList<StudentVO> list = null;   //���������� �ݵ�� �ʱ�ȭ�ؾ� �Ѵ�.
		try {
			list = this.dao.selectAll();
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return list;//null�� �����ϰų� �Ѹ��̶� ����ִ� list�� �����ϰų�
	}

	@Override
	public int update(StudentVO student) {
		//���� UI���� ������ �л��� �Ѱܹް�, �� ���� DAO���� �Ѱ��ָ�, dao�� ������ ������ �� ������ �Ѱ��ְ� ���� �װ��� �ٽ� UI���� �Ѱ��ָ� ��.
		int row = 0 ;  //���������ϱ� �ʱ�ȭ
		try {
			row = this.dao.update(student);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return row;  //������ �����ߴٸ� 1, �����ߴٸ� 0
	}

	@Override
	public int delete(String hakbun) {  //UI���� �Ѿ�� �й��� �� ���� dao���� �Ѱ��ְ� ������ �� ������ �Ѱܹ޾Ƽ� �ٽ� �տ� �ִ� UI���� �Ѱ��ָ� ��.
		int row = 0;   //���������ϱ� �ʱ�ȭ
		try {
			row = this.dao.delete(hakbun);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return row;
	}

}
