
public class Patient {
	private int no, days, age, jinchalbi, ibwonbi, jinryobi;
	private String code, department;
	
	
	public Patient(int no, String code, int days, int age) {
		super();
		this.no = no;
		this.code = code;
		this.days = days;
		this.age = age;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJinchalbi() {
		return jinchalbi;
	}
	public void setJinchalbi(int jinchalbi) {
		this.jinchalbi = jinchalbi;
	}
	public int getIbwonbi() {
		return ibwonbi;
	}
	public void setIbwonbi(int ibwonbi) {
		this.ibwonbi = ibwonbi;
	}
	public int getJinryobi() {
		return jinryobi;
	}
	public void setJinryobi(int jinryobi) {
		this.jinryobi = jinryobi;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return String.format("%s\t\t%s\t\t%s\t\t%s\t\t%s", no, department,
				jinchalbi, ibwonbi, jinryobi);
	}
	
	
	
}
