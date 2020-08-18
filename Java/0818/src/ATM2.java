public class ATM2 implements Runnable{
	private int balance;
	public ATM2() {
		this.balance = 10000;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			synchronized (this) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				if(this.balance > 0)  withdraw(1000);
				else break;
				if(this.balance == 2000 || this.balance == 4000 ||
						this.balance == 6000 || this.balance ==8000)
					try {
						this.wait();
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				else this.notify();
			} 
		}
	}
	private void withdraw(int howmuch) {
		this.balance -= howmuch;
		System.out.print("[" + Thread.currentThread().getName() + "]");
		System.out.println(this.balance + "≥≤æ“¿Ω.");
	}
}
