// 추상클래스의 목적 : 다형성의 강제화
public abstract class Mammal { // 실제로 존재하지않는 클래스
	public String name = "Mamma";
	public Mammal(String name) {
		this.name = name;
	}
	public abstract void print(); //선언만 함. 메소드재정의(Override)안하면 에러
}

class Lion extends Mammal{
	public Lion(String name) {
		super(name);
	}
	
	@Override
	public void print() {
		System.out.println("자식메소드");
	}
}

