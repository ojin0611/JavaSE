/*
 * Thread�� �����ϰ� stop ���
 * - stop() ���Ұ�
 * 1. boolean�� ������ �̿��ϴ� ��� --> main���� stop�ص� �ٷ� stop�Ѵٴ� ������ ����.
 * 2. Exception�� �̿��ϴ� ���
 */
public class StopThread1 {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();         Thread t = new Thread(mt);
		t.start();
		System.out.println("��� Thread�� start �߽��ϴ�.");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {}
		System.out.println("���� main�� Thread�� stop�ϰڽ��ϴ�.");
		t.interrupt();
	}
}
class MyThread1 implements Runnable{
	@Override
	public void run() {
		try {
			//while(true) {
			while(Thread.currentThread().isInterrupted()) {
				Thread.sleep(1);  //0.001
				System.out.println("I'm alive.");
			}
		}catch(InterruptedException ex) {
			System.out.println("I'm dead...");
		}
	}
}