import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] {5,7,2,4,9,3,4,5,6,67,8});
		ArrayList<Integer> alist = new ArrayList(list);
		System.out.println(alist.size());
		System.out.println(alist);
	}
}