import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1st");
		int first = scan.nextInt();
		
		System.out.println("2nd");
		int second = scan.nextInt();
		try {
			System.out.println(first / second);
		}
		catch(ArithmeticException ex) {
			System.out.println("ó���Ϸ�");
		}
		catch(RuntimeException ex) {
			System.out.println("�θ����� �� ��ƹ���");
		}
		catch(Exception ex) {
			System.out.println("���������� ����");
		}
	}
}
