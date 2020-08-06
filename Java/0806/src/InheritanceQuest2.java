
public class InheritanceQuest2 {
	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		System.out.println(obj1.getRadius());
		System.out.println(obj1.getHeight());
		
		Cylinder obj2 = new Cylinder(5.0, 3.0);
		System.out.println(obj2.getVolume());
	}
}

class Circle{
	private static double radius;
	private String color;
	
	public Circle() {
		// this.radius = 0.;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.pow(radius, Math.PI);
	}
	
	
	
}

class Cylinder extends Circle{
	private double height;

		
	public Cylinder() {
		super();
	}

	public Cylinder(double radius) {
		super(radius);
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return this.getArea() * this.getHeight();
	}
}