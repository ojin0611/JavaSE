
public class InheritanceDemo2 {
	public static void main(String[] args) {
		
	}
}

class Base{
	private String name;
	public Base(String name) {
		this.name = name;
	}
	
	public void printBase() {
		System.out.println(this.name);
	}
}

class Derived extends Base{
	private int salary;
	public Derived(int salary) {
		// super(); // �θ��� �⺻������ �����ϱ� �̰� �ȵ�
		super("Tesla");
	}
}
