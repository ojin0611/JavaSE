
public class Car implements Comparable<Car>{
	private String name, maker;
	int price;
	public Car(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
	}
	
	@Override
	public String toString() {
		return String.format("\nCar [name=%s, maker=%s, price=%s]", name, maker, price);
	}

	@Override
	public int compareTo(Car other) {
		// 오름차순
		if (this.price > other.price) return 1;
		else if (this.price < other.price) return -1;
		else return 0;
	}
	
	
}
