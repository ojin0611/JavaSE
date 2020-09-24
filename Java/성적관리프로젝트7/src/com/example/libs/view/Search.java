package com.example.libs.view;

import java.util.Scanner;

import com.example.libs.service.SungjukMgmtService;
import com.example.libs.service.SungjukMgmtServiceImpl;
import com.example.libs.vo.StudentVO;

public class Search {
	private Scanner scan;
	private SungjukMgmtService service;
	
	public Search(Scanner scan) {
		this.scan = scan;
		this.service = new SungjukMgmtServiceImpl();
	}

	public void search() {
		System.out.print("ã������ �л��� �й� : ");
		String hakbun = this.scan.next();
		StudentVO student = this.service.read(hakbun);//ã�Ҵٸ� �л���, ��ã�Ҵٸ� null
		if(student == null) System.out.println("ã���ô� �л��� �����ϴ�. Ȯ�� �� �ٽ� �˻��� �ּ���.");
		else System.out.println(student);   //student.toString();
	}
}
