import java.util.Scanner;

public class LcmGcm {

	public static void main(String[] args) {
		// ���� 2�� �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("1st : "); int a = scan.nextInt();
		System.out.print("2nd : "); int b = scan.nextInt();

		LcmGcm lg = new LcmGcm();
		int gcm = lg.calcGcm(a,b); // �ּ� ���� �� �ּҷ� �θ���
		int lcm = calcLcm(a,b,gcm); // ���� Ŭ���� �ȿ� �ִ� class method�� ��� Ŭ�����̸� ���� ����
		LcmGcm.printResult(a,b,gcm,lcm); // Ŭ���� �̸����� �θ��°� ����
	}
	// gcm
	int calcGcm(int a, int b) {
		return 1;
	};
	
	// lcm
	static int calcLcm(int a, int b, int gcm) {
		return 1;
	};
	
	// print
	static void printResult(int a, int b, int gcm, int lcm) {
		System.out.printf("%d�� %d�� �ִ�����, �ּҰ������ ���� �ڵ�� ���� �� �ֽ��ϴ�.", a,b);
	};
	

}
