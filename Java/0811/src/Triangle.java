
public class Triangle extends Shape {
	private int base, height;
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	public void calcArea() {
		System.out.println("������ = " + this.base * this.height * 0.5);
		
	}

	@Override
	public String toString() {
		return String.format("�غ� = %d, ���� = %d", base, height);
	}

}
