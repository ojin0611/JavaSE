/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class Quest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù°�� : ");
		int su1 = scan.nextInt();

		System.out.print("��°�� : ");
		int su2 = scan.nextInt();

		System.out.print("��°�� : ");
		int su3 = scan.nextInt();

		int max;
		if (su1 < su2) max = su2;
		else max = su1;

		if (max<su3) max = su3;
		

		System.out.printf("%d, %d, %d�߿� ���� ū ���� %d�Դϴ�.", su1, su2, su3, max);
	}
}
