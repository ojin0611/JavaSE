/*
 * 1. static method�� instance method�� ȣ���� �� ����.
 * 2. instance method�� static method�� ȣ���� �� �ִ�.
 * 
 * */
public class MethodDemo {
	public static void main(String[] args) {
		
	}
	
	void print() { // new�� �ν��Ͻ��� �������� �ʴ� ��, �޼��带 ȣ���� �� ����!
		display();
	}
	
	static void display() {
		
	}
}
