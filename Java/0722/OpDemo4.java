/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

public class OpDemo4 {
	public static void main(String[] args) {
		String name = "������";
		System.out.printf("������ == name ==> %b\n", ("������" == name));
		System.out.printf("������ == name ==> %b\n", ("������".equals(name))); //����
		System.out.printf("�������� name ���� > %d\n", ("������".compareTo(name)));//������
		
		String name2 = new String("������");
		System.out.printf("������ == name ==> %b\n", ("������" == name2));
		System.out.printf("������ == name ==> %b\n", ("������".equals(name2))); //����
		System.out.printf("�������� name ���� > %d\n", ("������".compareTo(name2)));//������
	}
}
