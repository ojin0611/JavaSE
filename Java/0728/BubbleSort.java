/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Arrays;

public class BubbleSort { // �պ��� �� ���� ��. ��� �ڷκ�����
	public static void main(String[] args) {
		int[] array = {5,8,2,1,4,6,2,3,7,9};
		System.out.println("Before");
		System.out.println(Arrays.toString(array)); // array�� string���� ����ϴ� ���
		for (int i=0; i<array.length - 1; i++)
		{
			for (int j=0; j<array.length - 1; j++)
			{
				if (array[j] < array[j+1]) // ���⼭ �������� �Ǵ� �������� ��������
				{
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("After");
		System.out.println(Arrays.toString(array));
	}
}
