/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class IfDemo3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� : ");
		int year = scan.nextInt();

		System.out.printf("%d���� ", year);
		if (year % 4 == 0 & (year%400==0 | year%100>0) ){
			System.out.println("�����Դϴ�");
		}
		else System.out.println("������ �ƴմϴ�");

	}
}
