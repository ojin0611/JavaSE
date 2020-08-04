// 생성자 오버로딩을 했지만 마지막 생성자로 다 밀어주자!!
public class Student{
	private String name;
	private int age;


	public Student() {
		this("Unknown", 20);
	}
	
	public Student(String name) {
		// this.name = name;
		this(name, 20);
	}

	public Student(int age) {
		// this.age = age;
		this("Unknown", age);
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() { 
		// 클래스 내부에서는 인스턴스변수 바로사용가능
		System.out.println("name = "+name+", age = "+this.age);
	}
}