/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/


/*
�迭�� �ʱ�ȭ
1. ������ -> 0
2. �Ǽ��� -> 0.0f
3. Boolean-> false
4. ���� --> char --> null
5. ������ --> �ּ� --> null ����, null
*/
public class ArrayDemo1 {
	public static void main(String[] args) {
		int[] array = new int[4]; // Declaration & Creation
		double[] array2 = new double[4];
		boolean[] array3 = new boolean[4];
		for (int i=0; i<4; i++)
		{
			System.out.printf("array[%d] = %d\n", i, array[i]);
			System.out.printf("array[%d] = %f\n", i, array2[i]);
			System.out.printf("array[%d] = %b\n", i, array3[i]);
		}

		System.out.println("String, �������� �ʱ�ȭ �� null�� ��µǸ�, ������ ����� ��� �����.");
		char[] array4 = new char[4];
		for (int i=0; i<4; i++)
		{
			System.out.printf("array[%d] = %c\n", i, array4[i]);
		}

		String[] array5 = new String[4];
		for (int i=0; i<4; i++)
		{
			System.out.printf("array[%d] = %c\n", i, array5[i]);
		}
	}
}
