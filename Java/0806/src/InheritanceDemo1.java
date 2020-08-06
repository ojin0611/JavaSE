
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Child child1 = new Child(); // 부모클래스를 만든 후에 자식클래스가 만들어진다.
		Child child2 = new Child(24); // 자식의 기본생성자 아니여도 부모의 기본생성자 호출됨.
	}
}

class Parent{
	public Parent() { System.out.println("부모클래스 생성완료");}
	public Parent(int age) { System.out.println("부모클래스 생성완료2");}
}

class Child extends Parent{
	public Child() { System.out.println("자식클래스 생성완료"); }
	public Child(int age) { 
		super(50);
		System.out.println("자식클래스 생성완료2"); 
	}
}
