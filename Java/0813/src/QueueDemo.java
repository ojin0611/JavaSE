import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		String [] array = {"Java", "Python", "Oracle", "MariaDB"};
		for(String str : array)   queue.offer(str);
		System.out.println("�̾Ҵ��� "+queue.poll() + ", size= " + queue.size());
		System.out.println("�̾Ҵ��� "+queue.poll() + ", size= " + queue.size());
		
		System.out.println("��´�� "+queue.peek() + ", size= " + queue.size());
		queue.add("C++");
		System.out.println("C++ �ڿ� �־�帲");
		System.out.println("�̾Ҵ��� "+queue.poll() + ", size= " + queue.size());
		
		Iterator<String> iters = queue.iterator();
		while(iters.hasNext()) {
			System.out.println(iters.next());
		}
	}
}