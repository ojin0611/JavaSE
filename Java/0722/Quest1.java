/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/


/*
1. ���� ���� ��ǰ ������ �Է¹޾� �Ž������� ����Ͽ� ����ϱ�
  ��ǰ �ݾ��� �Է��ϼ��� : 5300
  ���� ���� �Է��ϼ��� : 10000
  �Ž������� 4700���Դϴ�.

2. Ű����κ��� �� ������ ������ �Է¹޾�, �ú��� ������ ȯ���ϱ�
  �ð��� �� ������ �Է��Ͻÿ� : 7654
  7654�ʴ� 2�ð� 7�� 34�� �Դϴ�.

3. ��ǰ ������ �Է¹޾�, ���ҿ� �ʿ��� 5������, ������, 5õ����, õ������ �ּ� ������ ������ �ݾ��� ���ϱ�
  ��ǰ������ �Է��ϼ��� : 152365
  152365���� 5������ 3��, ������ 0��, 5õ���� 0��, õ���� 2���� �����ϰ� 365���� �����ϴ�.
*/

import java.util.Scanner;
public class Quest1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1.
		System.out.println("1. ���� ���� ��ǰ ������ �Է¹޾� �Ž������� ����Ͽ� ����ϱ�");
		System.out.print("��ǰ �ݾ��� �Է��ϼ��� : ");
		int price = scan.nextInt();

		System.out.print("���� ���� �Է��ϼ��� : ");
		int receive=scan.nextInt();

		int rest = receive - price;
		System.out.printf("�Ž������� %d���Դϴ�.\n", rest);

		
		//2.
		/*
		7654 = 2�ð� 7�� 34��
		7654 = 2*3600 + 7*60 + 34
		*/
		System.out.println("\n2. Ű����κ��� �� ������ ������ �Է¹޾�, �ú��� ������ ȯ���ϱ�");
		System.out.print("�ð��� �� ������ �Է��Ͻÿ� : ");
		int input  = scan.nextInt();
		int hour   = input / 3600;
		int minute = input % 3600 / 60;
		int second = input % 60;

		System.out.printf("%d�ʴ� %d�ð� %d�� %d�� �Դϴ�.\n",
			input, hour, minute, second);

		//3.
		System.out.println("\n3. ��ǰ ������ �Է¹޾�, ���ҿ� �ʿ��� 5������, ������, 5õ����, õ������ �ּ� ������ ������ �ݾ��� ���ϱ�");
		System.out.print("��ǰ������ �Է��ϼ��� : ");
		price = scan.nextInt();
		int oman = price / 50000;
		int man  = price % 50000 / 10000;
		int ochun= price % 10000 / 5000;
		int chun = price % 5000 / 1000;
		rest = price % 1000;
		System.out.printf("%d���� 5������ %d��, ������ %d��, 5õ���� %d��, õ���� %d���� �����ϰ� %d���� �����ϴ�.",
			price, oman, man, ochun, chun, rest);


	}
}
