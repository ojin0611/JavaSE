/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class IfDemo4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = scan.nextLine();

		System.out.print("Ű(cm) : ");
		double height = scan.nextDouble()/100.;

		System.out.print("������(kg) : ");
		double weight = scan.nextDouble();

		double bmi = weight / height / height;
		String status;
		if (bmi >= 40)
		{status = "�� ��";
		}else if (bmi >= 35)
		{status = "�ߵ ��";
		}else if (bmi >= 30)
		{status = "�浵 ��";
		}else if (bmi >= 25)
		{status = "��ü��";
		}else if (bmi >= 18.5)
		{status = "����";
		}else status="��ü��";
		
		
		System.out.printf("%s���� BMI ������ %.1f�̰� %s�Դϴ�.",name, bmi, status);
		
		
	}
}
