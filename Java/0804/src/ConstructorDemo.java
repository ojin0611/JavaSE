
public class ConstructorDemo {
	String name;
	int price;
	
	public ConstructorDemo() { // default constructor
		this.name = null;
		this.price = 0;
	}
	
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();
		System.out.println("name = "+ cd.name);
		System.out.println("price = "+cd.price);
		
		String s = new String(); // api�� String()�̶�� �⺻�����ڰ� ����
		// Integer i = new Integer(); // ��� api����� ����
	}
}
