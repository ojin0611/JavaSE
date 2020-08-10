
public class InterfaceDemo2 implements Father, Mother {

	@Override
	public void grandFather() {
		System.out.println("gF()");
	}

	@Override
	public void grandMother() {
		System.out.println("gM()");
	}

	@Override
	public void mother() {
		System.out.println("m()");
	}

	@Override
	public void father() {
		System.out.println("f()");
	}
	
	public static void main(String[] args) {
		GrandFather gf = new InterfaceDemo2();
		gf.grandFather(); // 할아버지주소로 할아버지메소드만 접근가능
		// gf.grandMother(); //error
		
		InterfaceDemo2 id = new InterfaceDemo2();
		GrandMother gm = id; 
		gm.grandMother(); // 다른 id의 메소드는 접근불가
		
		Father fa = new InterfaceDemo2();
		fa.grandMother(); // 본인의 추상메소드를 재정의한 메소드만 접근가능
		
		Mother[] array = new Mother[2]; // 인터페이스 배열에는 그 인터페이스의 자식클래스가 멤버
		array[0] = id;
		array[1] = new InterfaceDemo2();
		for (Mother m : array) {
			m.mother();
		}
	}

}
