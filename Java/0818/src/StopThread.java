/*
 * Thread�� �����ϰ� stop ���
 * - stop() ���Ұ�
 * 1. boolean�� ������ �̿��ϴ� ��� --> main���� stop�ص� �ٷ� stop�Ѵٴ� ������ ����.
 * 2. Exception�� �̿��ϴ� ���
 */
public class StopThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();         
		Thread t = new Thread(mt);
		t.start();
		System.out.println("��� Thread�� start �߽��ϴ�.");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ex) {}
		System.out.println("���� main�� Thread�� stop�ϰڽ��ϴ�.");
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