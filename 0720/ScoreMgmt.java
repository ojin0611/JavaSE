/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : OS, Version, Editor
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

		System.out.print("�й� : ");
		id = scan.nextLine();

		System.out.print("�̸� : ");
		name = scan.nextLine();

		System.out.print("���� : ");
		korean = scan.nextInt();

		System.out.print("���� : ");
		english = scan.nextInt();

		System.out.print("���� : ");
		math = scan.nextInt();
		
		System.out.printf("\n�й� : %s\n�̸� : %s\n���� : %d\n���� : %d\n���� : %d\n",
			id, name, korean, english, math);

		int sum = korean + english + math;

		System.out.printf("��÷ : %d\n", sum);
		System.out.printf("��� : %.1f\n", sum/3.0); // ������ �Ǽ��� �����ϸ� ����� �Ǽ��� �ȴ�.
	}
}
