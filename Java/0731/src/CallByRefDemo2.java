import java.util.Arrays;
import java.util.Scanner;

public class CallByRefDemo2{
	public static void main(String[] args) {
		int[] array = new int[1000];
		int n = input(array);
		output(array, n);
	}
	static int input(int[] array) { // �ּҸ� �ѱ�� ���� ������ ��ȯ Ÿ��
		Scanner scan = new Scanner(System.in);
		int su = 0;
		int i=0;
		System.out.println("���� �Է�(0�� ����)");
		while((su=scan.nextInt()) != 0 && i<1000) {
			array[i++] = su;
		}
		
		return i-1; // array�� ���̰� �ƴ�, �Է¹��� ������ ����!
	}
	
	static void output(int[] array, int n){
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + "\t");
		};
	}

}
