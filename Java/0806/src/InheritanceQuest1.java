import java.util.Scanner;

public class InheritanceQuest1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] array = new Student[3];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Name : ");
			String name = scan.next();

			System.out.print("Age : ");
			int age = scan.nextInt();
			
			System.out.print("Major : ");
			String major = scan.next();
			
			array[i] = new Student(name, age, major);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}


class Human{
	private String name;
	private int age;
	
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("name=%s, age=%s", name, age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

class Student extends Human{
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		
		this.major = major;
	}

	@Override
	public String toString() {
		return String.format("%s, major=%s", 
				super.toString(), this.getMajor());
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}