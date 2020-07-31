
public class CallByRefDemo {
	public static void main(String[] args) {
		String str = "Hello";
		StringBuffer sb = new StringBuffer("Hello"); // StringBuffer는 클래스. sb는 참조형 변수
		System.out.println("수정 전");
		System.out.println(str);
		System.out.println(sb);
		
		change(str,sb);

		System.out.println("수정 후");
		System.out.println(str);
		System.out.println(sb);
	}
	static void change(String str, StringBuffer sb) {
		str += ", World";
		sb.append(", World");
	}
}
