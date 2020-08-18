/*
 * Thread 积己 规过 2啊瘤
 * 1. Thread extends
 * 2. Runnable implements
 */
public class CreateThread extends Thread{
	CreateThread(String name){
		super(name);
	}
	public static void main(String[] args) {
		CreateThread ct1 = new CreateThread("Sally");
		CreateThread ct2 = new CreateThread("Duncan");
		ct1.start();   ct2.start();
	}
	@Override
	public void run() {
		for(int i = 0 ;i < 10 ;i++) 
			System.out.println(Thread.currentThread().getName() + " --> " + i);
	}
}
