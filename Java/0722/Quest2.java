/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

import java.util.Scanner;
public class Quest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String studentId;
		String name;
		int kor;
		int eng;
		int mat;

		System.out.print("학번 : ");
		studentId = scan.nextLine();

		System.out.print("이름 : ");
		name = scan.nextLine();

		System.out.print("국어 : ");
		kor = scan.nextInt();

		System.out.print("영어 : ");
		eng = scan.nextInt();

		System.out.print("수학 : ");
		mat = scan.nextInt();

		int total = kor + eng + mat;
		double avg = total / 3.;
		char grade = (avg >= 90) ? 'A':
						(avg >= 80) ? 'B' :
							(avg >= 70) ? 'C' :
								(avg >= 60) ? 'D' : 'F';

		System.out.println("-----------------------------------------");
		System.out.printf("<<%s(%s)의 성적표\n", name, studentId);
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.2f, 평점 : %c",
			kor, eng, mat, total, avg, grade);

	}
}
