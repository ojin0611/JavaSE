/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class ValueCopy {
	public static void main(String[] args) {
		int first, second;
		first = 7;
		second = first;
		System.out.println(first);
		System.out.println(second);

		System.out.println("�� ��ȯ ��");
		first = 10;
		System.out.println(first);
		System.out.println(second);
	}
}

/*
	������
	1. ��� : primitive type
	2. ���� : ������ �ٲ�ٰ� ī�Ǻ��� �ٲ��� �ʴ´�.
				��, ������ ī�Ǻ��� ���� �ٸ���(���� ����Ǿ����� �ʴ�).
*/