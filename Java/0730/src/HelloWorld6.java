
public class HelloWorld6 {
	public static void main(String[] args) {
		display(); // instance method와 구분하기 위해 이태릭체로 써진다.
		HelloWorld6.display(); //  다시말하지만 클래스이름으로 불러오는 것이 국룰이다.
	}
	
	static void display() { // method의 선언부
		// method의 몸통
		System.out.println("Hello, World");
	}
}
