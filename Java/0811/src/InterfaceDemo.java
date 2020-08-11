import java.util.Arrays;

public class InterfaceDemo {
	public static void main(String[] args) {
		Car[] array = new Car[4];
		
		array[0] = new Car("소나타", 25_000_000, "현대자동차");
		array[1] = new Car("마티즈", 10_000_000, "대우자동차");
		array[2] = new Car("카니발", 35_000_000, "기아자동차");
		array[3] = new Car("SM6", 30_000_000, "르노삼성자동차");
	
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
	
}
