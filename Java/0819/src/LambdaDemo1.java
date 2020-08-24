/*
 * 2. �Ű������� lambda�� �������.
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		//PrintString lambdaStr = s -> System.out.println(s);
		//lambdaStr.showString("Hello");
		myMethod(s -> System.out.println(s));
		//myMethod(lambdaStr);
		//returnString().showString("Hello");
		PrintString ps = returnString();
		ps.showString("Hello");
	}
	static void myMethod(PrintString lambdaStr) {  
		//PrintString lambdaStr = s -> System.out.println(s)
		lambdaStr.showString("World");
	}
	//3. ����Ÿ������ lambda�� �������.
	static PrintString returnString() {
		return s -> System.out.println(s + ", from Lambd Expression");
	}
}
@FunctionalInterface
interface PrintString{
	void showString(String s);
}