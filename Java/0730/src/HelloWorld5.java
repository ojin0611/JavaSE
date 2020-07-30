
public class HelloWorld5 {
	public static void main(String[] args) {
		HelloWorld5 hw = new HelloWorld5(); // 주소로 접근한다. new를 사용하면 heap 메모리에 올린다!
		hw.display();
	}
	
	void display() { // method의 선언부. 변수와 구분하기 위해 괄호 생성!!!
		// method의 몸통
		System.out.println("Hello, World");
	}
}
