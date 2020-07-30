
public class HelloWorld3 {
	public static void main(String[] args) {
		// System.out.println(str); 다른 클래스에 있는 변수를 어케아라
		Test t = new Test();
		System.out.println(t.str);
	}
}

class Test{
	String str = "Hello, World"; // member variable
}