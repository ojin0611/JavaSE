/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

import java.util.Scanner;

public class NewOpDemo {
	public static void main(String[] args) {
		Scanner scan = null; // ����, ������������ ��������
		scan = new Scanner(System.in);

		String irum = null;
		irum = new String("������");
		System.out.printf("�̸� = %s\n", irum);

		irum = new String("������");
		System.out.printf("�̸� = %s\n", irum);

		irum = "��"; // new String("��");
		irum = irum + "����"; //irum + new String("����"); ==> new String("��" + "����")

	}
}
