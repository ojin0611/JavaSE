/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/


/*
배열의 초기화
1. 정수형 -> 0
2. 실수형 -> 0.0f
3. Boolean-> false
4. 문자 --> char --> null
5. 참조형 --> 주소 --> null 번지, null
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

		System.out.println("String, 참조형은 초기화 시 null이 출력되며, 이후의 출력이 모두 끊긴다.");
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
