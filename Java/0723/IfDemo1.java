/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class IfDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int number = scan.nextInt();
		
		System.out.print(number);
		if (number % 2 == 0){
			System.out.println("�� ¦���Դϴ�.");
		} else {
			System.out.println("�� Ȧ���Դϴ�.");
		}


	}
}
