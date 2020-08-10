/*
 * 인터페이스는 추상클래스의 일종이기 때문에new로 인스턴스화할 수 없다.
 * 인터페이스의 멤버는 static 상수라 수정할 수 없고, interface 이름으로 접근해야한다.
 * 
 * */

public class InterfaceDemo1 {
	public static void main(String[] args) {
		//Datable d = new Datable(); //error 추상클래스임
		Datable d = new Date();
		d.set(Datable.FRI); //클래스상수라 클래스명(인터페이스명)으로 접근
		System.out.println(d.get());
	}
}
