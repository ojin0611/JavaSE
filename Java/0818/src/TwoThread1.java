
public class TwoThread1 implements Runnable{
	private Thread thread;
	TwoThread1(String name){
		this.thread = new Thread(this, name);
		this.thread.start();
	}
	public static void main(String[] args) {
		TwoThread1 tt = new TwoThread1("MyThread");
		for(int i = 0 ;i < 10 ;i++) 
			System.out.println(Thread.currentThread().getName() + " --> " + i);
	}
	@Override
	public void run() {
		//CPU�� �۾��ؾ� �� �ڵ�
		for(int i = 0 ;i < 10 ;i++) 
			System.out.println(Thread.currentThread().getName() + " --> " + i);
	}

}
