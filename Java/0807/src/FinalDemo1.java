
public class FinalDemo1 {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.print();
	}
}

class Super{
	public final void print() { // override 하지마세요
		System.out.println("부모메소드");
	}
}

class Sub extends Super{
	// @Override 할 수 없어. print()는 부모 클래스에서 final이기때문에!
	// public void print() { System.out.println("자식메소드");}
	
	
}