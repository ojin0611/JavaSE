import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportDemo {
	public static void main(String[] args) {
		out.println("Hello, World");
		out.println("Real Pi = "+PI);
		
		double rand = random(); // ���� ���� �޼ҵ尡 ��������~����
		out.println("My random double = " + rand);
	}
	
	static double random() {
		out.println("Fake random ^^");
		return 3.14;
	}
}
