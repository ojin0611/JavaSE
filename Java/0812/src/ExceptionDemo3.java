import java.util.Scanner;

// ���ܸ� �̿��� �����Է����α׷��� ��������
public class ExceptionDemo3 {
	public static void main(String[] args) /*throws KoreanException*/{
		Scanner scan = new Scanner(System.in);    int kor;
		do {
			System.out.print("�������� : ");
			try {
				kor = scan.nextInt();
				if(check(kor))  break;
				else throw new KoreanException("�߸��� ���������Դϴ�.\nȮ�� �� �ٽ� �Է��� �ּ���.");
			}catch(KoreanException ex) {
				System.out.println(ex.getMessage());
			}
		}while(true);
		System.out.println("�������� = " + kor);
	}
	static boolean check(int jumsu) {
		if(jumsu < 0 || jumsu > 100) return false;
		else return true;
	}
}