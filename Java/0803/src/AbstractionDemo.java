
public class AbstractionDemo {
	public static void main(String[] args) {
		Car sonata; // 참조변수 선언
		sonata = new Car();
		
		sonata.name = "Son";
		sonata.maker = "Hyun";
		sonata.color = "Silver";
		sonata.price = 25_000_000;
		
		sonata.print(); // call해줘야 나타난다. 김춘수의 꽃 예시
		
		Car carnival = new Car();
		carnival.name = "카니";
		carnival.maker = "KIA";
		carnival.color = "Black";
		carnival.price = 3500_0000;
		carnival.print();
	}
}
