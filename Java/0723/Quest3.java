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
		System.out.print("�̸� : ");
		String name = scan.nextLine();

		System.out.print("����⵵ : ");
		int year = scan.nextInt();
		String ddi = "";

		switch (year%12)
		{ 
		case 0: ddi = "������"; break;
		case 1: ddi = "��"; break;
		case 2: ddi = "��"; break;
		case 3: ddi = "����"; break;
		case 4: ddi = "��"; break;
		case 5: ddi = "��"; break;
		case 6: ddi = "ȣ����"; break;
		case 7: ddi = "�䳢"; break;
		case 8: ddi = "��"; break;
		case 9: ddi = "��"; break;
		case 10: ddi = "��"; break;
		case 11: ddi = "��"; break;
		default: break;
		}
		
		System.out.printf("%s���� %d���̰�, %s���Դϴ�.", name, 2020-year+1, ddi);
		// 12n = ������
	}
}
