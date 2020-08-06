
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
		// super(); // 부모의 기본생성자 없으니까 이건 안돼
		super("Tesla");
	}
}
