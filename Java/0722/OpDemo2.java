/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;

public class OpDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int first, second;
		System.out.print("ù��° ���� : ");  first = scan.nextInt(); //9
		System.out.print("�ι�° ���� : ");  second= scan.nextInt(); //4
		System.out.printf("%d + %d = %d\n",  first, second, first+second); //13
		System.out.printf("%d / %d = %d\n",  first, second, first/second); //2
		System.out.printf("%d %% %d = %d\n", first, second, first%second); //1
	}
}
