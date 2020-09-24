package com.example.libs.view;

import java.util.ArrayList;

import com.example.libs.service.SungjukMgmtService;
import com.example.libs.service.SungjukMgmtServiceImpl;
import com.example.libs.vo.StudentVO;

public class Output { //���� Front-end�ϱ� Model�� ���� �������� �ʰ�, ���񽺸� �θ���. 
	private SungjukMgmtService service;
	
	public Output() {   //������
		this.service = new SungjukMgmtServiceImpl();//�ڽ��� �θ�� ����ȯ�Ѵ�.
	}
	
	public void output() {
		ArrayList<StudentVO> list = this.service.readAll();
		//�л��� �Ѹ��̶� �ְų� �ƿ� ���ų�
		if(list == null) System.out.println("�Էµ� �л��� �����ϴ�.");
		else {  //�л��� �Ѹ��̶� �ִٸ�
			printLabel();
			for(int i = 0 ; i < list.size() ; i++) {
				//System.out.println(list.get(i));   //�л�.toString()
				StudentVO student = list.get(i);
				System.out.println(student);      //�л�.toString()
			}
		}
	}
	private void printLabel() {
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("------------------------------------------------------------------");
	}
}
