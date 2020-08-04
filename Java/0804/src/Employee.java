
public class Employee {
	private String name; // �ν��Ͻ� ����
	private int salary; // �ν��Ͻ� ������ŭ ���������.
	private static int count; // Ŭ���� ����. �� �Ѱ� ������
	// Ŭ���������� UML���� underline ǥ��
	
	{ // Instance Initialization Block
		this.salary = 1000;
	}
	
	
	static { // class Initialization Block
		count = 10;
	}
	
	
	public Employee(String name) {
		this.name = name;
		// this.salary = salary;
		count++; // ö���� count�� �ƴ϶� Employee�� count
	}
	
	public void print() {
		System.out.println("�������� : "+count);
	}
}
