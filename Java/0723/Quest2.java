/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class Quest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int su1 = scan.nextInt();

		System.out.print("�ι�° �� : ");
		int su2 = scan.nextInt();

		System.out.print("������(+,-,*,/,%) : ");
		String op = scan.next();
		
		int ans;
		switch (op)
		{
		case "+": System.out.printf("\n%d %s %d = %d", su1, op, su2, su1+su2); break;
		case "-": System.out.printf("\n%d %s %d = %d", su1, op, su2, su1-su2); break;
		case "*": System.out.printf("\n%d %s %d = %d", su1, op, su2, su1*su2); break;
		case "/": System.out.printf("\n%d %s %d = %d", su1, op, su2, su1/su2); break;
		case "%": System.out.printf("\n%d %s %d = %d", su1, op, su2, su1%su2); break;
		default : System.out.print("\n�߸��� �������Դϴ�.");
		}
	}
}
