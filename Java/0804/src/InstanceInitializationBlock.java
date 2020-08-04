
public class InstanceInitializationBlock {
	public static void main(String[] args) {
		Car car = new Car();
		car.print();
	}
}

class Car{
	// 명시적 초기화
	private String name1 = "소나타"; 
	
	private String name2;
	// 생성자
	public Car() {
		this.name2 = "렉서스";
	}
	
	// 초기화 블럭
	// 블럭에 이름이 없어서 호출할 수 없지만 생성자보다 먼저 호출된다. 
	{
		System.out.println("초기화 블럭");
		 this.name2 = "카니발";
	}
	
	public void print() {
		System.out.println("name2 = "+this.name2); // 카니발 저장된 후에 렉서스가 저장됨
	}
}
