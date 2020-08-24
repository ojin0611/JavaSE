/*
 * 1. interface�� ������ lambda�� ��������.
 * 
 */
public class LambdaDemo {
	public static void main(String[] args) {
		/*
		MyInterface mi = new MyInterface() {
			@Override
			public void myConcat(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		*/
		MyInterface mi = (s1, s2)  -> System.out.println(s1 + ", " + s2);
		mi.myConcat("Hello", "World");
	}
}
@FunctionalInterface
interface MyInterface{
	void myConcat(String s1, String s2);
}