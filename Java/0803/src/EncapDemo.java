
public class EncapDemo {
	public static void main(String[] args) {
		Car1 sonata = new Car1();
		// sonata.name = "Son"; // encapsulation ������ �������� �Ұ�
		sonata.setName("Son");
		String name = sonata.getName();
		
		System.out.println(name);
	}
}
