/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

/*
	Member Variable : Instance Variable
	- �ڵ����� ������ �ʱⰪ�� �־�����. (class ������ ����.)
*/

public class MemberVariableDemo {
	// static int age; //Ŭ��������. �����ϱ� ���� ���� ����
	int age; //�������. �������� �ʴ´�.
	public static void main(String[] args) {
		MemberVariableDemo mvd = new MemberVariableDemo(); // new�� ���� ���� �ּһ���

		// int age; //��������. static �����δ�.
		System.out.println(mvd.age);
	}
}
