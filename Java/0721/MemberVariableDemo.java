/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

/*
	Member Variable : Instance Variable
	- 자동으로 변수의 초기값이 주어진다. (class 변수와 같다.)
*/

public class MemberVariableDemo {
	// static int age; //클래스변수. 공유하기 위해 만든 변수
	int age; //멤버변수. 공유되지 않는다.
	public static void main(String[] args) {
		MemberVariableDemo mvd = new MemberVariableDemo(); // new를 쓰는 순간 주소생성

		// int age; //지역변수. static 못붙인다.
		System.out.println(mvd.age);
	}
}
