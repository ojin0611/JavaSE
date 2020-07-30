/**
 * @author sist4-18
 * @date 2020. 7. 30.
 * @objective
 * @environment : Windows10 Pro, OpenJDK 14.0.2, Eclipse 2020-06
 */
public class HelloWorld4 {
	public static void main(String[] args) {
		System.out.println(Test1.str);
		// System.out.println(str); error. 전역 변수여도 다른 클래스에 있으면 안됨.
	}

}

class Test1{
	static String str = "Hello, World"; //class variable
}