
public class Patient {
	private int no;
	private String code;
	private int days;
	private int age;
	private String department; // 진찰부서
	private int checkFee;      // 진찰비
	private int admissionFee;  // 입원비
	private int totalFee;      // 진료비
	
	public Patient() {
		this(0, "MI", 0, 0);
	}
	
	public Patient(int no, String code, int days, int age) {
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getCheckFee() {
		return checkFee;
	}

	public void setCheckFee(int checkFee) {
		this.checkFee = checkFee;
	}

	public int getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(int admissionFee) {
		this.admissionFee = admissionFee;
	}

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	
}
