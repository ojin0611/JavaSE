/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class ParseDemo {
	public static void main(String[] args) {
		String str = "128";
		System.out.println(str + 50); // "12850"

		int su = Integer.parseInt(str);
		System.out.println(su + 50); // 128+50 = 178

		int su2=128;
		String str2 = String.valueOf(su2); // "128"
		System.out.println(str2 + 50); // "12850"

		String str3 = Integer.toString(027, 16); //8���� 027�� 16������ ��ȯ 
		System.out.printf("str = %s\n", str3); // "17"
	}
}
