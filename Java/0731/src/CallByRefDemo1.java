import java.util.Arrays;
import java.util.Scanner;

public class CallByRefDemo1 {
	public static void main(String[] args) {
		int[] array = input();
		output(array);
	}
	static int[] input() { // �ּҸ� �ѱ�� ���� ������ ��ȯ Ÿ��
		Scanner scan = new Scanner(System.in);
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.print("���� >> "); array[i] = scan.nextInt();
		}
		
		return array;
	}
	
	static void output(int[] array){
		System.out.println(Arrays.toString(array));
	}

}
