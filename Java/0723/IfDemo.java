/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class IfDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� : ");
		int score = scan.nextInt();

		//1.
		if (score>=60) {
			System.out.print("��");
			System.out.println("��");
		} else {
			System.out.print("��");	
		}
	}
}
