
public class Rectangle extends Shape {
	private int length;
	private int width;
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public void calcArea() {
		System.out.println("������ = " + this.length * this.width);
	}

	@Override
	public String toString() {
		return String.format("���� = %d, ���� = %d", width, length);
	}

}
