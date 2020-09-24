package com.example.libs.model;

import java.sql.SQLException;
import java.util.ArrayList;

import com.example.libs.vo.StudentVO;

public interface SungjukMgmtDao {
	int insert(StudentVO student) throws SQLException ;
	//�Է��� �л��� �Ķ���ͷ� ������ �����ͺ��̽��� ������ insert�� �ϰ� �� �� ������ ��ȯ�Ѵ�.
	
	StudentVO select(String hakbun) throws SQLException ;
	//�˻��� �л��� �й��� �Ķ���ͷ� ������ �� �л��� ������ Database���� ã�� �� �� �л��� ��ȯ�Ѵ�.
	
	ArrayList<StudentVO> selectAll() throws SQLException ;
	//��� �л��� ������ �����ͺ��̽����� �˻��� �л����� �÷��ǿ� ��Ƽ� ��ȯ�Ѵ�.
	
	int update(StudentVO student) throws SQLException ;
	//������ �л��� �Ķ���ͷ� �޾Ƽ� ������ �����ͺ��̽����� ������ ���� �� ������ ��ȯ�Ѵ�.
	
	int delete(String hakbun) throws SQLException ;
	//������ �л��� ��ȣ�� �Ķ���ͷ� ���� �� ,������ �����ͺ��̽����� ���� ��, �� �� ������ ��ȯ�Ѵ�.
}
