
public class Box {
	private int length, width, height;
		
	public Box(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public int getVolume() {
		return length * width * height;
	}

	@Override
	public String toString() {
		return String.format("length=%s, width=%s, height=%s", length, width, height);
	}
	
	
}

