/*
 * Constant ���
 * 1. ���� ���
 * 2. ��� ���
 * 3. Ŭ���� ���
 * */

public class FinalDemo {
	final double PI; // instance constant
	public FinalDemo() {
		this.PI = 3.14;
	}
	
	static final int ENG; // class constant
	static {
		ENG = 90;
	}
	
	public static void main(String[] args) {
		final String NAME = "������"; // local constant
		// NAME = "������"; //error. �� ���ٲ�
		
		
	}
}
