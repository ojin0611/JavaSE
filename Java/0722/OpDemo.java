/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class OpDemo {
	public static void main(String[] args) {
		int su = -128;
		int result = ~su;
		System.out.printf("su = %d, result = %s\n",
			su, Integer.toBinaryString(su));
		System.out.printf("result = %d, result= %s\n",
			result, Integer.toBinaryString(result));

		boolean flag = true;
		boolean answer = !flag; // false


		int a=5, b=9;
		result = ++a + b--;
		System.out.println(a); //6
		System.out.println(b); //8
		System.out.println(result); //15


	}
}
