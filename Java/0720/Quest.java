/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : OS= Windows 10, Version= OpenJDK14, Editor= EditPlus
*/
import java.util.Scanner;
public class Quest {
	public static void main(String[] args) {
		/*
		1. cm�� ǥ���� Ű�� ��Ʈ�� ��ġ�� ��ȯ. 
		1��Ʈ�� 12��ġ, 1��ġ�� 2.54cm. �Ҽ��� ��°�ڸ�
		
		163cm�� 5��Ʈ, 4.17��ġ�Դϴ�.

		2. ������� ���� (�Ҽ�����°)
		
		����� �ظ��� ������ : 5
		����� ���� : 50
		������� ���Ǵ� 3926.99�Դϴ�.

		3. BMI����(������kg�� Ű������m���� ������)
		
		Ű : 183.5
		������ : 73.7
		������ BMI������ 21.88�Դϴ�.

		*/
		// 1.
		Scanner scan = new Scanner(System.in);
		double height;
		double feet = 2.54 * 12;
		double inch = 2.54;

		System.out.print("Ű : ");
		height = scan.nextDouble();
		double tmp = height/feet;

		System.out.printf("%.0fcm�� %.0f��Ʈ, %.2f��ġ�Դϴ�.\n", 
			height, tmp, height/inch);

		// 2.
		System.out.print("����� �ظ��� ������ : ");
		double r = scan.nextDouble();

		System.out.print("����� ���� : ");
		double h = scan.nextDouble();
		
		double pi = 3.141592;
		System.out.printf("������� ���Ǵ� %.2f�Դϴ�.\n", r*r*h*pi);

		// 3.
		System.out.print("Ű : ");

		height = scan.nextDouble() / 100;

		System.out.print("������ : ");
		double weight = scan.nextDouble();
		double height_2;
		height_2 = height * height;
		System.out.printf("������ BMI������ %.2f�Դϴ�.", weight / height_2);
	}
}
