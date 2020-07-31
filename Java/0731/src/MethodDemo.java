/*
 * 1. static method는 instance method를 호출할 수 없다.
 * 2. instance method는 static method를 호출할 수 있다.
 * 
 * */
public class MethodDemo {
	public static void main(String[] args) {
		
	}
	
	void print() { // new로 인스턴스를 생성하지 않는 한, 메서드를 호출할 수 없어!
		display();
	}
	
	static void display() {
		
	}
}
