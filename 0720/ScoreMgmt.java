/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : OS, Version, Editor
*/
import java.util.Scanner;

public class ScoreMgmt {
	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);

		String id;
		String name;
		int korean;
		int english;
		int math;

		System.out.print("학번 : ");
		id = scan.nextLine();

		System.out.print("이름 : ");
		name = scan.nextLine();

		System.out.print("국어 : ");
		korean = scan.nextInt();

		System.out.print("영어 : ");
		english = scan.nextInt();

		System.out.print("수학 : ");
		math = scan.nextInt();
		
		System.out.printf("\n학번 : %s\n이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n",
			id, name, korean, english, math);

		int sum = korean + english + math;

		System.out.printf("총첨 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", sum/3.0); // 정수와 실수를 연산하면 결과가 실수가 된다.
	}
}
