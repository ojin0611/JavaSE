/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : OS, Version, Editor
*/

public class CharDemo {
	public static void main(String[] args) {
		System.out.println("������ Ư���� \"Java�� �Ǽ������\"�� ���ؼ� �н��߽��ϴ�.");

		String filepath = "C:\\ndrive\\temp\\reverse";
		System.out.println(filepath);

		filepath = "C:/ndriver/temp/reverse";
		System.out.println(filepath);

		int su   = 0222;
		char ch  = '\ucafe';
		char ga = 0xAC00;
		System.out.printf("su = %d\n",su);
		System.out.printf("ch = %c\n",ch);
		System.out.printf("ga = %c\n",ga);

	}
}
