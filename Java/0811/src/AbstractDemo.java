
public class AbstractDemo {
	public static void main(String[] args) {
		Shape[] array = new Shape[3];
		array[0] = new Rectangle("yellow", 100, 200);
		array[1] = new Triangle("blue",50,300);
		array[2] = new Circle("red", 80);
		for(Shape s: array) {
			s.calcArea();
			System.out.println(s);
		}
	}
}
