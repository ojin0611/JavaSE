/*
�ۼ��� : 
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : OS, Version, Editor
*/

public class LiteralDemo3 {
	public static void main(String[] args) {
		/*
		*/
		System.out.printf("%s\n", "����� ��� �ѵ����� 8��"); // % ����ȭ�� ����� �ʿ��� ���� printf ���
		System.out.println("�λ�� "+"�ؿ�뱸 " + "�ؿ�� " + "�ؼ�����"); // concatenation
		System.out.println("�λ�� "+ 123); // concatenation �翷�� �Ѱ��� ���ڿ��� ������, "�λ�� " + "123"���� �ڵ� ����ȯ�ȴ�.
		System.out.printf("%s\n", 120+24.68+"Hi"); // ������ ���ϱⰡ �켱�̰� �� ������ string

		System.out.printf("%o\n",24);
		System.out.printf("%#o\n",24); //#�� ������� 030. 16������ 0x����
		System.out.println(Integer.toOctalString(24));
	}
}
