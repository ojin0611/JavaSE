
public class EnumDemo {
	public static void main(String[] args) {
		Week[] array = Week.values();
		for (Week w : array) {
			System.out.print(w);
			System.out.print(", " + w.getValue());
			System.out.println(", " + w.ordinal());
		}
	}
}
