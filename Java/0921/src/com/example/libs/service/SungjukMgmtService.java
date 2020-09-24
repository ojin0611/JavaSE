package com.example.libs.service;

import java.util.ArrayList;

import com.example.libs.vo.StudentVO;

public interface SungjukMgmtService {
	int create(StudentVO student);   
	//INSERT�� �л��� �Ķ���ͷ� �Ѱ��ָ� �����ͺ��̽����� ���� �� �Է��� row ������ ��ȯ�Ѵ�.
	
	StudentVO read(String hakbun);
	//�˻��� �л��� �й��� �Ķ���ͷ� �Ѱ��ָ� �� �л��� ã�Ƽ� �л� ��ü�� ��ȯ�Ѵ�. ���� ã������ �л��� ������ null�� ��ȯ�Ѵ�.
	
	ArrayList<StudentVO> readAll();
	//��� �л��� ã�Ƽ� �÷��ǿ� �ְ� �� �÷��� °�� ��ȯ�Ѵ�. ���� �л��� �Ѹ� ������ null�� ��ȯ�Ѵ�.
	
	int update(StudentVO student);
	//�����Ϸ��� �л���ü�� �Ķ���ͷ� �Ѱ��ָ�, �� �л��� �����ͺ��̽����� ������ ���� ������ �� ������ ��ȯ�Ѵ�.
	
	int delete(String hakbun);
	//�����Ϸ��� �л��� �й��� �Ķ���ͷ� �Ѱ��ָ�, �� �л��� �����ͺ��̽��� ������ ����, ������ �� ������ ��ȯ�Ѵ�.
}
