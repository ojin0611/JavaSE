
public class AbstractionDemo1 {
	public static void main(String[] args) {
		Car[] array;
		array = new Car[3]; // 그냥 생성이다. 아직 array[i]에 Car가 할당되지 않았어!
		for (int i = 0; i < array.length; i++) {
			array[i] = new Car();
			
		}
		
		array[0].name = "소나타";
		array[1].name = "카닙";
		array[2].name = "맡";

	}

}
