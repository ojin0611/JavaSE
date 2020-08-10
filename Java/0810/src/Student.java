
public class Student implements Comparable <Student>{
	String name;
	int tot;
	double avg;
	public Student(String name, int tot, double avg) {
		super();
		this.name = name;
		this.tot = tot;
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return String.format("Student [name=%s, tot=%s, avg=%s]", name, tot, avg);
	}

	@Override
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
	}
	
	
}
