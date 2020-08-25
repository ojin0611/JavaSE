import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,7,1,2,9,3,8,2,5);
		//���� �ڵ�
		/*Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2) * -1;
			}
		});*/
		//Collections.sort(list, (a, b) -> a.compareTo(b) * -1);
		//System.out.println(Arrays.toString(list.toArray()));
		/* List<String> list = Arrays.asList("Hello", "Java", "oracle", 
				       "apple", "������", "������" ,"������", "123");
		*/
		Collections.sort(list, (a, b) -> a.compareTo(b) * -1);
		System.out.println(Arrays.toString(list.toArray()));
	}
}
