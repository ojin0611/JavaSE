
public class FinalDemo1 {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.print();
	}
}

class Super{
	public final void print() { // override ����������
		System.out.println("�θ�޼ҵ�");
	}
}

class Sub extends Super{
	// @Override �� �� ����. print()�� �θ� Ŭ�������� final�̱⶧����!
	// public void print() { System.out.println("�ڽĸ޼ҵ�");}
	
	
}