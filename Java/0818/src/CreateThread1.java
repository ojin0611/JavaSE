import java.awt.Frame;

/*
 * Thread 积己 规过 2啊瘤
 * 1. Thread extends
 * 2. Runnable implements
 */
public class CreateThread1 extends Frame implements Runnable{
	public static void main(String[] args) {
		CreateThread1 ct1 = new CreateThread1();
		CreateThread1 ct2 = new CreateThread1();
		Thread t1 = new Thread(ct1, "Sally");
		Thread t2 = new Thread(ct2, "Duncan");
		t1.start();   t2.start();
	}
	@Override
	public void run() {
		for(int i = 0 ;i < 10 ;i++) 
			System.out.println(Thread.currentThread().getName() + " --> " + i);
	}
}
