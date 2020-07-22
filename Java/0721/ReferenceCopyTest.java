/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class ReferenceCopyTest {
	public static void main(String[] args) {
		Student chulsu = new Student(); chulsu.age = 24;
		Student hoooni = new Student(); hoooni.age = chulsu.age;
		chulsu.age = 50;

		System.out.printf("철수는 %d살\n", chulsu.age);
		System.out.printf("훈이는 %d살\n", hoooni.age);

	}
}

class Student{
	int age;
}