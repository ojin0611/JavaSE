/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

/*
	Ŭ�������� (a.k.a static variable)
	- Ŭ������ �̸����� �����Ѵ�!!
	- Integer.MAX_VALUE, short.MAX_VALUE, Byte.MAX_VALUE
	- �Ҽ� Ŭ������ �ּҸ� ������ �ʿ䰡 ����.
	- �ڵ����� Data Type�� ���� �ʱⰪ�� �־�����.
*/

public class StaticVariableDemo {
	static int age; // Class Variable, Static Variable. ���� ����
	public static void main(String[] args) {
		/*
		//int age; ��������
		System.out.println("���� =" + StaticVariableDemo.age); //�ڵ����� �ʱ�ȭ��.
		System.out.println("���� =" + age); //�̷��� �ᵵ �����Ϸ��� �˾Ƽ� ã����.
		StaticVariableDemo svd = new StaticVariableDemo(); //�̷��Ե� �Ǳ��ϴµ� ����
		System.out.println("���� =" + svd.age);
		*/

		// System.out.println("���� = " + price); //error. �ٸ�Ŭ������ �ִ�.

		Product.price = 2500_0000;
		System.out.println("���� = " + Product.price); //error. �ٸ�Ŭ������ �ִ�.
	}
}

class Product {
	static int price;
}