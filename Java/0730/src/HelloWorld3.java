
public class HelloWorld3 {
	public static void main(String[] args) {
		// System.out.println(str); �ٸ� Ŭ������ �ִ� ������ ���ɾƶ�
		Test t = new Test();
		System.out.println(t.str);
	}
}

class Test{
	String str = "Hello, World"; // member variable
}