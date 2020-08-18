public class TwoThread extends Thread{
	public static void main(String[] args) {
		TwoThread tt = new TwoThread();
		tt.start();    //tt.run();
		for(int i = 0 ;i < 10 ;i++) 
			System.out.println(Thread.currentThread().getName() + " --> " + i);
	}
	@Override
	public void run() {
		for(int i = 0 ;i < 10 ;i++) 
			System.out.println(Thread.currentThread().getName() + " --> " + i);
	}
}
