
public class Output {
	private Account[] array;

	public Output(Account[] array) {
		this.array = array;
	}
	
	public void output() {
		for(Account acc:this.array) acc.print();
	}
}
