/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class ReferenceCopyTest {
	public static void main(String[] args) {
		Student chulsu = new Student(); chulsu.age = 24;
		Student hoooni = new Student(); hoooni.age = chulsu.age;
		chulsu.age = 50;

		System.out.printf("ö���� %d��\n", chulsu.age);
		System.out.printf("���̴� %d��\n", hoooni.age);

	}
}

class Student{
	int age;
}