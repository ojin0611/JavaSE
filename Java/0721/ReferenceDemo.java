/*
�ۼ��� : �翵��
�ۼ����� :
�ۼ��Ͻ� :
�ۼ�ȯ�� : Windows 10, OpenJDK 14, EditPlus
*/

/*
	Class
	Object
	Instance
*/

public class ReferenceDemo {
	public static void main(String[] args) {
		Car sonata; // ����
		sonata = new Car(); //4����Ʈ¥�� �ּ� stack�� ����.
		sonata.name = "�ҳ�Ÿ"; // heap�� �ִ� sonata�� ���� �Ҵ�
		sonata.price = 25_000_000;  // �ڹٿ��� �ִ� ���� ǥ�� ���
		sonata.maker = "����";

		Car carnival = new Car();
		carnival.name = "ī�Ϲ�";
		carnival.price = 35_000_000;
		carnival.maker = "���";

		System.out.printf("�̸� = %s, ���� = %d, ������ = %s\n",
			sonata.name, sonata.price, sonata.maker);
		System.out.printf("�̸� = %s, ���� = %d, ������ = %s\n",
			carnival.name, carnival.price, carnival.maker);
	}
}

class Car {
	String name;
	int price;
	String maker;
}