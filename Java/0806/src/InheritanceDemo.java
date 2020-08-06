
public class InheritanceDemo {

	public static void main(String[] args) {
		Car car = new Car(100, 25_000_000);
		/*
		car.speed = 100;
		car.price = 25_000_000;
		car.name = "Sonata";
		*/
		car.name = "Sonata";
		
		car.run();
		
		/* ********************************** */
		
		SportsCar sportsCar = new SportsCar();
		Car.name = "Ferari"; // static으로 선언했기때문에 전역변수

		sportsCar.turbo = true;
		sportsCar.run();
	}

}
