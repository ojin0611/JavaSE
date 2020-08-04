
public class ConstructorDemo2 {
	public static void main(String[] args) {
		Box b = new Box();
		System.out.println(b.getWidth());
		
		Box box=new Box(10,50,100);
		System.out.println(box.getLength());
	}
}


class Box{
	// �������� ������ �ʵ�, ������, �޼���
	int height, width, length;

	public Box(int height, int width, int length) {
		// super();
		this.height = height;
		this.width = width;
		this.length = length;
	}

	public Box() {
		// TODO Auto-generated constructor stub
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
