package com.example.libs.view;

import java.util.Scanner;

import com.example.libs.service.Calc;
import com.example.libs.service.SungjukMgmtService;
import com.example.libs.service.SungjukMgmtServiceImpl;
import com.example.libs.vo.StudentVO;

public class Input {
	private Scanner scan;
	private SungjukMgmtService service;
	
	public Input(Scanner scan) {  //������
		this.scan = scan;
		this.service = new SungjukMgmtServiceImpl();
	}
	
	public void input() {
		System.out.print("�й� : ");  String hakbun = this.scan.next();
		System.out.print("�̸� : ");  String name = this.scan.next();
		System.out.print("���� : ");  int kor = this.scan.nextInt();
		System.out.print("���� : ");  int eng = this.scan.nextInt();
		System.out.print("���� : ");  int mat = this.scan.nextInt();
		StudentVO student = new StudentVO(hakbun, name, kor, eng, mat);
		Calc calc = new Calc();
		calc.calc(student);  //����ϰ� ����.
		int row = this.service.create(student);   //�Է��� �л� ������
		if(row == 1) System.out.println("�л� �Է� ����");
		else System.out.println("�л� �Է� ����");
	}
}
