
public class EncapDemo {
	public static void main(String[] args) {
		Car1 sonata = new Car1();
		// sonata.name = "Son"; // encapsulation 때문에 직접접근 불가
		sonata.setName("Son");
		String name = sonata.getName();
		
		System.out.println(name);
	}
}
