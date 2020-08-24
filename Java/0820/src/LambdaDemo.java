public class LambdaDemo {
	public static void main(String[] args) {
		//1. 참조변수에 lambda expression 사용하기
		//Comparable com = (a, b) -> b - a;
		
		//2. parameter에 lambda expression 사용하기
		//myMethod((a, b) -> b - a);
		
		//3. return type에 lambda expression 사용하기
		Comparable com = myMethod1();
		System.out.println(com.compareTo(5,  9));
	}
	static void myMethod(Comparable comp) {
		int a = 5, b = 9;
		int result = comp.compareTo(a, b);
		System.out.println("result = " + result);
	}
	static Comparable myMethod1() {
		return (a, b) -> b - a;
	}
}
@FunctionalInterface
interface Comparable{
	int compareTo(int a, int b);
}