/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class ArrayDemo {
	public static void main(String[] args) {
		// Declaration
		int su;
		int [] array; // [] �߰��ϸ� �ּҺ����� �����.
		
		// Creation ���� (�迭�� ���� �ܰ�)
		array = new int[4]; //new�� ���׿�����! �������� ���� �������

		// Assignment
		su = 5;
		array[1] = 3;

		System.out.printf("%d %d\n",array[0], array[1]);

		//-------------------------------------------------
		// Declaration
		int [] array2;

		// Creation & Assignment
		// �迭���� �ּҸ� �����ؾ��ϱ⶧����, new�� heap�� �迭�� �����ϰ� �� �ּҸ� �Ҵ�
		array2 = new int[]{3,4,5,6}; // [] �ȿ� �����
		System.out.println(array2[2]);

		//-------------------------------------------------
		// Declaration, Creation & Assignment --> initialize
		int[] array3 = {3,4,5,6}; // ���� ���ο� �־��Ѵ�.
		System.out.println(array3[3]);
		
		/*
		int[] array4;
		array4 = {3,4,5,6}; // error
		*/


	}
}
