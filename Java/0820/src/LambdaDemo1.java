//1. parameter X, return X
//2. parameter X, return O
//3. parameter O, return O
//4. 매개변수가 2개 이상일때, return O
public class LambdaDemo1 {
	public static void main(String[] args) {
		MyInterface mi = (a, b) -> a + b;
		//int result = mi.saySomething("Sujan");
		int result = mi.add(5,  9);
	}
}
@FunctionalInterface
interface MyInterface{
	//int saySomething(String name);
	int add(int a, int b);
}