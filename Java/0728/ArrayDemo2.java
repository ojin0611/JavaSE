/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class ArrayDemo2 {
	public static void main(String[] args) {
		/*
		String [] array = new String[]{"한지민","박지민","김지민","홍지민"};
		for (int i=0; i<array.length; i++){
			System.out.printf("array[%d] = %s%n", i, array[i]);
		}
		*/

		String str = "서울시 강남구 역삼동";
		char[] array= str.toCharArray();
		for (int i=0; i<array.length; i++)
		{
			System.out.printf("%3c",array[i]);
		}
		array[0] = '경'; array[1] = '기'; array[2] = '도';
		System.out.println();
		str = new String(array);
		System.out.println(str);
	}
}
