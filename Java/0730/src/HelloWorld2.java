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
		System.out.println(HelloWorld2.str); // static, ��, Ŭ���� ������ Ŭ���� �̸����� �����ϴ� ���� �����̴�.
		System.out.println(str); // �ٵ� ���⼭�� hw.str �� �ʿ䰡 ����! ���� Ŭ�����⶧��
	}
}
