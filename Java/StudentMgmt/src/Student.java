class Student {
    private String name;
    private String hakbun;
    private String dept;
    private int grade;
    private int point;
	public Student(String name, String hakbun, String dept, int grade, int point) {
		this.name = name;
		this.hakbun = hakbun;
		this.dept = dept;
		this.grade = grade;
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	//String name, String hakbun, String dept, int grade, int point
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%d\t%d\t", name, hakbun, dept, grade, point);
	}
    
}
