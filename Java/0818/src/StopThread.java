/*
 * Thread를 안전하게 stop 방법
 * - stop() 사용불가
 * 1. boolean형 변수를 이용하는 방법 --> main에서 stop해도 바로 stop한다는 보장이 없다.
 * 2. Exception을 이용하는 방법
 */
public class StopThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();         
		Thread t = new Thread(mt);
		t.start();
		System.out.println("방금 Thread를 start 했습니다.");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ex) {}
		System.out.println("지금 main이 Thread를 stop하겠습니다.");
		mt.stop();
	}
}
class MyThread implements Runnable{
	private boolean isStop = false;
	void stop() {
		this.isStop = true;
	}
	@Override
	public void run() {
		while(! isStop) {
			try {
				Thread.sleep(100);  //0.001
			}catch(InterruptedException ex) {}
			System.out.println("I'm alive.");
			
			
			
			
			
			if(this.isStop) break;
		}
		System.out.println("I'm dead...");
	}
}