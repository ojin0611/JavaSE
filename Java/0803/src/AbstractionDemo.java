
public class AbstractionDemo {
	public static void main(String[] args) {
		Car sonata; // �������� ����
		sonata = new Car();
		
		sonata.name = "Son";
		sonata.maker = "Hyun";
		sonata.color = "Silver";
		sonata.price = 25_000_000;
		
		sonata.print(); // call����� ��Ÿ����. ������� �� ����
		
		Car carnival = new Car();
		carnival.name = "ī��";
		carnival.maker = "KIA";
		carnival.color = "Black";
		carnival.price = 3500_0000;
		carnival.print();
	}
}
