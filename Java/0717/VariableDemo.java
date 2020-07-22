/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : OS, Version, Editor
*/

/*
	Variable(변수)
	1. Primitive type : 값
	2. Reference type : 주소
*/

public class VariableDemo {
	public static void main(String[] args) {
		/*
		byte age; // Declaration
		age = 24; // Assignment
		*/
		byte age = 27; // Initialization
		System.out.printf("나이 = %d\n", age);

		age = 50;
		System.out.printf("나이 = %d\n", age);
		
		/*
		age = 128; // error
		System.out.printf("나이 = %d\n", age);
		
		int su = 2147483647;
		System.out.printf("%d", su +1); // -2147483648이 출력됨.

		*/

	}
}
