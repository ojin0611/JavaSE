public class JoinDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread() {   //�͸� Ŭ����
			@Override
			public void run() {
				try {
					Thread.sleep(10000);
				}catch(InterruptedException ex) {}
				System.out.println("thread ��.");
			}
		};
		t1.start();
		try {
			Thread.sleep(1000);  //1��
			t1.join();//t1 thread�� ���������� ������ ���
		}catch(InterruptedException ex) {}
		System.out.println("main thread ��.");
	}
}
