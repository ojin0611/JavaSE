
public class DestructorDemo {
	public static void main(String[] args) {
		Box1 box = new Box1();
		// java.lang.Object 가 모든 클래스의 부모 클래스
		// box. 하면 나오는 메소드들은 Object 클래스의 메소드!!!
		box = null;
		System.gc(); // box가 필요없어졌으니까 finalize 실행된다.

	}
}

class Box1{
	public Box1() { // Overriding constructor
		System.out.println("객체 생성됨");
	}
	
	
	// Object.finalize() 는 protected method기때문에 main 클래스에서 사용하면 안됨. 
	protected void finalize() { // destructor
		System.out.println("객체 소멸됨");
	}
}