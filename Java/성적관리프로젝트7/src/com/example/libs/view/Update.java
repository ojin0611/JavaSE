package com.example.libs.view;

import java.util.Scanner;

import com.example.libs.service.Calc;
import com.example.libs.service.SungjukMgmtService;
import com.example.libs.service.SungjukMgmtServiceImpl;
import com.example.libs.vo.StudentVO;

public class Update {
	private Scanner scan;
	private SungjukMgmtService service;
	
	public Update(Scanner scan) {
		this.scan = scan;
		this.service = new SungjukMgmtServiceImpl();
	}

	public void update() {
		System.out.print("������ �л��� �й� : ");    
		String hakbun = this.scan.next();
		StudentVO student = this.service.read(hakbun);
		
		if(student == null) {
			System.out.println("�����Ϸ��� �л��� ã�� ���߽��ϴ�. Ȯ�� �� �ٽ� �˻��� �ּ���.");
			return;  //�л��� ��ã�����ϱ� �ٷ� ����
		}else { //�����Ϸ��� �л��� ã�Ҵٸ�
			System.out.println("<<�������� �������� �׳� ������ ���� �־��ֽð�, �����Ϸ��� ������ ���� �־��ּ���>>");
			System.out.println(student.getHakbun() + "[" + student.getName() + "]");
			System.out.print("����(" + student.getKor() + ") : ");
			int kor = this.scan.nextInt();
			System.out.print("����(" + student.getEng() + ") : ");
			int eng = this.scan.nextInt();
			System.out.print("����(" + student.getMat() + ") : ");
			int mat = this.scan.nextInt();
			Calc calc = new Calc();
			student.setKor(kor);  //������ ���� ���� ����
			student.setEng(eng);  //������ ���� ���� ����
			student.setMat(mat);  //������ ���� ���� ����
			calc.calc(student);    //���ٿ��� ������ �� �������� ���̴�.
			
			int row = this.service.update(student);//������ �л��� ���񽺷� ������ ���񽺴� ������ ����� �� ������ �Ѱ��ش�.
			if(row == 1) System.out.println("���� ����");
			else System.out.println("���� ����");
		}
	}
}








