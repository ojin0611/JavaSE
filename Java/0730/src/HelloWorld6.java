
public class HelloWorld6 {
	public static void main(String[] args) {
		display(); // instance method�� �����ϱ� ���� ���¸�ü�� ������.
		HelloWorld6.display(); //  �ٽø������� Ŭ�����̸����� �ҷ����� ���� �����̴�.
	}
	
	static void display() { // method�� �����
		// method�� ����
		System.out.println("Hello, World");
	}
}
