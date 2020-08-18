public class DaemonThreadDemo implements Runnable{
	// 무한루프안에서 0.5초씩 쉬면서 데몬쓰레드가 실행중입니다를 출력하도록 run()메소드를 작성
    @Override
    public void run() {
        while (true) {
            System.out.println("데몬 쓰레드가 실행중입니다.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break; //Exception발생시 while 문 빠지도록 
            }
        }
    }
	public static void main(String[] args) {
        // Runnable을 구현하는 DaemonThread를 실행하기 위하여 Thread 생성
        Thread t = new Thread(new DaemonThreadDemo());
        t.setDaemon(true);
        t.start();

        // 메인 쓰레드가 5초뒤에 종료되도록 설정. 
        // 데몬쓰레드는 다른 쓰레드가 모두 종료되면 자동종료.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
        System.out.println("메인 쓰레드가 종료됩니다. ");    
    } 
}
