// ������ �����ε��� ������ ������ �����ڷ� �� �о�����!!
public class Student{
	private String name;
	private int age;


	public Student() {
		this("Unknown", 20);
	}
	
	public Student(String name) {
		// this.name = name;
		this(name, 20);
	}

	public Student(int age) {
		// this.age = age;
		this("Unknown", age);
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() { 
		// Ŭ���� ���ο����� �ν��Ͻ����� �ٷλ�밡��
		System.out.println("name = "+name+", age = "+this.age);
	}
}