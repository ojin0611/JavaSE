
public class Employee {
	private String name; // 인스턴스 변수
	private int salary; // 인스턴스 개수만큼 만들어진다.
	private static int count; // 클래스 변수. 단 한개 생성됨
	// 클래스변수는 UML에서 underline 표시
	
	{ // Instance Initialization Block
		this.salary = 1000;
	}
	
	
	static { // class Initialization Block
		count = 10;
	}
	
	
	public Employee(String name) {
		this.name = name;
		// this.salary = salary;
		count++; // 철수의 count가 아니라 Employee의 count
	}
	
	public void print() {
		System.out.println("종업원수 : "+count);
	}
}
