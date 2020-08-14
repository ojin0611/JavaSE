import java.util.Vector;

class Output {
	private Vector<Friend> vector;

	Output(Vector<Friend> vector) {
		this.vector = vector;
	}
	
	void output() {
		for(Friend f : this.vector)   System.out.println(f);  //f.toString()
	}
}
