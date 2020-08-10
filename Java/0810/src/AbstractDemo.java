
public class AbstractDemo {
	public static void main(String[] args) {
		Mammal m; // 추상화클래스도 선언은 가능하다.
		// m = new Mammal(); // 추상화클래스는 인스턴스로만들 수 없다.
		m = new Lion("Simba"); // 실제 클래스인 Lion은 인스턴스생성가능

		m.print();
	}
}
