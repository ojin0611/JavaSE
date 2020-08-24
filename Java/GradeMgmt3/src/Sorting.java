import java.util.ArrayList;
import java.util.Collections;

class Sorting {
	private ArrayList<Student> list;
	
	Sorting(ArrayList<Student> list) {
		this.list = list;
	}

	void sort() {
		Collections.sort(list, (s1, s2) -> (s1.getTot() > s2.getTot()) ? -1 : (s1.getTot() < s2.getTot()) ? 1 : 0);
	}
}
