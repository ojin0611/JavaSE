/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;

public class Quest3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�����ϴ� ����(spring/summer/fall/winter) : ");
		String season = scan.nextLine();
		
		String flowers = (season.equals("spring")) ? "������, ���޷�" :
			(season.equals("summer")) ? "���, ��ī�þ�" :
			(season.equals("fall"))   ? "����, �ڽ���" :
			(season.equals("winter")) ? "����, ��ȭ" : "error";

		System.out.printf("���� : %s\n", season);
		System.out.printf("�� : %s", flowers);

	}
}
