import java.util.Scanner;
import java.util.Vector;

class Input {
	private Vector<Friend> vector;
	private Scanner scan;

	Input(Vector<Friend> vector) {
		this.vector = vector;
		this.scan = new Scanner(System.in);
	}

	void input() {
		System.out.println("<<친구 추가 창>>");
		System.out.print("이름 : ");     String name = this.scan.next();
		System.out.print("전화번호 : ");    String tel = this.scan.next();
		System.out.print("관계 : ");      String relation = this.scan.next();
		Friend f = new Friend(name, tel, relation);
		this.vector.addElement(f);
	}
	
	
}
