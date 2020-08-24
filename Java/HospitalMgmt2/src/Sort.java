import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

class Sort {
	private Vector<Patient> vector;

	Sort(Vector<Patient> vector){
		this.vector = vector;
	}

	void sort(){
		Collections.sort(this.vector, new Comparator<Patient>() {
			@Override
			public int compare(Patient o1, Patient o2) {
				return (o1.getJinryobi() > o2.getJinryobi()) ? -1 :
								(o1.getJinryobi() < o2.getJinryobi()) ? 1 : 0;
			}
		});
	}
}