
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
		System.out.println("면적은 = " + this.length * this.width);
	}

	@Override
	public String toString() {
		return String.format("가로 = %d, 세로 = %d", width, length);
	}

}
