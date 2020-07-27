/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

import java.util.Scanner;
public class YunYear {
	public static void main(String[] args) {
		int year, month, day;
		Scanner scan = new Scanner(System.in);

		System.out.print("�� �� �� : "); // 2020 7 27
		String yearStr = scan.next();
		year = Integer.parseInt(yearStr);

		String monthStr = scan.next();
		month = Integer.parseInt(monthStr);

		String dayStr = scan.next();
		day = Integer.parseInt("1");

		/*
		year = 2020;
		month = 7;
		day = 27;
		*/
		int days_sum = 0;

		// year
		// 4�⿡ 1��
		// 100�⿡ -1��
		// 400�⿡ 1��
		days_sum += (year-1) * 365;
		days_sum += (year-1)/4;
		days_sum -= (year-1)/100;
		days_sum += (year-1)/400;
		
		// month
		int[] days_month = {0,31,28,31,30,31,30,31, 31,30,31,30,31};
		if ((year%4==0 && year%100!=0) || year%400==0)
		{
			days_month[2] += 1;
		}

		switch (month)
		{
		case 12: days_sum += days_month[11];
		case 11: days_sum += days_month[10];
		case 10: days_sum += days_month[9];
		case 9: days_sum += days_month[8];
		case 8: days_sum += days_month[7];
		case 7: days_sum += days_month[6];
		case 6: days_sum += days_month[5];
		case 5: days_sum += days_month[4];
		case 4: days_sum += days_month[3];
		case 3: days_sum += days_month[2];
		case 2: days_sum += days_month[1];
		case 1: days_sum += days_month[0];
		}
		

		// day
		days_sum += day;
		
		/*
		// ����
		switch (days_sum % 7)
		{
		case 1: System.out.printf("%d�� %2d�� %2d���� �������Դϴ�.", year,month,day); break;
		case 2: System.out.printf("%d�� %2d�� %2d���� ȭ�����Դϴ�.", year,month,day); break;
		case 3: System.out.printf("%d�� %2d�� %2d���� �������Դϴ�.", year,month,day); break;
		case 4: System.out.printf("%d�� %2d�� %2d���� ������Դϴ�.", year,month,day); break;
		case 5: System.out.printf("%d�� %2d�� %2d���� �ݿ����Դϴ�.", year,month,day); break;
		case 6: System.out.printf("%d�� %2d�� %2d���� ������Դϴ�.", year,month,day); break;
		case 0: System.out.printf("%d�� %2d�� %2d���� �Ͽ����Դϴ�.", year,month,day); break;
		}
		*/
		int space = days_sum % 7;
		int maxDay = days_month[month];

		System.out.println("             #### " + year + "�� " + month + "�� ####");
		System.out.println("��\t��\t��\t�\t��\t��\t��");
		System.out.println("---------------------------------------------------");

		int count = 0;

		for (int i = 0; i < space ;i++)
		{
			System.out.print("��\t");
			count++;
		}

		// 1�Ϻ��� ������ ������
		for (int i = 1; i <= maxDay ;i++)
		{
			System.out.print(i + "\t");
			count++;
			if (count % 7 == 0)
			{
				System.out.println();
				count = 0;
			}
		}

		if (count !=0)
		{
			// ������ �� ó��
			for (int i =0 ;i < (7 - count) ;i++ )
			{
				System.out.print("��\t");
			}
		}
	}
}
