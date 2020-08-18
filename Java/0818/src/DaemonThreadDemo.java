public class DaemonThreadDemo implements Runnable{
	// ���ѷ����ȿ��� 0.5�ʾ� ���鼭 ���󾲷��尡 �������Դϴٸ� ����ϵ��� run()�޼ҵ带 �ۼ�
    @Override
    public void run() {
        while (true) {
            System.out.println("���� �����尡 �������Դϴ�.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break; //Exception�߻��� while �� �������� 
            }
        }
    }
	public static void main(String[] args) {
        // Runnable�� �����ϴ� DaemonThread�� �����ϱ� ���Ͽ� Thread ����
        Thread t = new Thread(new DaemonThreadDemo());
        t.setDaemon(true);
        t.start();

        // ���� �����尡 5�ʵڿ� ����ǵ��� ����. 
        // ���󾲷���� �ٸ� �����尡 ��� ����Ǹ� �ڵ�����.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
        System.out.println("���� �����尡 ����˴ϴ�. ");    
    } 
}
