/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class ArrayDemo2 {
	public static void main(String[] args) {
		/*
		String [] array = new String[]{"������","������","������","ȫ����"};
		for (int i=0; i<array.length; i++){
			System.out.printf("array[%d] = %s%n", i, array[i]);
		}
		*/

		String str = "����� ������ ���ﵿ";
		char[] array= str.toCharArray();
		for (int i=0; i<array.length; i++)
		{
			System.out.printf("%3c",array[i]);
		}
		array[0] = '��'; array[1] = '��'; array[2] = '��';
		System.out.println();
		str = new String(array);
		System.out.println(str);
	}
}
