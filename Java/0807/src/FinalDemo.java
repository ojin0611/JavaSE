/*
 * Constant 상수
 * 1. 지역 상수
 * 2. 멤버 상수
 * 3. 클래스 상수
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
		final String NAME = "한지민"; // local constant
		// NAME = "김지민"; //error. 값 못바꿈
		
		
	}
}
