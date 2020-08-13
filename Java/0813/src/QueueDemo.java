import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		String [] array = {"Java", "Python", "Oracle", "MariaDB"};
		for(String str : array)   queue.offer(str);
		System.out.println("뽑았더니 "+queue.poll() + ", size= " + queue.size());
		System.out.println("뽑았더니 "+queue.poll() + ", size= " + queue.size());
		
		System.out.println("출력대기 "+queue.peek() + ", size= " + queue.size());
		queue.add("C++");
		System.out.println("C++ 뒤에 넣어드림");
		System.out.println("뽑았더니 "+queue.poll() + ", size= " + queue.size());
		
		Iterator<String> iters = queue.iterator();
		while(iters.hasNext()) {
			System.out.println(iters.next());
		}
	}
}