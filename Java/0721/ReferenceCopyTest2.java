/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class ReferenceCopyTest2 {
	public static void main(String[] args) {
		String original = "Hello";
		String copy = original;
		original = "Hi";
		System.out.printf("original = %s, copy = %s\n", original, copy);
	}
}
