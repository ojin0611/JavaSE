
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			System.out.println(4/0); // ArithmeticException
		}catch (NullPointerException ex) { // �ٸ� exception���� catch ����
			System.out.println("NullPointerException"); 
		}
		System.out.println("main ����");
	}
}
