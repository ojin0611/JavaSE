/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
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

		System.out.print("�й� : ");
		studentId = scan.nextLine();

		System.out.print("�̸� : ");
		name = scan.nextLine();

		System.out.print("���� : ");
		kor = scan.nextInt();

		System.out.print("���� : ");
		eng = scan.nextInt();

		System.out.print("���� : ");
		mat = scan.nextInt();

		int total = kor + eng + mat;
		double avg = total / 3.;
		char grade = (avg >= 90) ? 'A':
						(avg >= 80) ? 'B' :
							(avg >= 70) ? 'C' :
								(avg >= 60) ? 'D' : 'F';

		System.out.println("-----------------------------------------");
		System.out.printf("<<%s(%s)�� ����ǥ\n", name, studentId);
		System.out.printf("���� : %d, ���� : %d, ���� : %d, ���� : %d, ��� : %.2f, ���� : %c",
			kor, eng, mat, total, avg, grade);

	}
}
