/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

/*
	�������� : locabl variable, stack variable, automatic variable, temporary viarable
	- Ư�� �޼ҵ� Ȥ�� Ư�� block���� ����� ����
	- Ư�� �޼ҵ峪 Ư������� ����� �ڵ��Ҹ�ǰ�, �� ���� ������ ������ �ڵ�����
	- �ݵ�� ����ϱ����� �ʱ�ȭ�ؾ��Ѵ�.
*/
import java.util.Scanner;
public class LocalVariableDemo {
	public static void main(String[] args) {
		/*
		{
			int age=24;
		}
		System.out.println(age); // ���������� {} �ȿ����� Ȱ��
		*/
		double height; //��������
		Scanner scan; //��������, ���� 
		scan = new Scanner(System.in); // ����
		System.out.print("Ű��?");
		height = scan.nextDouble(); //�ʱ�ȭ

		double inch = height / 2.54; //��������
		double feet = inch / 12;
		System.out.printf("%.1fcm�� %.1f��Ʈ, %.2f��ġ�Դϴ�.\n",
			height, feet, inch);
	}
}
