
public class CallByValueDemo {
	public static void main(String[] args) {
		int a=5;
		System.out.println("��� �� : " + a);
		change(a);
		System.out.println("��� �� : " + a);
		
		int b=5;
		System.out.println("��� �� : " + b);
		b=change2(b);
		System.out.println("��� �� : " + b);
}
	
	static void change(int number) { // call by balue, ������
		number = number + 2;
		System.out.println("�Լ� ���� ��� : " + number);
	}

	static int change2(int number) { // call by balue, ������
		number = number + 2;
		System.out.println("�Լ� ���� ��� : " + number);
		return number;
	}

}
