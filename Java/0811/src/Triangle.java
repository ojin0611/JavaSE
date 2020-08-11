
public class Triangle extends Shape {
	private int base, height;
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	public void calcArea() {
		System.out.println("면적은 = " + this.base * this.height * 0.5);
		
	}

	@Override
	public String toString() {
		return String.format("밑변 = %d, 높이 = %d", base, height);
	}

}
