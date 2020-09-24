package com.example.libs.view;

import java.util.Scanner;

import com.example.libs.service.SungjukMgmtService;
import com.example.libs.service.SungjukMgmtServiceImpl;

public class Delete {
	private Scanner scan;
	private SungjukMgmtService service;
	
	public Delete(Scanner scan) {
		this.scan = scan;
		this.service = new SungjukMgmtServiceImpl();
	}
	
	public void delete() {
		System.out.print("������ �л��� �й� : ");   
		String hakbun = this.scan.next();
		int row = this.service.delete(hakbun);
		if(row == 1) System.out.println("�л� ���� ����");
		else System.out.println("�л� ���� ����");
	}
}
