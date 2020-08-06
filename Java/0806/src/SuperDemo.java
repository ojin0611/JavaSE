/*
 * this�� ��� 3����
 * 1. this.  : ���� ��������� ����޼ҵ带 ��������� ��Ī�ϰ����� ��
 * 2. this()
 * 3. this
 * 
 * super�� ��� 2����
 * 1. super. : �θ��� ��������� ����޼ҵ带 ��������� ��Ī�ϰ����� ��
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
	String name = "������";
	
	public void print() {
		System.out.println("�θ� �޼ҵ�");
	}
}

class Child2 extends Parent2{
	String name = "������";
	
	@Override // �ǵ��� ���� �������ߴ� ��� ��
	public void print() { //overshadow. �� �Ⱦ���
		System.out.println("�ڽ� �޼ҵ�");
		System.out.println("child name = " + this.name);
		System.out.println("parent name = "+ super.name);
	}
}