
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println(4/0); // ArithmeticException
		}catch (NullPointerException ex) { // 다른 exception으로 catch 못함
			System.out.println("NullPointerException"); 
		}
		System.out.println("main 종료");
	}
}
