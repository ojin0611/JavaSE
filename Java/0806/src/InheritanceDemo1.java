
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Child child1 = new Child(); // �θ�Ŭ������ ���� �Ŀ� �ڽ�Ŭ������ ���������.
		Child child2 = new Child(24); // �ڽ��� �⺻������ �ƴϿ��� �θ��� �⺻������ ȣ���.
	}
}

class Parent{
	public Parent() { System.out.println("�θ�Ŭ���� �����Ϸ�");}
	public Parent(int age) { System.out.println("�θ�Ŭ���� �����Ϸ�2");}
}

class Child extends Parent{
	public Child() { System.out.println("�ڽ�Ŭ���� �����Ϸ�"); }
	public Child(int age) { 
		super(50);
		System.out.println("�ڽ�Ŭ���� �����Ϸ�2"); 
	}
}
