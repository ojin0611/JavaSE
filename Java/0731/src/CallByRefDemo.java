
public class CallByRefDemo {
	public static void main(String[] args) {
		String str = "Hello";
		StringBuffer sb = new StringBuffer("Hello"); // StringBuffer�� Ŭ����. sb�� ������ ����
		System.out.println("���� ��");
		System.out.println(str);
		System.out.println(sb);
		
		change(str,sb);

		System.out.println("���� ��");
		System.out.println(str);
		System.out.println(sb);
	}
	static void change(String str, StringBuffer sb) {
		str += ", World";
		sb.append(", World");
	}
}
