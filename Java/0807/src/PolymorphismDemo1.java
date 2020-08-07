//Heterogeneous Collection

public class PolymorphismDemo1 { 
	public static void main(String[] args) {
		Car[] array = new Car[4];
		
		array[0] = new Matiz("Silver Matiz");
		array[1] = new Sonata("Black Sonata");
		array[2] = new Carnival("White Carnival");
		
		
		Car[] array2 = {new Matiz("Silver M"), 
				new Sonata("Black S"), new Carnival("White C")};
		for (Car car: array2) {
			System.out.println(car); // car.toString()
		}
		
		Mammal [] array3 = new Mammal[5];
		array3[0] = new Dog(); 
		array3[1] = new Korean();
		array3[2] = new American();
		
		// 이런것도 되지만 실제로는 잘 안씀
		Object [] array4 = new Object[10];
		array4[0] = new String("Hello");
		array4[1] = new Sonata("Blue Sonata");
		array4[2] = new Dog();
	}
}
