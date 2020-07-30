/**
 * @author sist4-18
 * @date 2020. 7. 30.
 * @objective
 * @environment : Windows10 Pro, OpenJDK 14.0.2, Eclipse 2020-06
 */

public class HelloWorld2 {
	static String str = "Hello, World"; // class variable. 
	public static void main(String[] args) {
		HelloWorld2 hw = new HelloWorld2();
		System.out.println(HelloWorld2.str); // static, 즉, 클래스 변수는 클래스 이름으로 접근하는 것이 국룰이다.
		System.out.println(str); // 근데 여기서는 hw.str 할 필요가 없다! 같은 클래스기때문
	}
}
