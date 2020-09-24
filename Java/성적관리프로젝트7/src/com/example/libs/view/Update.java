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
		System.out.print("수정할 학생의 학번 : ");    
		String hakbun = this.scan.next();
		StudentVO student = this.service.read(hakbun);
		
		if(student == null) {
			System.out.println("수정하려는 학생을 찾지 못했습니다. 확인 후 다시 검색해 주세요.");
			return;  //학생을 못찾았으니까 바로 리턴
		}else { //수정하려는 학생을 찾았다면
			System.out.println("<<수정하지 않으려면 그냥 동일한 값을 넣어주시고, 수정하려면 수정할 값을 넣어주세요>>");
			System.out.println(student.getHakbun() + "[" + student.getName() + "]");
			System.out.print("국어(" + student.getKor() + ") : ");
			int kor = this.scan.nextInt();
			System.out.print("영어(" + student.getEng() + ") : ");
			int eng = this.scan.nextInt();
			System.out.print("수학(" + student.getMat() + ") : ");
			int mat = this.scan.nextInt();
			Calc calc = new Calc();
			student.setKor(kor);  //수정된 국어 점수 설정
			student.setEng(eng);  //수정된 영어 점수 설정
			student.setMat(mat);  //수정된 수학 점수 설정
			calc.calc(student);    //갔다오면 성적이 재 산정됐을 것이다.
			
			int row = this.service.update(student);//수정한 학생을 서비스로 보내면 서비스는 나에게 변경된 행 갯수를 넘겨준다.
			if(row == 1) System.out.println("수정 성공");
			else System.out.println("수정 실패");
		}
	}
}








