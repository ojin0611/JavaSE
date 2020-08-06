/*
 * this의 용법 3가지
 * 1. this.  : 나의 멤버변수와 멤버메소드를 명시적으로 지칭하고자할 때
 * 2. this()
 * 3. this
 * 
 * super의 용법 2가지
 * 1. super. : 부모의 멤버변수와 멤버메소드를 명시적으로 지칭하고자할 때
 * 2. super()
 */
public class SuperDemo {
	public static void main(String[] args) {
		Child2 child2 = new Child2();
		System.out.println(child2.name);
		child2.print();
	}
}

class Parent2{
	String name = "한지민";
	
	public void print() {
		System.out.println("부모 메소드");
	}
}

class Child2 extends Parent2{
	String name = "박지민";
	
	@Override // 의도를 갖고 재정의했다 라는 뜻
	public void print() { //overshadow. 잘 안쓰임
		System.out.println("자식 메소드");
		System.out.println("child name = " + this.name);
		System.out.println("parent name = "+ super.name);
	}
}