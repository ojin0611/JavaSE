// ������ �κ� : import java.lang.Object;
public class Car /*extends Object*/{
	private int speed;
	// private int speed; �� ��� ����� �� ����.
	private int price; 
	public static String name;
	
	public Car(int speed, int price){
		// private�� ��� �޼ҵ�θ� ���� ������ �� �ִ�. �����ڵ� Ư���� "�޼ҵ�"�⶧���� �����ڷ� ���� �������� �� �ִ�.
		this.speed = speed;
		this.price = price;
	}
	
	public void run() {
		System.out.println("(" + price + "��¥��) "+ name + "��(��) "+ speed + "km/h �� �ӵ��� ������");
	}
}
