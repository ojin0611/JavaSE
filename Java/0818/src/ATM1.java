public class ATM1 implements Runnable{
	private int balance;
	public ATM1() {
		this.balance = 10000;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			synchronized (this) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				if(this.balance > 0)  withdraw(1000);
				else break;
			} 
		}
	}
	private void withdraw(int howmuch) {
		this.balance -= howmuch;
		System.out.print("[" + Thread.currentThread().getName() + "]");
		System.out.println(this.balance + "≥≤æ“¿Ω.");
	}
}
