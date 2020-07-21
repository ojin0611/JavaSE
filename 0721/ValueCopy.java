/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class ValueCopy {
	public static void main(String[] args) {
		int first, second;
		first = 7;
		second = first;
		System.out.println(first);
		System.out.println(second);

		System.out.println("값 변환 후");
		first = 10;
		System.out.println(first);
		System.out.println(second);
	}
}

/*
	값복사
	1. 대상 : primitive type
	2. 동작 : 원본이 바뀐다고 카피본이 바뀌지 않는다.
				즉, 원본과 카피본은 서로 다르다(서로 연결되어있지 않다).
*/