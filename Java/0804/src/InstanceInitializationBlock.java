
public class InstanceInitializationBlock {
	public static void main(String[] args) {
		Car car = new Car();
		car.print();
	}
}

class Car{
	// ����� �ʱ�ȭ
	private String name1 = "�ҳ�Ÿ"; 
	
	private String name2;
	// ������
	public Car() {
		this.name2 = "������";
	}
	
	// �ʱ�ȭ ��
	// ���� �̸��� ��� ȣ���� �� ������ �����ں��� ���� ȣ��ȴ�. 
	{
		System.out.println("�ʱ�ȭ ��");
		 this.name2 = "ī�Ϲ�";
	}
	
	public void print() {
		System.out.println("name2 = "+this.name2); // ī�Ϲ� ����� �Ŀ� �������� �����
	}
}
