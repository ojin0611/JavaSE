/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class ArrayDemo2 {
	public static void main(String[] args) {
		float[] array= new float[4];
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<4; i++)
		{
			System.out.print(">> : ");
			array[i] = scan.nextFloat();
		}
	}
}
