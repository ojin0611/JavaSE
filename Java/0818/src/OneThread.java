public class OneThread {
	public static void main(String[] args) {
		OneThread ot = new OneThread();
		ot.run();
		for(int i = 0 ;i < 10 ;i++) System.out.println("main() --> " + i);
	}
	void run() {
		for(int i = 0 ;i < 10 ;i++) System.out.println("run() --> " + i);
	}
}
