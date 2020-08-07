/*
 * instanceof 용법
 * 1. 부모형 참조변수로 자식클래스(원형) 알고자할 때
 * 2. 부모형이 자식형으로 강제형변환 가능여부 알고자할 때
 */
public class CarCenter {
	public static void main(String[] args) {
		CarCenter cc= new CarCenter();
		Sonata sonata = new Sonata("Silver Son");
		cc.repair(sonata);
		Carnival carnival = new Carnival("White Carn");
		cc.repair(carnival);
	}
	/*
	void repair(Sonata sonata) {
		System.out.println(sonata + " 수리됨");
	}
	*/

	void repair(Car car) {
		System.out.println(car + " 수리 완료");
	}

}
