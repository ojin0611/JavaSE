public class LambdaDemo {
	public static void main(String[] args) {
		MyInterface mi = (a, b) -> a + b;
			
		int result = mi.calculate(5,  9);
		System.out.println("result = " + result);
	}
}
