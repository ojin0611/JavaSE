import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String[] array = {"Java","Python","Oracle","MariaDB"};
		for(String str: array) {
			stack.push(str);
			System.out.println(stack);
		}
		
		Iterator<String> iters = stack.iterator();
		while(iters.hasNext()) {
			System.out.println(iters.next());
		}
	}
}
