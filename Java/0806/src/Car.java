// 생략된 부분 : import java.lang.Object;
public class Car /*extends Object*/{
	private int speed;
	// private int speed; 인 경우 상속할 수 없다.
	private int price; 
	public static String name;
	
	public Car(int speed, int price){
		// private인 경우 메소드로만 값에 접근할 수 있다. 생성자도 특별한 "메소드"기때문에 생성자로 값을 변경해줄 수 있다.
		this.speed = speed;
		this.price = price;
	}
	
	public void run() {
		System.out.println("(" + price + "원짜리) "+ name + "이(가) "+ speed + "km/h 의 속도로 주행중");
	}
}
