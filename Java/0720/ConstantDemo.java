/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : OS, Version, Editor
*/

public class ConstantDemo {
	public static void main(String[] args) {
		double pi = 3.141592;
		// final double PI = 3.141592; ����� �����ϴ� ��� = final
		System.out.printf("pi�� ���� %f�Դϴ�.\n", pi);
		pi = 3.14;
		System.out.printf("pi�� ���� %f�Դϴ�.\n", pi);
		
		int max = Integer.MAX_VALUE;
		System.out.printf("max = %d.\n", max);
		System.out.printf("max���� 1 ū Integer = %d.\n", max + 1);
		
		// Overflow
		byte min = Byte.MIN_VALUE;
		System.out.printf("���� ���� �� = %d.\n", min);
		System.out.printf("���� ���� ������ 1 ���� �� = " + (min-1) + "\n");
		System.out.printf("���� ���� ������ 1 ���� byte = " + (byte)(min-1) + "\n");
		
	}
}
