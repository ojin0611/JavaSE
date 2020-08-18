public class SynchronizationDemo {
	public static void main(String[] args) {
		ATM2 atm = new ATM2();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		son.start();
		mother.start();
	}
}
