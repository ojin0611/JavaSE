/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : OS, Version, Editor
*/

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		/*
		System.out.print("������ ���̴�? ");
		Scanner scan;
		scan = new Scanner(System.in);
		int age = scan.nextInt(); // �Է¹��ۿ��� �� ���� ������ �о���̴� �Լ�
		System.out.println("������ ���̴� " + age + "���Դϴ�.");
		System.out.printf("%d���̶��.. ������\n", age);
		*/

		/*
		double height;
		double weight;

		Scanner scan; //�ּ� ���� ����
		scan = new Scanner(System.in); //�ּ� �Ҵ�

		System.out.print("Ű : ");
		height = scan.nextDouble(); //�� �Ҵ�
		System.out.print("������ : ");
		weight = scan.nextDouble(); //�� �Ҵ�

		System.out.printf("Ű = %.1fcm\t������ = %.1fkg", height, weight, height);
		*/


		Scanner scan;
		scan = new Scanner(System.in);

		/*
		System.out.print("Name : ");

		String name; // �ּ� ���� ����
		name = scan.next(); // �ּ� ���� �Ҵ�
		
		System.out.println("Hi "+name+"~!"); // ������ ���Ե� string�� �Է��ϸ� ���� ���İ� �����.
		*/
		
		System.out.print("�ּ�? ");
		
		String wholeLine; 
		wholeLine = scan.nextLine(); // �̷��� �ؾ� �� �� ��ü�� �Է¹޴´�.

		System.out.println("�ּ� : " +wholeLine);
	}
}
