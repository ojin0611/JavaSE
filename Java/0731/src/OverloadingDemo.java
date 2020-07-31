
public class OverloadingDemo {
	public static void main(String[] args) {
		print(4);
		print(5, 89.5);
		print('A');
	}
	static void print(char c) {}
	static void print(int i) {}
	static void print(int i,double d) {}
	static void print(Object ... array) {
		
	}
}
