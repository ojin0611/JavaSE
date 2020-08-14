import java.util.Vector;

public class Output {
	private Vector<Telephone> vector;
	
	public Output(Vector<Telephone> vector) {
		this.vector = vector;
	}

	public void output() {
		for(Telephone phone : this.vector) {
			phone.print();
		}
	}

}
