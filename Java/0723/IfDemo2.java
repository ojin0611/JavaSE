/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class IfDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� (��/����/����/�ܿ�) : ");
		String season = scan.nextLine();

		if (season.equals("��") | season.equals("spring")){
			System.out.println("������, ���޷�");
		} else if (season.equals("����") | season.equals("summer")){
			System.out.println("���, ��ī�þ�");
		} else if (season.equals("����") | season.equals("fall")){
			System.out.println("����, �ڽ���");
		} else if (season.equals("�ܿ�") | season.equals("winter")){
			System.out.println("����, ��ȭ");
		} else System.out.println("��Ű�´�� �սô�");
	}
}
