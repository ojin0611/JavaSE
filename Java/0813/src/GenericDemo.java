import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericDemo {
	public static void main(String[] args) {
		Demo<Integer> d = new Demo<Integer>(10);
		int su = d.getCount();
		System.out.println(su);
		
		d.setCount(100);
		System.out.println(d.getCount());
		
		
		List<Integer> intList = Arrays.asList(4,5,6,7,8);
		System.out.println(intList.toString());
		
	}
}

class Demo<T>{
	private T count;
	public Demo(T count) {
		this.count = count;
	}
	public T getCount() {return this.count;}
	public void setCount(T count) {this.count = count;}
}