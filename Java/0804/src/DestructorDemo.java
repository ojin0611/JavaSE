
public class DestructorDemo {
	public static void main(String[] args) {
		Box1 box = new Box1();
		// java.lang.Object �� ��� Ŭ������ �θ� Ŭ����
		// box. �ϸ� ������ �޼ҵ���� Object Ŭ������ �޼ҵ�!!!
		box = null;
		System.gc(); // box�� �ʿ���������ϱ� finalize ����ȴ�.

	}
}

class Box1{
	public Box1() { // Overriding constructor
		System.out.println("��ü ������");
	}
	
	
	// Object.finalize() �� protected method�⶧���� main Ŭ�������� ����ϸ� �ȵ�. 
	protected void finalize() { // destructor
		System.out.println("��ü �Ҹ��");
	}
}